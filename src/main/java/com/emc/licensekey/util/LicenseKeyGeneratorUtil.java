package com.emc.licensekey.util;
import java.util.List;

import com.emc.licensekey.activation.domain.ActivationDetails;

public class LicenseKeyGeneratorUtil {

	public static String getRandomLicenseKey()
	{
		return LicenseKeyGenerator.getRandomLicenseKeys();
	}
	public static boolean isActivationIdInList(List<ActivationDetails> processedActivationList, String activationId)
	{
		for(ActivationDetails activationDetail:processedActivationList)
		{
			if(activationDetail.getActivationId().equals(activationId))
			{
				return true;
			}
		}
		return false;
	}
}