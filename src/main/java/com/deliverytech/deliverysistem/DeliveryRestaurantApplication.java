package com.deliverytech.deliverysistem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@SpringBootApplication
public class DeliveryRestaurantApplication {
	
	@GetMapping
	public String getHomeTeste() {
		return "Delivery Restaurant - API Home";
	}

	public static void main(String[] args) {
		SpringApplication.run(DeliveryRestaurantApplication.class, args);
	}

}
