package com.emc.licensekey.activation.domain;

public class LicenseKeyProduct implements Product{

	private ProductDetail productDetail;
	
	@Override
	public String getProductActivationType() {
		return ProductActivationType.LiceneseKey.getValue();
	}

	@Override
	public void setProductDetail(ProductDetail productDetail) {
		this.productDetail = productDetail;
	}

	@Override
	public ProductDetail getProductDetail() {
		return productDetail;
	}
}
