package com.emc.licensekey.activation.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.stereotype.Service;

import sun.security.x509.AVA;

import com.emc.licensekey.activation.dao.LacProductDAO;
import com.emc.licensekey.activation.domain.ActivationDetails;
import com.emc.licensekey.activation.request.LacProductLicenseDetails;

@Service
public class MockLacProductDAO implements LacProductDAO{

	public static HashMap<String,HashMap<String, List<Object>>> lacProductDetails  = new HashMap<String, HashMap<String,List<Object>>>();
	
	@Override
	public HashMap<String, List<Object>> getProductDetailsFromId(String lacId) {
		return lacProductDetails.get(lacId);
	}
	
	static
	{
		HashMap<String, List<Object>> lacRegisteredProductQtyDetails = new HashMap<String, List<Object>>();
		List<Object> productDetails = new ArrayList<Object>();
		
		List<ActivationDetails> activationList = new ArrayList<ActivationDetails>();
		productDetails.add("10");		
		productDetails.add(activationList);
		
		lacRegisteredProductQtyDetails.put("1", productDetails);
		
		productDetails = new ArrayList<Object>();		
		productDetails.add("10");		
		activationList = new ArrayList<ActivationDetails>();
		productDetails.add(activationList);
		
		lacRegisteredProductQtyDetails.put("2", productDetails);
		
		productDetails = new ArrayList<Object>();		
		productDetails.add("10");		
		activationList = new ArrayList<ActivationDetails>();
		productDetails.add(activationList);
		
		lacRegisteredProductQtyDetails.put("3", productDetails);
		
		productDetails = new ArrayList<Object>();		
		productDetails.add("50");		
		activationList = new ArrayList<ActivationDetails>();
		productDetails.add(activationList);
		
		lacRegisteredProductQtyDetails.put("4", productDetails);
		
		productDetails = new ArrayList<Object>();		
		productDetails.add("100");
		activationList = new ArrayList<ActivationDetails>();
		productDetails.add(activationList);
		
		lacRegisteredProductQtyDetails.put("5", productDetails);
		
		productDetails = new ArrayList<Object>();		
		productDetails.add("1");		
		activationList = new ArrayList<ActivationDetails>();
		productDetails.add(activationList);
		
		lacRegisteredProductQtyDetails.put("6", productDetails);
		
		productDetails = new ArrayList<Object>();		
		productDetails.add("1");		
		productDetails.add(activationList);
		lacRegisteredProductQtyDetails.put("7", productDetails);
		
		lacProductDetails.put("AAA3BBBB4CCCCC5", lacRegisteredProductQtyDetails);
		
		
		//New LAC MMM3NNNN4LLLLL5
		lacRegisteredProductQtyDetails = new HashMap<String, List<Object>>();
		productDetails = new ArrayList<Object>();
		
		activationList = new ArrayList<ActivationDetails>();
		productDetails.add("4");		
		productDetails.add(activationList);
		
		lacRegisteredProductQtyDetails.put("8", productDetails);
		
		productDetails = new ArrayList<Object>();		
		productDetails.add("3");		
		activationList = new ArrayList<ActivationDetails>();
		productDetails.add(activationList);
		
		lacRegisteredProductQtyDetails.put("1", productDetails);
		
		productDetails = new ArrayList<Object>();		
		productDetails.add("5");		
		activationList = new ArrayList<ActivationDetails>();
		productDetails.add(activationList);
		
		lacRegisteredProductQtyDetails.put("10", productDetails);
		
		productDetails = new ArrayList<Object>();		
		productDetails.add("20");		
		activationList = new ArrayList<ActivationDetails>();
		productDetails.add(activationList);
		
		lacRegisteredProductQtyDetails.put("9", productDetails);
		
		lacProductDetails.put("MMM3NNNN4LLLLL5", lacRegisteredProductQtyDetails);
		
	}

	@Override
	public void updateProductActivationDetails(String id,
			String productId, List<ActivationDetails> activationDetails) {
		
		HashMap<String, List<Object>> lacProducts = lacProductDetails.get(id);
		String lproductId =productId; 
		for (Entry<String, List<String>> entry : MockProductDAO.emcProductList.entrySet()) {
		    if(productId.equals(entry.getValue().get(0)))
		    {
		    	lproductId = entry.getKey();
		    }
		}
		List<Object> oldlacProductDetails = lacProducts.get(lproductId);		
		List<ActivationDetails> activationList = (List<ActivationDetails>) oldlacProductDetails.get(1);			
		activationList.addAll(activationDetails);
	}

	@Override
	public List<ActivationDetails> getProductActivationDetails(
			String lacId, String productId) {
		// TODO Auto-generated method stub
		return (List<ActivationDetails>) lacProductDetails.get(lacId).get(productId).get(1);
	}
		
}