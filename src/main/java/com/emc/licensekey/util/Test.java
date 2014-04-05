package com.emc.licensekey.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import com.emc.licensekey.activation.request.ActivateProductDetail;
import com.emc.licensekey.activation.request.LacProductActivationRequest;

public class Test {

	public static void main(String args[])
	{
		LacProductActivationRequest obj = new LacProductActivationRequest();
		obj.setLacId("12313213");
		List<ActivateProductDetail> list = new ArrayList<ActivateProductDetail>();
		ActivateProductDetail prod = new ActivateProductDetail();
		prod.setActivatedQty(10);
		prod.setProductId("1");
		list.add(prod);
		prod = new ActivateProductDetail();
		prod.setActivatedQty(5);
		prod.setProductId("2");
		list.add(prod);
		obj.setActivateProductList(list);
		try {
			System.out.println(JsonUtil.getJSonString(obj));
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
