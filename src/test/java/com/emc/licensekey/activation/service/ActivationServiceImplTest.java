package com.emc.licensekey.activation.service;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.emc.licensekey.activation.dao.LacProductDAO;
import com.emc.licensekey.activation.domain.ActivationDetails;
import com.emc.licensekey.activation.request.LacProductActivationRequest;
import com.emc.licensekey.activation.request.LacSelectedProducts;
import com.emc.licensekey.activation.request.ProductSystemDetails;
import com.emc.licensekey.util.JsonUtil;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/dao/dao.xml"})
public class ActivationServiceImplTest {

	@Autowired
	ActivationService activationService;
	
	@Autowired
	LacProductDAO lacProductDAO;
	
	@Test
	public void testSingleProductActivatoin() throws Exception, JsonMappingException, IOException
	{
		String lacId = "AAA3BBBB4CCCCC5";
		
		LacProductActivationRequest obj = new LacProductActivationRequest();
		
		obj.setLacId(lacId);
		
		LacSelectedProducts lacProductOne = new LacSelectedProducts();
		
		lacProductOne.setProductId("1");
		ProductSystemDetails systemOne = new ProductSystemDetails();
		systemOne.setSiteId("1");
		systemOne.setSystemId("1");
		systemOne.setMacAddress("AA:BB:HH:DD:12");
		
		List<ProductSystemDetails> addSystem = new ArrayList<ProductSystemDetails>();		
		addSystem.add(systemOne);
		lacProductOne.setSelectedSystems(addSystem);
		
		
		ProductSystemDetails systemTwo = new ProductSystemDetails();
		systemTwo.setSiteId("2");
		systemTwo.setSystemId("2");
		systemTwo.setMacAddress("AA:BB:HH:DD:12");
					
		addSystem.add(systemTwo);
		
		
		List<LacSelectedProducts> lacSelectedProducts = new ArrayList<LacSelectedProducts>();
		
		lacSelectedProducts.add(lacProductOne);
		
	
		obj.setActivateProductList(lacSelectedProducts);
		
		activationService.execute(obj);
				
		HashMap<String, List<Object>> lacProductList = lacProductDAO.getProductDetailsFromId(lacId);
		List<Object> lacProductDetails = lacProductList.get("1");
		Assert.assertEquals(2, ((List<ActivationDetails>)lacProductDetails.get(1)).size());
		

		
		LacSelectedProducts lacProductTwo = new LacSelectedProducts();
		
		lacProductTwo.setProductId("1");
		systemOne = new ProductSystemDetails();
		systemOne.setSiteId("1");
		systemOne.setSystemId("1");
		systemOne.setMacAddress("AA:BB:HH:DD:12");
		
		addSystem = new ArrayList<ProductSystemDetails>();		
		addSystem.add(systemOne);
		lacProductTwo.setSelectedSystems(addSystem);
		
		
		systemTwo = new ProductSystemDetails();
		systemTwo.setSiteId("2");
		systemTwo.setSystemId("2");
		systemTwo.setMacAddress("AA:BB:HH:DD:12");
					
		addSystem.add(systemTwo);
					
		lacSelectedProducts.add(lacProductOne);
		obj.setActivateProductList(lacSelectedProducts);
		
		
		
		System.out.println(JsonUtil.getJSonString(obj));
	}
}
