package com.emc.licensekey.activation.domain;

public abstract class Product {
	public abstract String getProductActivationType();
	
	private ProductDetail productDetail;
	
	public void setProductDetail(ProductDetail productDetail) {
		this.productDetail = productDetail;
	}
	
	public ProductDetail getProductDetail() {
		return productDetail;
	}
}
