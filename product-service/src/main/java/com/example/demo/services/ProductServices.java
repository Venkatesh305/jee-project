package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Products;
import com.example.demo.repo.ProductServiceRepository;

@Service
public class ProductServices {

	@Autowired
	private ProductServiceRepository repo;
	
	public ProductServices(ProductServiceRepository repo) {
		super();
		this.repo=repo;
	}
	
	public List<Products> findAll(){
		return this.repo.findAll();
	}

	public List<Products> findByMerchant(String merchant) {
		// TODO Auto-generated method stub
		return this.repo.findByMerchant(merchant);
	}

	public List<Products> findByAvailability() {
		// TODO Auto-generated method stub
		return this.repo.findByAvailability();
	}

	public List<Products> findByNotAvailability() {
		// TODO Auto-generated method stub
		return this.repo.findByNotAvailability();
	}

	public Products add(Products entity) {
		return this.repo.save(entity);
	}

	public Products update(Products entity) {
		// TODO Auto-generated method stub
		return this.repo.save(entity);
	}
}
