package com.emc.licensekey.activation.keyGenerator;
import org.springframework.security.crypto.keygen.KeyGenerators;

public class MockLicenseKeyGenerator {

	public static String getRandomLicenseKey()
	{
		return KeyGenerators.string().generateKey();
	}
}