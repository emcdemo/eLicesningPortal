package com.emc.licensekey.activation.response;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.ArrayList;

public class ActivateLicenseResponse {

	private String product_name;

	private String activated_on;

	private String activated_by;

	private List<Activated_licenseData> activated_licenses = new ArrayList<Activated_licenseData>();
	
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getActivated_on() {
		return activated_on;
	}

	public void setActivated_on(String activated_on) {
		this.activated_on = activated_on;
	}

	public String getActivated_by() {
		return activated_by;
	}

	public void setActivated_by(String activated_by) {
		this.activated_by = activated_by;
	}

	public List<Activated_licenseData> getActivated_licenses() {
		return activated_licenses;
	}

	public void setActivated_licenses(
			List<Activated_licenseData> activated_licenses) {
		this.activated_licenses = activated_licenses;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}