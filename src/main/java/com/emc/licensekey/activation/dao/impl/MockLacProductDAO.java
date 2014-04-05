package com.emc.licensekey.activation.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.emc.licensekey.activation.dao.LacProductDAO;

@Service
public class MockLacProductDAO implements LacProductDAO{

	public static HashMap<String,HashMap<String, List<String>>> lacProductDetails  = new HashMap<String, HashMap<String,List<String>>>();
	
	@Override
	public HashMap<String, List<String>> getProductDetailsFromId(String lacId) {
		return lacProductDetails.get(lacId);
	}
	
	static
	{
		HashMap<String, List<String>> lacRegisteredProductQtyDetails = new HashMap<String, List<String>>();
		List<String> productDetails = new ArrayList<String>();		
		productDetails.add("10");
		productDetails.add("0");
		lacRegisteredProductQtyDetails.put("1", productDetails);
		
		productDetails = new ArrayList<String>();		
		productDetails.add("10");
		productDetails.add("0");		
		
		lacRegisteredProductQtyDetails.put("2", productDetails);
		
		productDetails = new ArrayList<String>();		
		productDetails.add("10");
		productDetails.add("0");		
		
		lacRegisteredProductQtyDetails.put("3", productDetails);
		
		productDetails = new ArrayList<String>();		
		productDetails.add("50");
		productDetails.add("0");		
		
		lacRegisteredProductQtyDetails.put("4", productDetails);
		
		productDetails = new ArrayList<String>();		
		productDetails.add("100");
		productDetails.add("0");
		
		lacRegisteredProductQtyDetails.put("5", productDetails);
		
		productDetails = new ArrayList<String>();		
		productDetails.add("1");
		productDetails.add("0");
		
		lacRegisteredProductQtyDetails.put("6", productDetails);
		
		productDetails = new ArrayList<String>();		
		productDetails.add("1");
		productDetails.add("0");
		lacRegisteredProductQtyDetails.put("7", productDetails);
		
		lacProductDetails.put("AAA3BBBB4CCCCC5", lacRegisteredProductQtyDetails);
	}
}