package com.emc.licensekey.activation.request;

import java.io.Serializable;

public class ProductSystemDetails implements Serializable {	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String siteId;
	public String systemId;
	public String macAddress;

	public String getMacAddress() {
		return macAddress;
	}
	
	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
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