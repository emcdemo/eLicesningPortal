package com.emc.licensekey.activation.controller;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.emc.licensekey.activation.domain.LAC;
import com.emc.licensekey.activation.service.LACService;
import com.emc.licensekey.util.JsonUtil;

@Controller
@RequestMapping("/activation")
public class LicenseKeyActivationController {

	@Autowired
	LACService lacService;
	
	@RequestMapping(value="home", method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String loadHomePage(@RequestParam String lac) {
		LAC  lacDetails = lacService.getLacDetails(lac);
		try {
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
		return null;
	}

}
