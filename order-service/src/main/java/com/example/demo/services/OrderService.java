package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Orders;
import com.example.demo.repo.OrderServiceRepository;

@Service
public class OrderService {

	@Autowired
	private OrderServiceRepository repo;
	
	public OrderService(OrderServiceRepository repo) {
		super();
		this.repo=repo;
	}
	
	public List<Orders> findAll(){
		return this.repo.findAll();
	}

	public Orders add(Orders entity) {
		return this.repo.save(entity);
	}

	public Orders update(Orders entity) {
		// TODO Auto-generated method stub
		return this.repo.save(entity);
	}

	public List<Orders> findByOrderId(int orderId) {
		// TODO Auto-generated method stub
		return this.repo.findByOrderId(orderId);
	}
	
	
}
