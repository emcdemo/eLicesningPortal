package com.emc.licensekey.activation.dao;

import java.util.List;

public interface ProductDAO {

	public List<String> getProductDetailsFromId(String id);
}
