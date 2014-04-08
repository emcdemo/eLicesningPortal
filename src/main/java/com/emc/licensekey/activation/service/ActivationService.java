package com.emc.licensekey.activation.service;

import java.util.List;

import com.emc.licensekey.activation.domain.ActivationDetails;
import com.emc.licensekey.activation.request.LacProductActivationRequest;

public interface ActivationService {
	public List<ActivationDetails> execute(LacProductActivationRequest lacProductActivationRequest);
}
