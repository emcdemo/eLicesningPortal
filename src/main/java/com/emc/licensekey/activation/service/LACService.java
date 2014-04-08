package com.emc.licensekey.activation.service;

import com.emc.licensekey.activation.domain.LAC;
import com.emc.licensekey.activation.request.LacProductLicenseDetails;

public interface LACService {

	public LAC getLacDetails(String lacId);

	public LacProductLicenseDetails getProductActivationDetails(String lac,
			String productId);
}
