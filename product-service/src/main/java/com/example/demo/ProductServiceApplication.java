package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Products;
import com.example.demo.repo.ProductServiceRepository;

@SpringBootApplication
public class ProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}
	@Bean
	public CommandLineRunner runner() {
		return new CommandLineRunner() {
			@Autowired
			ProductServiceRepository repo;
			@Override
			public void run(String... args) throws Exception {
				repo.save(new Products(1,"venky","grocery","Chain",5000,1));
				repo.save(new Products(2,"ram","grocery","watch",10000,0));
				repo.save(new Products(3,"sita","grocery","ring",500,1));
			
			}
		};
	}
}



