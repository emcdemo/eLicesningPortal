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

import com.emc.licensekey.activation.dao.impl.MockProductDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/dao/dao.xml"})
public class MockProductDaoTest{

	@Autowired(required=true)
	ProductDAO productDAO;

	@Test
	public void testGetProduct() throws Exception {
		String productId = "1";
        List<String> productDetails = productDAO.getProductDetailsFromId(productId);        
        Assert.assertNotNull(productDetails);
        productDetails = productDAO.getProductDetailsFromId("-1");
        Assert.assertNull(productDetails);
    }
 }
