package com.emc.licensekey.activation.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.springframework.stereotype.Service;

import com.emc.licensekey.activation.dao.ProductDAO;

@Service
public class MockProductDAO implements ProductDAO{

	public static HashMap<String, List<String>> emcProductList = new HashMap<String, List<String>>();
	
	@Override
	public List<String> getProduct(String productId) {
		return emcProductList.get(productId);
	}
	
	static
	{
		List<String> productDetails = new ArrayList<String>();
		productDetails.add("Networker Mod for Oracle CLT Oralce & Later UX");		
		productDetails.add("L");
		emcProductList.put("1", productDetails);
		
		productDetails = new ArrayList<String>();
		productDetails.add("Open File Mgr Client Server Windows");		
		productDetails.add("L");
		
		emcProductList.put("2", productDetails);
		
		productDetails = new ArrayList<String>();
		productDetails.add("Open Client Workstation Windows");		
		productDetails.add("L");
		
		emcProductList.put("3", productDetails);
		
		productDetails = new ArrayList<String>();
		productDetails.add("PowerPath VE Unserved License, VMware");		
		productDetails.add("C");
		emcProductList.put("4", productDetails);
		
		productDetails = new ArrayList<String>();
		productDetails.add("PowerPath VE Served License, VMware");		
		productDetails.add("C");
		
		emcProductList.put("5", productDetails);
		
		productDetails = new ArrayList<String>();
		productDetails.add("PowerPath for Windows");		
		productDetails.add("C");
		
		emcProductList.put("6", productDetails);
		
		productDetails = new ArrayList<String>();
		productDetails.add("Product Bundle Details");		
		productDetails.add("A");
		
		emcProductList.put("7", productDetails);
		
		productDetails = new ArrayList<String>();
		productDetails.add("Isilon");		
		productDetails.add("L");
		
		emcProductList.put("8", productDetails);
		
		productDetails = new ArrayList<String>();
		productDetails.add("Greenplum");		
		productDetails.add("L");
		
		emcProductList.put("9", productDetails);
		
		productDetails = new ArrayList<String>();
		productDetails.add("RSA Security");		
		productDetails.add("L");
		
		emcProductList.put("10", productDetails);
		
	
	}
	public static String getProductIdFromProductName(String productName)
	{
		for (Entry<String, List<String>> entry : MockProductDAO.emcProductList.entrySet()) {
		    if(productName.equals(entry.getValue().get(0)))
		    {
		    	return entry.getKey();
		    }
		}
		return null;
	}
}
