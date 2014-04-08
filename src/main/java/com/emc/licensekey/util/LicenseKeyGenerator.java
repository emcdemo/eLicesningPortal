package com.emc.licensekey.util;

public class LicenseKeyGenerator {

	private static final String CHAR_LIST = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
	private static final int RANDOM_STRING_LENGTH = 4;
	private static int count = 1237;
	private static int remainder = 1;
	/**
	 * This method generates random string
	 * 
	 * @return
	 */
	private static String generateRandomString() {

		StringBuffer randStr = new StringBuffer();
		for (int i = 0; i < RANDOM_STRING_LENGTH; i++) {
			int number = getRandomNumber();
			char ch = CHAR_LIST.charAt(number);
			randStr.append(ch);
		}
		return randStr.toString();
	}

	/**
	 * This method generates random numbers
	 * 
	 * @return int
	 */
	private static int getRandomNumber() {
		count = count+12312;
		if(count > 1231231)
		{
			count =123213;
		}
		return (count%remainder++)%CHAR_LIST.length();
	}

	/**
	 * This method generates license keys
	 * 
	 * @return String
	 */
	
	public static String generateLicenseKey() {

		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append(generateRandomString());
		stringBuffer.append("-");
		stringBuffer.append(generateRandomString());
		stringBuffer.append("-");
		stringBuffer.append(generateRandomString());
		stringBuffer.append("-");
		stringBuffer.append(generateRandomString());

		return stringBuffer.toString();

	}

	public static String getRandomLicenseKeys()
	{
		return generateLicenseKey();
	}
	public static void main(String args[])
	{
		System.out.println(getRandomLicenseKeys());
	}
}
