package com.onlinestore.customerservice.services;

import com.onlinestore.customerservice.domain.Customer;

public interface CustomerService {
	Customer getCustomerById(String customerId);
	void saveCustomer(Customer customer);
}
