package com.emc.licensekey.activation.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import javax.validation.Valid;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.emc.licensekey.activation.dao.impl.MockProductDAO;
import com.emc.licensekey.activation.dao.impl.MockSiteDAO;
import com.emc.licensekey.activation.domain.ActivationDetails;
import com.emc.licensekey.activation.domain.Product;
import com.emc.licensekey.activation.request.FormObject;
import com.emc.licensekey.activation.request.LacProductActivationRequest;
import com.emc.licensekey.activation.request.LacProductLicenseDetails;
import com.emc.licensekey.activation.request.LacProductSystemDetails;
import com.emc.licensekey.activation.request.LacSelectedProducts;
import com.emc.licensekey.activation.request.ProductSystemDetails;
import com.emc.licensekey.activation.request.SelectedProd;
import com.emc.licensekey.activation.request.SelectedSystem;
import com.emc.licensekey.activation.response.ActivateLicenseResponse;
import com.emc.licensekey.activation.response.Activated_licenseData;
import com.emc.licensekey.activation.service.ActivationService;
import com.emc.licensekey.activation.service.LACService;
import com.emc.licensekey.util.JsonUtil;
import com.emc.licensekey.util.LicenseKeyGeneratorUtil;

@Controller
@RequestMapping("/activation")
public class LicenseKeyActivationController {

	@Autowired
	LACService lacService;
	@Autowired
	ActivationService activationService;
	
	@RequestMapping(value="home", method=RequestMethod.GET)
	public ModelAndView loadHomePage(@RequestParam String lac) {				
		return new ModelAndView("LicenseKeyActivation/home", "lac", lacService.getLacDetails(lac));
	}
	
	@RequestMapping(value="selectQuantity", method=RequestMethod.GET)
	public ModelAndView loadHomePage(@RequestParam String lac,String activationType) {	
		List<Product> productList = lacService.getLacDetails(lac).getProducts();
		List<Product> activationTypeProdList = new ArrayList<Product>();
		for(Product product: productList)
		{
			if(product.getProductActivationType().equals(activationType))
			{
				activationTypeProdList.add(product);
			}
		}
		HashMap<String, Object> modelData = new HashMap<String, Object>();
		modelData.put("selectedProducts", activationTypeProdList);
		modelData.put("lacId", lac);
		modelData.put("activationType", activationType);
		return new ModelAndView("LicenseKeyActivation/wizard", modelData);
	}
	
	@RequestMapping(value="/process", method=RequestMethod.POST)
	public @ResponseBody String activateProducts(@Valid @RequestBody FormObject formObject) {
		
		LacProductActivationRequest lacProductActivationRequest = new LacProductActivationRequest();
		lacProductActivationRequest.setLacId(formObject.getId());
		
		List<LacSelectedProducts> activateProductList = new ArrayList<LacSelectedProducts>();
		List<SelectedProd> selectedProds = formObject.getSelectedProds();
		List<SelectedSystem> selectedSystems = formObject.getSelectedSystems();			
		
		for(SelectedProd selectedProduct:selectedProds)
		{
			LacSelectedProducts lacSelectedProduct = new LacSelectedProducts();
			lacSelectedProduct.setProductId(selectedProduct.getName());
			
			List<ProductSystemDetails> currentProductSelectedSystems = new ArrayList<ProductSystemDetails>();
			
			for(SelectedSystem selectedSystem:selectedSystems)
			{
				if(selectedSystem.getProdName().equals(lacSelectedProduct.getProductId()))
				{
					ProductSystemDetails productSystemDetails = new ProductSystemDetails();
					productSystemDetails.setSystemId(MockSiteDAO.getSystemIdFromSystemName(selectedSystem.getName()));
					productSystemDetails.setMacAddress(selectedSystem.getMacAddress());
					currentProductSelectedSystems.add(productSystemDetails);
				}
			}
			lacSelectedProduct.setSelectedSystems(currentProductSelectedSystems);
			activateProductList.add(lacSelectedProduct);
			
		}
		lacProductActivationRequest.setActivateProductList(activateProductList);
		
				
		List<ActivationDetails> processedActivationList = activationService.execute(lacProductActivationRequest);
		
		try {
			
			ActivateLicenseResponse  activateLicenseResponse = new ActivateLicenseResponse();
			activateLicenseResponse.setActivated_by("Deloitte");
			activateLicenseResponse.setActivated_on(Calendar.getInstance().getTime().toGMTString());
			
			List<Activated_licenseData> activated_licenses = activateLicenseResponse.getActivated_licenses();
			
			for(SelectedProd prod:formObject.getSelectedProds()){
				
				LacProductLicenseDetails lacProductLicenseDetails = lacService.getProductActivationDetails(lacProductActivationRequest.getLacId(), MockProductDAO.getProductIdFromProductName(prod.getName()));
				
				for(LacProductSystemDetails lacProductSystemDetails:lacProductLicenseDetails.getActivatedLicensesList())
				{
					if(LicenseKeyGeneratorUtil.isActivationIdInList(processedActivationList, lacProductSystemDetails.getActivationId()))
					{
						Activated_licenseData obj = new Activated_licenseData();
						obj.setProductName(prod.getName());
						activateLicenseResponse.setProduct_name(prod.getName());
						obj.setBound_to(lacProductSystemDetails.getBoundTo());
						obj.setActivation_id(lacProductSystemDetails.getActivationId());
						activated_licenses.add(obj);
					}
				}
			}
			
			return JsonUtil.getJSonString(activateLicenseResponse);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@RequestMapping(value="/" +
			"", method=RequestMethod.GET)
	public @ResponseBody String getProductLicenseDetails(@RequestParam String lac, @RequestParam String productId) {
	
		LacProductLicenseDetails lacProductLicenseDetails = lacService.getProductActivationDetails(lac,productId);
		try {
			return JsonUtil.getJSonString(lacProductLicenseDetails);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}	
}