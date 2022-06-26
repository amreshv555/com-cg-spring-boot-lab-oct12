package com.cg.spring.boot.labbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import com.cg.spring.boot.labbook.model.MobileProducts;
import com.cg.spring.boot.labbook.service.MobileProductsService;

@Controller
public class MobileProductsController {
	
	@Autowired
	private MobileProductsService mobService;
	
	@GetMapping("/getmobilebyid/{productId}")
	public ResponseEntity<MobileProducts> getMobileProductById(@PathVariable(name = "productId") int productId){
		
		MobileProducts mobProd = mobService.getMobileProductById(productId);
		
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "This mobile is available in the database.");
		headers.add("successCode", "10");
	
		ResponseEntity<MobileProducts> response = new ResponseEntity<MobileProducts>(mobProd, headers, HttpStatus.OK);
		
		return response;
		
	}
	@PostMapping("/addmobile")
	public ResponseEntity<MobileProducts> addMobileProductById(@RequestBody MobileProducts mobileProducts){
		
		MobileProducts mobProd = mobService.addMobileProducts(mobileProducts);
		
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "This mobile is available in the database.");
		headers.add("successCode", "10");
	
		ResponseEntity<MobileProducts> response = new ResponseEntity<MobileProducts>(mobProd, headers, HttpStatus.OK);
		
		return response;
		
	}
	@PostMapping("/updatemobile")
	public ResponseEntity<MobileProducts> updateMobileProductById(@RequestBody MobileProducts mobileProducts){
		
		MobileProducts mobProd = mobService.updateMobileProducts(mobileProducts);
		
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "This mobile is available in the database.");
		headers.add("successCode", "10");
	
		ResponseEntity<MobileProducts> response = new ResponseEntity<MobileProducts>(mobProd, headers, HttpStatus.OK);
		
		return response;
		
	}
	@DeleteMapping("/deletemobilebyid/{productId}")
	public ResponseEntity<MobileProducts> deleteMobileProductById(@PathVariable(name = "productId") int productId){
		
		MobileProducts mobProd = mobService.deleteMobileProducts(productId);
		
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "This mobile is available in the database.");
		headers.add("successCode", "10");
	
		ResponseEntity<MobileProducts> response = new ResponseEntity<MobileProducts>(mobProd, headers, HttpStatus.OK);
		
		return response;
		
	}
	
	

}
