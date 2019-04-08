package com.onlinestore.customerservice.services;

import com.onlinestore.customerservice.domain.Customer;

/**
 * {@link CustomerService} defines an interface that supports operations for managing customers.
 */
public interface CustomerService {
	/**
	 * Returns customer by specified id.
	 *
	 * @param customerId unique Id of the customer
	 * @return customer
	 */
	Customer getCustomerById(String customerId);

	/**
	 * Saves new customer.
	 *
	 * @param customer
	 */
	void saveCustomer(Customer customer);
}
