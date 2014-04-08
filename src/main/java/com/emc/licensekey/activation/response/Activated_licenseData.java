package com.emc.licensekey.activation.response;

import java.util.Map;

public class Activated_licenseData {
	public String getActivation_id() {
		return activation_id;
	}
	public void setActivation_id(String activation_id) {
		this.activation_id = activation_id;
	}
	public String getBound_to() {
		return bound_to;
	}
	public void setBound_to(String bound_to) {
		this.bound_to = bound_to;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getUnits() {
		return units;
	}
	public void setUnits(String units) {
		this.units = units;
	}
	public Map<String, Object> getAdditionalProperties() {
		return additionalProperties;
	}
	public void setAdditionalProperties(Map<String, Object> additionalProperties) {
		this.additionalProperties = additionalProperties;
	}
	public String activation_id;
	public String bound_to;
	public String quantity;
	public String units;
	public Map<String, Object> additionalProperties;
	public String productName;
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
}