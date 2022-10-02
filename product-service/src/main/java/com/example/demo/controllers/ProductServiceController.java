package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Products;
import com.example.demo.services.ProductServices;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@RestController
@RequestMapping(path = "/")
@AllArgsConstructor
@NoArgsConstructor
public class ProductServiceController {
	
	@Autowired
	private ProductServices service;
	
	@GetMapping("/list")
	public List<Products> getAll(){
		return this.service.findAll();
	} 

	@GetMapping("/list/{merchant}")
	public List<Products> findById(@PathVariable("merchant") String merchant) {
		return this.service.findByMerchant(merchant);
	}
	
	@GetMapping("/list/available")
	public List<Products> findByAvailability(){
		return this.service.findByAvailability();
	}
	
	@GetMapping("/list/not-available")
	public List<Products> findByNotAvailability(){
		return this.service.findByNotAvailability();
	}
	
	@PostMapping("/save")
	public ResponseEntity<Products> add(@RequestBody Products entity){
		Products addedObj=this.service.add(entity);
		return ResponseEntity.ok().body(null);
	}
	
	@PutMapping("/save")
	public ResponseEntity<Products> update(@RequestBody Products entity){
		Products addedObj=this.service.update(entity);
		return ResponseEntity.ok().body(null);
	}
}







