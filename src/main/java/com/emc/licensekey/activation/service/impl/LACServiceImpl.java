package com.emc.licensekey.activation.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.emc.licensekey.activation.dao.LACDao;
import com.emc.licensekey.activation.dao.LacProductDAO;
import com.emc.licensekey.activation.domain.LAC;
import com.emc.licensekey.activation.domain.Product;
import com.emc.licensekey.activation.repository.ProductFactory;
import com.emc.licensekey.activation.service.LACService;


@Service
public class LACServiceImpl implements LACService{

	@Autowired
	private LACDao lacDao;
	
	@Autowired
	private LacProductDAO lacProductDao;
	
	@Autowired
	private ProductFactory productFactory;
	
	@Override
	public LAC getLacDetails(String lacId) {
		LAC lac = new LAC();
		lac.setId(lacId);
		List<Product> lacProducts = productFactory.createProductFromProductList(lacDao.getProductsFromId(lacId));
		HashMap<String, List<String>> lacProductDetails = lacProductDao.getProductDetailsFromId(lacId);
		for(Product lacProdouct:lacProducts)
		{
			List<String> licenseQtyDetails = lacProductDetails.get(lacProdouct.getProductDetail().getId());
			lacProdouct.getProductDetail().setTotalQty(new Integer(licenseQtyDetails.get(0)));
			lacProdouct.getProductDetail().setActiveQty(new Integer(licenseQtyDetails.get(1)));
			lacProdouct.getProductDetail().setAvailableQty(lacProdouct.getProductDetail().getTotalQty()-lacProdouct.getProductDetail().getActiveQty());
		}
		lac.setProducts(lacProducts);
		lac.setFulFillmentDetails(lacDao.getFulFillmentDetailsFromId(lacId));
		return lac;
	}
}