package com.emc.licensekey.activation.request;

public class LacProductSystemDetails {

	private String activationId;
	private String boundTo;
	private int qty;
    private String units;
    private String activatedOn;
	private String activatedBy;
	
	public String getActivatedOn() {
		return activatedOn;
	}
	public void setActivatedOn(String activatedOn) {
		this.activatedOn = activatedOn;
	}
	public String getActivatedBy() {
		return activatedBy;
	}
	public void setActivatedBy(String activatedBy) {
		this.activatedBy = activatedBy;
	}
	public String getActivationId() {
		return activationId;
	}
	public void setActivationId(String activationId) {
		this.activationId = activationId;
	}
	public String getBoundTo() {
		return boundTo;
	}
	public void setBoundTo(String boundTo) {
		this.boundTo = boundTo;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getUnits() {
		return units;
	}
	public void setUnits(String units) {
		this.units = units;
	}
    

}
