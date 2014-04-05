package com.emc.licensekey.activation.domain;

import java.util.Date;

public class Fulfillment {

	private SiteAddress address;
	private String date;
	private String sentEmail;
	public SiteAddress getAddress() {
		return address;
	}
	public void setAddress(SiteAddress address) {
		this.address = address;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getSentEmail() {
		return sentEmail;
	}
	public void setSentEmail(String sentEmail) {
		this.sentEmail = sentEmail;
	}
	
}
