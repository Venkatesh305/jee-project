package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Products;

public interface ProductServiceRepository extends JpaRepository<Products, Integer> {
	List<Products> findByMerchant(String merchant);
	
	@Query(value="select * from products where product_inventory>0",nativeQuery=true)
	List<Products> findByAvailability();
	
	@Query(value="select * from products where product_inventory=0",nativeQuery=true)
	List<Products> findByNotAvailability();
}



