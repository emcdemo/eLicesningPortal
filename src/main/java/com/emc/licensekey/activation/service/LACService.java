package com.emc.licensekey.activation.service;

import com.emc.licensekey.activation.domain.LAC;

public interface LACService {

	public LAC getLacDetails(String lacId);
}
