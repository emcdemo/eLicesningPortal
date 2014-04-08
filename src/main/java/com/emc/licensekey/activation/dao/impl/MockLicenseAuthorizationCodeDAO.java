package com.emc.licensekey.activation.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emc.licensekey.activation.dao.LACDao;
import com.emc.licensekey.activation.dao.LacProductDAO;
import com.emc.licensekey.activation.domain.Fulfillment;
import com.emc.licensekey.activation.domain.Product;
import com.emc.licensekey.activation.domain.ProductDetail;
import com.emc.licensekey.activation.domain.SiteAddress;
import com.sun.org.apache.xerces.internal.impl.dv.xs.FullDVFactory;

@Service
public class MockLicenseAuthorizationCodeDAO implements LACDao{
	
	@Autowired
	LacProductDAO productDAO;
	
	private static HashMap<String, Fulfillment> lacfulfillmentDetails = new HashMap<String, Fulfillment>();
	private static HashMap<String, List<String>> lacProducts = new HashMap<String, List<String>>();
	
	@Override
	public List<String> getProductsFromId(String id) {
		return lacProducts.get(id);
	}

	@Override
	public Fulfillment getFulFillmentDetailsFromId(String id) {
		return lacfulfillmentDetails.get(id);
	}
	
	@Override
	public List<ProductDetail> getProductDetailsInLAC(String id) {
		return null;
	}
	
	static
	{
		String LAC = "AAA3BBBB4CCCCC5";
		List<String> productList = new ArrayList<String>();
		productList.add("1");
		productList.add("2");
		productList.add("3");
		productList.add("4");
		productList.add("5");
		productList.add("6");
		productList.add("7");
		
		lacProducts.put(LAC, productList);
		
		Fulfillment fulfillment = new Fulfillment();
		SiteAddress site = new SiteAddress();
		site.setStreetAddress("176 South Street");
		site.setCity("Hopkinton");
		site.setProvinceCode("MA");
		site.setCountry("United States");
		site.setPinCode("01730");
		fulfillment.setAddress(site);
		fulfillment.setDate("Friday, April 04,2014");
		fulfillment.setSentEmail("rohansud@deloitte.com");
		
		lacfulfillmentDetails.put(LAC, fulfillment);
		
		LAC = "MMM3NNNN4LLLLL5";
		productList = new ArrayList<String>();
		
		productList.add("1");
		productList.add("8");
		productList.add("9");
		productList.add("10");
		
		lacProducts.put(LAC, productList);
		lacfulfillmentDetails.put(LAC, fulfillment);		
	}	
}