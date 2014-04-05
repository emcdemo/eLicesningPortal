package com.emc.licensekey.activation.controller;

import java.io.IOException;
import java.util.List;

import javax.validation.Valid;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.emc.licensekey.activation.domain.LAC;
import com.emc.licensekey.activation.domain.Product;
import com.emc.licensekey.activation.request.LacProductActivationRequest;
import com.emc.licensekey.activation.service.LACService;
import com.emc.licensekey.util.JsonUtil;

@Controller
@RequestMapping("/activation")
public class LicenseKeyActivationController {

	@Autowired
	LACService lacService;
	
	@RequestMapping(value="home", method=RequestMethod.GET)
	public ModelAndView loadHomePage(@RequestParam String lac) {		
		/*try {
			return JsonUtil.getJSonString(lacDetails);
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
		*/
		return new ModelAndView("LicenseKeyActivation/home", "lac", lacService.getLacDetails(lac));
	}
	@RequestMapping(value="selectQuantity", method=RequestMethod.GET)
	public ModelAndView loadHomePage(@RequestParam String lac,String activationType) {	
		List<Product> productList = lacService.getLacDetails(lac).getProducts();
		for(Product product: productList)
		{
			if(!product.getProductActivationType().equals(activationType))
			{
				productList.remove(product);
			}
		}
		return new ModelAndView("LicenseKeyActivation/SelectLacProductQuantity", "lac", productList);
	}
	
	@RequestMapping(value="createLicenseKey", method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String createLicenseKey(@Valid @RequestBody LacProductActivationRequest productActivations) {		
		return productActivations.getLacId() + "---"+ productActivations.getActivateProductList().get(0).getProductId();
	}
}