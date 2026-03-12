package com.example.product_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.product_service.products.OrderProducts;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private OrderProducts orderProducts;
	
	@GetMapping
	public String getOrders() {
		String orders = orderProducts.getOrders();
		return "Product Service Called -> "+orders;
	}
}
