package com.emc.licensekey.activation.request;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class LacSelectedProducts implements Serializable{
	
	private String productId;
	private List<ProductSystemDetails> selectedSystems = new ArrayList<ProductSystemDetails>();
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public List<ProductSystemDetails> getSelectedSystems() {
		return selectedSystems;
	}
	public void setSelectedSystems(List<ProductSystemDetails> selectedSystems) {
		this.selectedSystems = selectedSystems;
	}
	
}
