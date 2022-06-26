package com.cg.spring.boot.labbook.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cg.spring.boot.labbook.model.MobileProducts;
import com.cg.spring.boot.labbook.repoistory.MobileProductsRepo;

@Service
public class MobileProductsService {
	
	@Autowired
	private MobileProductsRepo mobilerepo;
	
	public MobileProducts getMobileProductById(int productId) {
		Optional<MobileProducts> mobOpt = mobilerepo.findById(productId);
		if(mobOpt.isPresent()) {
			return mobOpt.get();
		}else {
			return null;
		}
	}
    
	public MobileProducts addMobileProducts(MobileProducts mobileProducts) {
		if(!mobilerepo.existsById(mobileProducts.getProductId())) {
			return mobilerepo.save(mobileProducts);
		}else {
			return null;
		}
	}
	
	public MobileProducts  deleteMobileProducts(int productId) {
		Optional<MobileProducts> mobOpt = mobilerepo.findById(productId);
		if(mobOpt.isPresent()) {
			mobilerepo.deleteById(productId);
			return mobOpt.get();
		}else {
			return null;
		}
	}
	
	public MobileProducts updateMobileProducts(MobileProducts mobileProducts) {
		if(mobilerepo.existsById(mobileProducts.getProductId())) {
			return mobilerepo.save(mobileProducts);
		}else {
			return null;
		}
	}
	
	
}
