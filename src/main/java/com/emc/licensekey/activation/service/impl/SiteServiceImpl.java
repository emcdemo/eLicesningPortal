package com.emc.licensekey.activation.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emc.licensekey.activation.dao.SiteDAO;
import com.emc.licensekey.activation.domain.SiteAddress;
import com.emc.licensekey.activation.service.SiteService;

@Service
public class SiteServiceImpl implements SiteService{

	@Autowired
	SiteDAO siteDAO;
	
	@Override
	public List<SiteAddress> getUserSiteDetails(String userId) {
		return siteDAO.getSiteDetailsFromUserId(userId);
	}

}
