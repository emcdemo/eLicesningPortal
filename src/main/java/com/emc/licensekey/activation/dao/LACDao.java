package com.emc.licensekey.activation.dao;

import java.util.List;

import com.emc.licensekey.activation.domain.Fulfillment;
import com.emc.licensekey.activation.domain.ProductDetail;

public interface LACDao {
	public List<String> getProductsFromId(String id);
	public Fulfillment getFulFillmentDetailsFromId(String id);
	public List<ProductDetail> getProductDetailsInLAC(String id); 
}
