package com.emc.licensekey.activation.dao;

import java.util.List;

import com.emc.licensekey.activation.domain.Fulfillment;

public interface LACDao {
	public List<String> getProductsFromId(String id);
	public Fulfillment getFulFillmentDetailsFromId(String id);
}
