package com.emc.licensekey.activation.domain;

import java.util.List;

public class LAC {

	private String id;
	private Fulfillment fulFillmentDetails;
	private List<Product> products;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Fulfillment getFulFillmentDetails() {
		return fulFillmentDetails;
	}
	public void setFulFillmentDetails(Fulfillment fulFillmentDetails) {
		this.fulFillmentDetails = fulFillmentDetails;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
}
