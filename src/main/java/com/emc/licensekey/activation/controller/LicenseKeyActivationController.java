package com.emc.licensekey.activation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LicenseKeyActivationController {

	@RequestMapping("/activationHome")
	public ModelAndView loadActivationByLAC() {
		return new ModelAndView("/LicenseKeyActivation/home");
	}

}
