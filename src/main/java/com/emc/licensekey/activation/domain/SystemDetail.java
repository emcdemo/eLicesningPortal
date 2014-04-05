package com.emc.licensekey.activation.domain;

public class SystemDetail {

	private String systemName;
	private String lockingId;
	private String ipAddress;
	private String macAddress;
	public String getSystemName() {
		return systemName;
	}
	public void setSystemName(String systemName) {
		this.systemName = systemName;
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
