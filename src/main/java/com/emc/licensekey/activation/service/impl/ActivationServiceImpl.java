package com.emc.licensekey.activation.service.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.emc.licensekey.activation.dao.LacProductDAO;
import com.emc.licensekey.activation.dao.impl.MockLacProductDAO;
import com.emc.licensekey.activation.domain.ActivationDetails;
import com.emc.licensekey.activation.request.LacProductActivationRequest;
import com.emc.licensekey.activation.request.LacSelectedProducts;
import com.emc.licensekey.activation.request.ProductSystemDetails;
import com.emc.licensekey.activation.service.ActivationService;
import com.emc.licensekey.util.LicenseKeyGeneratorUtil;

@Service
public class ActivationServiceImpl implements ActivationService{

	@Autowired
	LacProductDAO lacProductDAO;
	
	@Override
	public List<ActivationDetails> execute(LacProductActivationRequest lacProductActivationRequest) {
		
		String lacId = lacProductActivationRequest.getLacId();
		
		List<ActivationDetails> totalActivationList = new ArrayList<ActivationDetails>();
		for(LacSelectedProducts selectedProduct:lacProductActivationRequest.getActivateProductList())
		{
			List<ActivationDetails> activationList = new ArrayList<ActivationDetails>();
			for(ProductSystemDetails systemDetails:selectedProduct.getSelectedSystems())
			{
				ActivationDetails obj = new ActivationDetails();
				obj.setActivationId(LicenseKeyGeneratorUtil.getRandomLicenseKey());
				obj.setSiteId(systemDetails.getSiteId());
				obj.setSystemId(systemDetails.getSystemId());
				obj.setActivatedBy("Deloitte");
				obj.setActivatedOn(Calendar.getInstance().getTime().toGMTString());				
				activationList.add(obj);
			}			
			lacProductDAO.updateProductActivationDetails(lacId, selectedProduct.getProductId(), activationList);
			totalActivationList.addAll(activationList);
		}
		return totalActivationList;
	}	
	
	public void resetCount(){
		MockLacProductDAO.setup();
	}
}
