package com.onlinestore.customerservice.controllers;

import com.onlinestore.customerservice.domain.Customer;
import com.onlinestore.customerservice.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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
	 * GET  /{customerId} : gets customer by id.
	 *
	 * @param customerId unique id of the customer
	 * @return customer
	 */
	@GetMapping("/{customerId}")
	public Customer getCustomerById(@PathVariable("customerId") String customerId) {
		return customerService.getCustomerById(customerId);
	}

	/**
	 * POST / : saves new customer.
	 *
	 * @param customer customer to be saved
	 */
	@PostMapping("/")
	public void addNewCustomer(Customer customer) {
		customerService.saveCustomer(customer);
	}

	/**
	 * DELETE  /{customerId} : deletes customer by id.
	 *
	 * @param customerId unique id of the customer
	 */
	@DeleteMapping(value = "/{customerId}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteCustomer(@PathVariable("customerId") String customerId) {
		customerService.deleteCustomer(customerId);
	}
}
