package com.example.demo.design;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.service.TestService;

@Component
public  class KycValidationProviderFactory {

	@Autowired
	List<TestService> kycValidationProviders;
	
	Map<String, TestService> kycValidationProviderMap;
	
	@PostConstruct
	public void init() {
		kycValidationProviderMap = new HashMap<>();
		for (TestService kycValidationProviderInterface : kycValidationProviders) {
			kycValidationProviderMap.put(kycValidationProviderInterface.getProvider(), kycValidationProviderInterface);
		}
	}
	
	public  TestService getKycValidationProvider(String provider) {
		return kycValidationProviderMap.get(provider);
	}
}
