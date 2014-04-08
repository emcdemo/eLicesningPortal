package com.emc.licensekey.activation.domain;

public class SystemDetail {

	private String id;
	private String name;
	private String lockingId;
	private String ipAddress;
	private String macAddress;
	private String siteId;
	
	
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
	public String getSiteId() {
		return siteId;
	}
	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}
	public String getLockingId() {
		return lockingId;
	}
	public void setLockingId(String lockingId) {
		this.lockingId = lockingId;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public String getMacAddress() {
		return macAddress;
	}
	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}	
}
