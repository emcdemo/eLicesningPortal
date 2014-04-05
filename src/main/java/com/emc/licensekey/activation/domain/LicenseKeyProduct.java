package com.emc.licensekey.activation.domain;

public class LicenseKeyProduct extends Product{

	public String getProductActivationType() {
		return ProductActivationType.LiceneseKey.getValue();
	}


}
