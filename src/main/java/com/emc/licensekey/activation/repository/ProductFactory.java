package com.emc.licensekey.activation.repository;

import java.util.List;

import com.emc.licensekey.activation.domain.Product;

public interface ProductFactory {
	public Product createProductFromProductId(String productId);
	public List<Product> createProductFromProductList(List<String> productList);
}
