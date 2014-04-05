package com.emc.licensekey.activation.request;

import java.util.List;

public class LacProductActivationRequest {

	private String lacId;
	private List<ActivateProductDetail> activateProductList;
	
	public String getLacId() {
		return lacId;
	}
	public void setLacId(String lacId) {
		this.lacId = lacId;
	}
	public List<ActivateProductDetail> getActivateProductList() {
		return activateProductList;
	}
	public void setActivateProductList(
			List<ActivateProductDetail> activateProductList) {
		this.activateProductList = activateProductList;
	}
	
	
}
