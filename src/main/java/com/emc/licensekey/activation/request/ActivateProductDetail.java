package com.emc.licensekey.activation.request;

public class ActivateProductDetail {
	
	private String productId;
	private int activatedQty;
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public int getActivatedQty() {
		return activatedQty;
	}
	public void setActivatedQty(int activatedQty) {
		this.activatedQty = activatedQty;
	}
	
}
