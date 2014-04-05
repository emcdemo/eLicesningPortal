package com.emc.licensekey.activation.dao;

import java.util.HashMap;
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

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/dao/dao.xml"})
public class MockLacProductDaoTest{

	@Autowired(required=true)
	LacProductDAO lacProductDetailsDAO;

	@Test
	public void testGetProduct() throws Exception {
		String lacId = "AAA3BBBB4CCCCC5";
		HashMap<String, List<String>> productDetails = lacProductDetailsDAO.getProductDetailsFromId(lacId);        
        Assert.assertNotNull(productDetails);
        productDetails = lacProductDetailsDAO.getProductDetailsFromId("-1");
        Assert.assertNull(productDetails);
    }
 }
