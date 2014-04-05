package com.emc.licensekey.activation.domain;

public enum ProductActivationType 
{
	LiceneseKey("L"),Certificates("C"), AutoActivate("A");
	private String value;
	
	private ProductActivationType(String value)
	{
		this.value = value;
	}
	public String getValue()
	{
		return this.value;
	}
}

