package com.onlinestore.customerservice.controllers;

import com.onlinestore.customerservice.domain.Customer;
import com.onlinestore.customerservice.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Rest controller for managing customers information.
 */
@RestController
@RequestMapping("/v1/customers")
public class CustomerController {
	/**
	 * Service that supports operations with customers.
	 */
	private CustomerService customerService;

	/**
	 * Constructs new {@code OrderController} instance.
	 *
	 * @param customerService service that supports operations with customers
	 */
	@Autowired
	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
	}

	/**
	 * GET  / : gets customer by id.
	 *
	 * @param customerId unique id of the customer
	 * @return customer
	 */
	@GetMapping("/{customerId}")
	public Customer getCustomerById(@PathVariable("customerId") String customerId) {
		return customerService.getCustomerById(customerId);
	}
}
