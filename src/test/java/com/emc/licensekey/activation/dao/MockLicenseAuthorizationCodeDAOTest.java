package com.emc.licensekey.activation.dao;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ContextAnnotationAutowireCandidateResolver;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.emc.licensekey.activation.dao.impl.MockLacProductDAO;
import com.emc.licensekey.activation.domain.Fulfillment;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/dao/dao.xml"})
public class MockLicenseAuthorizationCodeDAOTest{

	@Autowired(required=true)
	LACDao licenseAuthorizationCodeDAO;

	@Test
	public void testGetLacProductDetails() throws Exception {
		String lacId = "AAA3BBBB4CCCCC5";
        List<String> productDetails = licenseAuthorizationCodeDAO.getProductsFromId(lacId);        
        Assert.assertNotNull(productDetails);
        Assert.assertEquals(7, productDetails.size());
        productDetails = licenseAuthorizationCodeDAO.getProductsFromId("DUMMY_LAC_ID");
        Assert.assertNull(productDetails);
    }
	
	@Test
	public void testLacFullfillmentDetails()
	{
		String lacId = "AAA3BBBB4CCCCC5";
        Fulfillment obj = licenseAuthorizationCodeDAO.getFulFillmentDetailsFromId(lacId);        
        Assert.assertNotNull(obj);
        obj = licenseAuthorizationCodeDAO.getFulFillmentDetailsFromId("DUMMY_LAC_ID");
        Assert.assertNull(obj);
	}
 }
