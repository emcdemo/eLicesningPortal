package com.emc.licensekey.activation.repository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.emc.licensekey.activation.domain.Product;
import com.emc.licensekey.activation.domain.ProductActivationType;
import com.emc.licensekey.activation.repository.ProductFactory;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/dao/dao.xml"})
public class ProductFactoryImplTest{

	@Autowired
	ProductFactory factory;
	
	
	@Test
	public void testLicenseKeyProductCreation()
	{
		Product product = factory.createProductFromProductId("1");
		Assert.assertEquals(ProductActivationType.LiceneseKey.getValue(), product.getProductActivationType());
	}
	
	@Test
	public void testCertificateProductCreation()
	{
		Product product = factory.createProductFromProductId("4");
		Assert.assertEquals(ProductActivationType.Certificates.getValue(), product.getProductActivationType());
	}
	
	@Test
	public void testAutoActivateProductCreation()
	{
		Product product = factory.createProductFromProductId("7");
		Assert.assertEquals(ProductActivationType.AutoActivate.getValue(), product.getProductActivationType());
	}
}
