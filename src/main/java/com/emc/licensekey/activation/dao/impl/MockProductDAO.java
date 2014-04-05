package com.emc.licensekey.activation.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.emc.licensekey.activation.dao.ProductDAO;

@Service
public class MockProductDAO implements ProductDAO{

	public static HashMap<String, List<String>> productStore = new HashMap<String, List<String>>();
	
	@Override
	public List<String> getProductDetailsFromId(String id) {
		// TODO Auto-generated method stub
		return productStore.get(id);
	}
	
	static
	{
		List<String> productDetails = new ArrayList<String>();
		productDetails.add("Networker Mod for Oracle CLT Oralce & Later UX");
		productDetails.add("10");
		productDetails.add("0");
		productDetails.add("L");
	
		productStore.put("1", productDetails);
		
		productDetails = new ArrayList<String>();
		productDetails.add("Open File Mgr Client Server Windows");
		productDetails.add("10");
		productDetails.add("0");
		productDetails.add("L");
		
		productStore.put("2", productDetails);
		
		productDetails = new ArrayList<String>();
		productDetails.add("Open Client Workstation Windows");
		productDetails.add("10");
		productDetails.add("0");
		productDetails.add("L");
		
		productStore.put("3", productDetails);
		
		productDetails = new ArrayList<String>();
		productDetails.add("PowerPath VE Unserved License, VMware");
		productDetails.add("50");
		productDetails.add("0");
		productDetails.add("C");
		
		productStore.put("4", productDetails);
		
		productDetails = new ArrayList<String>();
		productDetails.add("PowerPath VE Served License, VMware");
		productDetails.add("100");
		productDetails.add("0");
		productDetails.add("C");
		
		productStore.put("5", productDetails);
		
		productDetails = new ArrayList<String>();
		productDetails.add("PowerPath for Windows");
		productDetails.add("1");
		productDetails.add("0");
		productDetails.add("C");
		
		productStore.put("6", productDetails);
		
		productDetails = new ArrayList<String>();
		productDetails.add("Product Bundle Details");
		productDetails.add("1");
		productDetails.add("0");
		productDetails.add("A");
		
		productStore.put("7", productDetails);
	}

}
