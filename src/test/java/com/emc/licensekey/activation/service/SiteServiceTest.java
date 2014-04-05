package com.emc.licensekey.activation.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/dao/dao.xml"})
public class SiteServiceTest {

	@Autowired
	SiteService siteService;

	@Test
	public void testSiteDetailsWithValidUser(){
		Assert.assertNotNull(siteService.getUserSiteDetails("1"));
	}
	@Test
	public void testSiteDetailsWithValidInvalidUser(){
		Assert.assertNull(siteService.getUserSiteDetails("2"));
	}
}
