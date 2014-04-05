package com.emc.licensekey.activation.domain;

public interface Product {
	public String getProductActivationType();
	public void setProductDetail(ProductDetail productDetail);
	public ProductDetail getProductDetail();	
}
