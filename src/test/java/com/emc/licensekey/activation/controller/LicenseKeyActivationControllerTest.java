package com.emc.licensekey.activation.controller;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.emc.licensekey.activation.domain.Product;
import com.emc.licensekey.activation.service.LACService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/dao/dao.xml"})
public class LicenseKeyActivationControllerTest {

	@Autowired
	LACService lacService;
	
	@Test
	public void testLacDetailsForValidProduct()
	{
		String lacId = "AAA3BBBB4CCCCC5";
		Assert.assertEquals(7, lacService.getLacDetails(lacId).getProducts().size());
		
		for(Product prod:lacService.getLacDetails(lacId).getProducts())
		{
			System.out.println(prod.getProductDetail().getName());
		}
	}
}
