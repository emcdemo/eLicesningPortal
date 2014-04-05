package com.emc.licensekey.activation.dao;

import java.util.HashMap;
import java.util.List;

public interface LacProductDAO {

	public HashMap<String, List<String>> getProductDetailsFromId(String id);
}
