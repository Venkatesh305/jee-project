package com.example.demo.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.Products;
@Controller
public class ProductServiceController {
	@Autowired
	private RestTemplate template;
	@Autowired
	private Products products;
	public ProductServiceController(Products products) {
		super();
		this.products =  products;
	}
	@GetMapping(path = "/products")
	public String Products() {
		return "products";
	}
	@GetMapping(path = "/products/showallproducts")
	public String showAllProducts(Model model) {
		model.addAttribute("list",template.getForObject("http://localhost:8080/list",Products[].class));
		return "showallproducts";
	}
	@GetMapping(path = "/products/addproduct")
	public String initPage(Model model) {
		model.addAttribute("command",products);
		return "addproduct";
	}
	@RequestMapping(path = "/products/addproduct",method = RequestMethod.POST)
	public String onSubmit(@ModelAttribute("command") Products obj,Model model ) {
		template.postForLocation("http://localhost:8080/save", obj);
		model.addAttribute("message","product added");
		System.out.println(obj);
		return "addproduct";
	}
	@GetMapping(path = "/products/displayproductbymerchant")
	public String ShowAllProductByMerchant() {
		return "showallproductsbymerchant";
	}
	@RequestMapping(path="/products/displayproductbymerchant",method = RequestMethod.POST)
	public String ShowAllProductByMerchant(@RequestParam("merchant")String merchant,Model model) {
		model.addAttribute("list",template.getForObject("http://localhost:8080/list/"+merchant,Products[].class));
		return "showallproductsbymerchant";
	}

}






