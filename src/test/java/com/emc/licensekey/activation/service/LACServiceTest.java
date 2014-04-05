package com.emc.licensekey.activation.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.emc.licensekey.activation.domain.LAC;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/dao/dao.xml"})
public class LACServiceTest {

	@Autowired
	LACService lacService;
	
	@Test
	public void testLacService()
	{
		String lacId = "AAA3BBBB4CCCCC5";
		LAC lac = lacService.getLacDetails(lacId);
		Assert.assertEquals(7, lac.getProducts().size());
		Assert.assertNotNull(lac.getFulFillmentDetails());
	}
}
