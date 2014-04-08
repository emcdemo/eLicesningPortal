package com.emc.licensekey.activation.request;

import java.io.Serializable;
import java.util.List;

public class LacProductActivationRequest implements Serializable{

	private String lacId;
	private List<LacSelectedProducts> activateProductList;
	
	public String getLacId() {
		return lacId;
	}
	public void setLacId(String lacId) {
		this.lacId = lacId;
	}
	public List<LacSelectedProducts> getActivateProductList() {
		return activateProductList;
	}
	public void setActivateProductList(
			List<LacSelectedProducts> activateProductList) {
		this.activateProductList = activateProductList;
	}
}
