package com.emc.licensekey.activation.dao;

import java.util.HashMap;
import java.util.List;

import com.emc.licensekey.activation.domain.ActivationDetails;
import com.emc.licensekey.activation.request.LacProductLicenseDetails;

public interface LacProductDAO {

	public HashMap<String, List<Object>> getProductDetailsFromId(String id);	
	public void updateProductActivationDetails(String id,String productId,List<ActivationDetails> activationDetails);
	public List<ActivationDetails> getProductActivationDetails(String lacId,String productId);
}
