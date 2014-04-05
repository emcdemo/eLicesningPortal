package com.emc.licensekey.activation.dao;

import java.util.List;

import com.emc.licensekey.activation.domain.SiteAddress;

public interface SiteDAO {
	public List<SiteAddress> getSiteDetailsFromUserId(String userId);
}
