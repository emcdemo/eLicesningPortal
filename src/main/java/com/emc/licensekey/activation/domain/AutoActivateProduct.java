package com.emc.licensekey.activation.domain;

public class AutoActivateProduct extends Product{

	public String getProductActivationType() {
		return ProductActivationType.AutoActivate.getValue();
	}
}
