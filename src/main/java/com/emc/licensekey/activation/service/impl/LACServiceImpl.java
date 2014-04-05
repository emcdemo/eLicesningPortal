package com.emc.licensekey.activation.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.emc.licensekey.activation.dao.LACDao;
import com.emc.licensekey.activation.domain.LAC;
import com.emc.licensekey.activation.repository.ProductFactory;
import com.emc.licensekey.activation.service.LACService;


@Service
public class LACServiceImpl implements LACService{

	@Autowired
	private LACDao lacDao;
	
	@Autowired
	private ProductFactory productFactory;
	
	@Override
	public LAC getLacDetails(String lacId) {
		LAC lac = new LAC();
		lac.setId(lacId);
		lac.setProducts(productFactory.createProductFromProductList(lacDao.getProductsFromId(lacId)));
		lac.setFulFillmentDetails(lacDao.getFulFillmentDetailsFromId(lacId));
		return lac;
	}

}
