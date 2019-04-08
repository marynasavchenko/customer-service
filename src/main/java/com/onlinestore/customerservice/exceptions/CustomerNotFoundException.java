package com.onlinestore.customerservice.exceptions;

/**
 * Exception thrown when customer can not be found.
 */
public class CustomerNotFoundException extends RuntimeException {
	/**
	 * Constructs new CustomerNotFoundException instance.
	 *
	 * @param customerId unique Id of the customer.
	 */
	public CustomerNotFoundException(String customerId) {
		super("Customer not found" + customerId);
	}
}
