package com.example.product_service.products;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "order-service")
public interface OrderProducts {
	
	@GetMapping("/orders")
	String getOrders();

}
