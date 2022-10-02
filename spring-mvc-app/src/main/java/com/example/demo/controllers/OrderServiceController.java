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

import com.example.demo.entity.Orders;
import com.example.demo.entity.Products;

@Controller
public class OrderServiceController {
	@Autowired
	private RestTemplate template;
	@Autowired
	private Orders orders;
	public OrderServiceController(Orders orders) {
		super();
		this.setOrders(orders);
	}
	@GetMapping(path = "/orders")
	public String Orders() {
		return "orders";
	}
	@GetMapping(path = "/orders/displayallorders")
	public String showAllOrders(Model model) {
		model.addAttribute("list",template.getForObject("http://localhost:5050/list",Orders[].class));
		return "showallorders";
	}
	@GetMapping(path="/orders/displayordersbyorderId")
	public String showOrdersByOrderId() {
		return "showordersbyorderid";
	}
	@RequestMapping(path="/orders/displayordersbyorderId",method = RequestMethod.POST)
	public String showOrdersByOrderId(@RequestParam("orderId")int orderId,Model model) {
		model.addAttribute("list",template.getForObject("http://localhost:5050/list/"+orderId,Orders[].class));
		return "showordersbyorderid";
	}
	public Orders getOrders() {
		return orders;
	}
	public void setOrders(Orders orders) {
		this.orders = orders;
	}
	@GetMapping(path = "/orders/addorder")
	public String initPage(Model model) {
		model.addAttribute("command",orders);
		return "addorder";
	}
	@RequestMapping(path = "/orders/addorder",method = RequestMethod.POST)
	public String onSubmit(@ModelAttribute("command") Orders obj,Model model ) {
		template.postForLocation("http://localhost:5050/save", obj);
		model.addAttribute("message","order added");
		System.out.println(obj);
		return "addorder";
	}
}









