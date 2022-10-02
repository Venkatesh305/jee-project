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

import com.example.demo.entity.Orders;
import com.example.demo.services.OrderService;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@RestController
@RequestMapping(path = "/")
@AllArgsConstructor
@NoArgsConstructor
public class OrderServiceController {
	
	@Autowired
	private OrderService service;
	
	@GetMapping("/list")
	public List<Orders> getAll(){
		return this.service.findAll();
	} 
	
	@PostMapping("/save")
	public ResponseEntity<Orders> add(@RequestBody Orders entity){
		Orders addedObj=this.service.add(entity);
		return ResponseEntity.ok().body(null);
	}
	
	@GetMapping("/{orderId}")
	public List<Orders> findById(@PathVariable("orderId") int orderId) {
		return this.service.findByOrderId(orderId);
	}
	
	@PutMapping("/save")
	public ResponseEntity<Orders> update(@RequestBody Orders entity){
		Orders addedObj=this.service.update(entity);
		return ResponseEntity.ok().body(null);
	}
}







