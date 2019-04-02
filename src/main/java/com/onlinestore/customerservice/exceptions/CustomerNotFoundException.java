package com.onlinestore.customerservice.exceptions;

/**
 * Exception thrown when customer can not be found.
 */
public class CustomerNotFoundException extends RuntimeException {
	public CustomerNotFoundException(String customerId) {
		super("Customer not found" + customerId);
	}
}
