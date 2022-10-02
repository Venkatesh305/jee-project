package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Orders;


public interface OrderServiceRepository extends JpaRepository<Orders, Integer> {
	List<Orders> findByOrderId(int orderId);
}
