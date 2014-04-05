package com.emc.licensekey.activation.domain;

import java.util.List;

public class ProductDetail {

	private String id;
	private String name;
	private int totalQty;
	private int activeQty;
	private int availableQty;	
	private List<ActivationDetails> activationList;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTotalQty() {
		return totalQty;
	}
	public void setTotalQty(int totalQty) {
		this.totalQty = totalQty;
	}
	public int getActiveQty() {
		return activeQty;
	}
	public void setActiveQty(int activeQty) {
		this.activeQty = activeQty;
	}
	public int getAvailableQty() {
		return availableQty;
	}
	public void setAvailableQty(int availableQty) {
		this.availableQty = availableQty;
	}
	public List<ActivationDetails> getActivationList() {
		return activationList;
	}
	public void setActivationList(List<ActivationDetails> activationList) {
		this.activationList = activationList;
	}
	
}
