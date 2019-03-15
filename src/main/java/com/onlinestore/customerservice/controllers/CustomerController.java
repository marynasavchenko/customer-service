package com.onlinestore.customerservice.controllers;

import com.onlinestore.customerservice.domain.Customer;
import com.onlinestore.customerservice.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/customers")
public class CustomerController {

	private CustomerService customerService;

	@Autowired
	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
	}

	@GetMapping("/{customerId}")
	public Customer getCustomerById(@PathVariable("customerId") String customerId) {
		return customerService.getCustomerById(customerId);
	}
}
