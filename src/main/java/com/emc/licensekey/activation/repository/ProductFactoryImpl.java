package com.emc.licensekey.activation.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emc.licensekey.activation.dao.ProductDAO;
import com.emc.licensekey.activation.domain.AutoActivateProduct;
import com.emc.licensekey.activation.domain.CertificatesProduct;
import com.emc.licensekey.activation.domain.LicenseKeyProduct;
import com.emc.licensekey.activation.domain.Product;
import com.emc.licensekey.activation.domain.ProductActivationType;
import com.emc.licensekey.activation.domain.ProductDetail;

@Service
public class ProductFactoryImpl implements ProductFactory{

	@Autowired
	private ProductDAO productDao;
	
	@Override
	public Product createProductFromProductId(String productId) {
		List<String> productValues = productDao.getProductDetailsFromId(productId);
		
		String productName = productValues.get(0);
		int totalQty =  new Integer(productValues.get(1));
		int activeQty = new Integer(productValues.get(2));
		int availableQty = totalQty - activeQty;		
		String licenseKeyType = productValues.get(3);
		Product product = null;
		
		if(licenseKeyType.equals(ProductActivationType.LiceneseKey.getValue()))
		{
			product = new LicenseKeyProduct();
			
		}else if(licenseKeyType.equals(ProductActivationType.Certificates.getValue()))
		{
			product = new CertificatesProduct();
		}else{
			product = new AutoActivateProduct();			
		}
		ProductDetail productDetail = new ProductDetail();
		productDetail.setName(productName);
		productDetail.setTotalQty(totalQty);
		productDetail.setActiveQty(activeQty);
		productDetail.setAvailableQty(availableQty);
		productDetail.setId(productId);
		product.setProductDetail(productDetail);
		
		return product;
	}

	@Override
	public List<Product> createProductFromProductList(List<String> productList) {
		List<Product> lacProduct = new ArrayList<Product>();
	
		for(String productId:productList)
		{
			lacProduct.add(createProductFromProductId(productId));
		}
		return lacProduct;
	}
}