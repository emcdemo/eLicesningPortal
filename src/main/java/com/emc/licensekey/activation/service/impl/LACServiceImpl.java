package com.emc.licensekey.activation.service.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.emc.licensekey.activation.dao.LACDao;
import com.emc.licensekey.activation.dao.LacProductDAO;
import com.emc.licensekey.activation.dao.ProductDAO;
import com.emc.licensekey.activation.dao.SiteDAO;
import com.emc.licensekey.activation.domain.ActivationDetails;
import com.emc.licensekey.activation.domain.LAC;
import com.emc.licensekey.activation.domain.Product;
import com.emc.licensekey.activation.repository.ProductFactory;
import com.emc.licensekey.activation.request.LacProductLicenseDetails;
import com.emc.licensekey.activation.request.LacProductSystemDetails;
import com.emc.licensekey.activation.service.LACService;


@Service
public class LACServiceImpl implements LACService{

	@Autowired
	private LACDao lacDao;
	
	@Autowired
	private LacProductDAO lacProductDao;
	
	@Autowired
	private ProductDAO productDao;
	
	@Autowired
	private ProductFactory productFactory;
	
	@Autowired
	private SiteDAO siteDAO;
	
	@Override
	public LAC getLacDetails(String lacId) {
		LAC lac = new LAC();
		lac.setId(lacId);
		List<Product> lacProducts = productFactory.createProductFromProductList(lacDao.getProductsFromId(lacId));
		HashMap<String, List<Object>> lacProductDetails = lacProductDao.getProductDetailsFromId(lacId);
		for(Product lacProdouct:lacProducts)
		{
			List<Object> licenseQtyDetails = lacProductDetails.get(lacProdouct.getProductDetail().getId());
			lacProdouct.getProductDetail().setTotalQty(new Integer(licenseQtyDetails.get(0).toString()));
			lacProdouct.getProductDetail().setActiveQty( ((List<ActivationDetails>)licenseQtyDetails.get(1)).size());
			lacProdouct.getProductDetail().setAvailableQty(lacProdouct.getProductDetail().getTotalQty()-lacProdouct.getProductDetail().getActiveQty());
		}
		lac.setProducts(lacProducts);
		lac.setFulFillmentDetails(lacDao.getFulFillmentDetailsFromId(lacId));
		return lac;
	}

	@Override
	public LacProductLicenseDetails getProductActivationDetails(String lac,
			String productId) {
		LacProductLicenseDetails lacProductLicenseDetails = new LacProductLicenseDetails();
		lacProductLicenseDetails.setName(productDao.getProduct(productId).get(0));		
		
		List<ActivationDetails> activationDetailList = lacProductDao.getProductActivationDetails(lac, productId);
		
		List<LacProductSystemDetails> activatedLicensesList = new ArrayList<LacProductSystemDetails>();
		
		for(ActivationDetails activationDetails:activationDetailList)
		{
			LacProductSystemDetails lacProductSystemDetails = new LacProductSystemDetails();
			lacProductSystemDetails.setBoundTo(siteDAO.getSystemNameFromSystemId(activationDetails.getSystemId()));
			lacProductSystemDetails.setActivationId(activationDetails.getActivationId());
			lacProductSystemDetails.setQty(1);
			lacProductSystemDetails.setUnits("seats");
			lacProductSystemDetails.setActivatedBy(activationDetails.getActivatedBy());
			lacProductSystemDetails.setActivatedOn(activationDetails.getActivatedOn());
			activatedLicensesList.add(lacProductSystemDetails);
		}
		lacProductLicenseDetails.setActivatedLicensesList(activatedLicensesList);
		
		return lacProductLicenseDetails;
	}
}