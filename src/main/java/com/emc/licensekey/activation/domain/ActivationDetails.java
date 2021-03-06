package com.emc.licensekey.activation.domain;

public class ActivationDetails {

	private String activationId;
	private String siteId;
	private String systemId;
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
	public String getSiteId() {
		return siteId;
	}
	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}
	public String getSystemId() {
		return systemId;
	}
	public void setSystemId(String systemId) {
		this.systemId = systemId;
	}
	
}
