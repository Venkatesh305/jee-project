package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Orders;
import com.example.demo.repo.OrderServiceRepository;

@SpringBootApplication
public class OrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApplication.class, args);
	}
	@Bean
	public CommandLineRunner runner() {
		return new CommandLineRunner() {
			@Autowired
			OrderServiceRepository repo;
			@Override
			public void run(String... args) throws Exception {
				repo.save(new Orders(1,5,"ram",1,1));
				repo.save(new Orders(2,9,"sita",2,3));
				repo.save(new Orders(3,2,"lakshman",3,1));
				
			}
		};
	}
}
