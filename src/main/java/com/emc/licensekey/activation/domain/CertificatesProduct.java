package com.emc.licensekey.activation.domain;

public class CertificatesProduct extends Product{

	public String getProductActivationType() {
		return ProductActivationType.Certificates.getValue();
	}

}