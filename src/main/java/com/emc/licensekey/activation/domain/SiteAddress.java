package com.emc.licensekey.activation.domain;

import java.util.List;

public class SiteAddress {

	private String siteID;
	private String streetAddress;
	private String city;
	private String province;
	private String provinceCode;
	private String pinCode;
	private String country;
	private List<SystemDetail> systemList;
	public String getSiteID() {
		return siteID;
	}
	public void setSiteID(String siteID) {
		this.siteID = siteID;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getProvinceCode() {
		return provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public List<SystemDetail> getSystemList() {
		return systemList;
	}
	public void setSystemList(List<SystemDetail> systemList) {
		this.systemList = systemList;
	}
	public String toString()
	{
		return streetAddress + "," + city + ", " + provinceCode + " " + pinCode + "  " + country;
	}
}
