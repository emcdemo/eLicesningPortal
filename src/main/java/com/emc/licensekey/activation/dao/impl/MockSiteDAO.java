package com.emc.licensekey.activation.dao.impl;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.springframework.stereotype.Service;
import com.emc.licensekey.activation.dao.SiteDAO;
import com.emc.licensekey.activation.domain.SiteAddress;
import com.emc.licensekey.activation.domain.SystemDetail;

@Service
public class MockSiteDAO implements SiteDAO {

	private static HashMap<String, List<SiteAddress>> siteDetails = new HashMap<String, List<SiteAddress>>();

	@Override
	public String getSystemNameFromSystemId(String systemId) {
		// TODO Auto-generated method stub
		for(SiteAddress site:siteDetails.get("1"))
		{
			for(SystemDetail systemDetail:site.getSystemList())
			{
				if(systemDetail.getId().equals(systemId))
				{
					return systemDetail.getName();
				}
			}
		}
		return "EMC/Test Machine";
	}
	
	@Override
	public List<SiteAddress> getSiteDetailsFromUserId(String userId) {
		return siteDetails.get(userId);
	}

	static {
		
		int systemId = 1;
		List<SiteAddress> siteList = new ArrayList<SiteAddress>();

		SiteAddress site = new SiteAddress();
		site.setId("1");
		site.setStreetAddress("176 South Street");
		site.setCity("Hopkinton");
		site.setProvinceCode("MA");
		site.setCountry("United States");
		site.setPinCode("01730");		
		List<SystemDetail> systemList = new ArrayList<SystemDetail>();		
		systemList.add(createSystemObject("Hopkinton/System-A",systemId++));
		systemList.add(createSystemObject("Hopkinton/System-B",systemId++));
		systemList.add(createSystemObject("Hopkinton/System-C",systemId++));
		site.setSystemList(systemList);
		
		siteList.add(site);

		
		
		site = new SiteAddress();
		site.setId("2");
		site.setStreetAddress("174 Middlesex Turnpike");
		site.setCity("Bedford");
		site.setProvinceCode("MA");
		site.setCountry("United States");
		site.setPinCode("01730");
		systemList = new ArrayList<SystemDetail>();		
		systemList.add(createSystemObject("Beford/System-A",systemId++));
		systemList.add(createSystemObject("Beford/System-B",systemId++));
		systemList.add(createSystemObject("Beford/System-C",systemId++));
		site.setSystemList(systemList);
		
		siteList.add(site);
		
		siteDetails.put("1", siteList);
	}
	private static SystemDetail createSystemObject(String name,int systemId)
	{
		SystemDetail system = new SystemDetail();
		system.setName(name);
		system.setId(systemId+"");
		system.setIpAddress(getRandomIpAddress(name));
		system.setMacAddress(getRandomMacAddress(name));
		
		return system;
	}
	private static String getRandomMacAddress(String name)
	{		 
		 return String.format("AA:BB:CC:DD:" + "%02X:%02X", name.hashCode()%9, name.hashCode()%3);		   
	}
	private static String getRandomIpAddress(String name)
	{
		try
		{
			return name.hashCode()%255 + "." + name.hashCode()%200 + "." + name.hashCode()%100 + "." + name.hashCode()%50;
		}catch(Exception e)
		{			
			return "121.12.112.1";
		}
	}

	public static String getSystemIdFromSystemName(String systemName) {
		for (SiteAddress site : siteDetails.get("1")) {
			for (SystemDetail systemDetail : site.getSystemList()) {
				if (systemDetail.getName().equals(systemName)) {
					return systemDetail.getId();
				}
			}
		}
		return "EMC/Test Machine";

	}
}
