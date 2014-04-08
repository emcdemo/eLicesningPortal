package com.emc.licensekey.activation.request;

import java.util.List;

public class LacProductLicenseDetails {

	private String name;	
	List<LacProductSystemDetails> activatedLicensesList;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public List<LacProductSystemDetails> getActivatedLicensesList() {
		return activatedLicensesList;
	}
	public void setActivatedLicensesList(
			List<LacProductSystemDetails> activatedLicensesList) {
		this.activatedLicensesList = activatedLicensesList;
	}
}
