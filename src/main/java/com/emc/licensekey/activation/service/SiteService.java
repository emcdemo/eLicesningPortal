package com.emc.licensekey.activation.service;

import java.util.List;

import com.emc.licensekey.activation.domain.SiteAddress;

public interface SiteService {

	public List<SiteAddress> getUserSiteDetails(String userId);
}
