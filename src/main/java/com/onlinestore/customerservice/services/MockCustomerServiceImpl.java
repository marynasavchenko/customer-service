package com.onlinestore.customerservice.services;

import com.onlinestore.customerservice.model.Customer;


public class MockCustomerServiceImpl implements CustomerService {
	@Override
	public Customer getCustomerById(String customerId) {
		return new Customer();
	}

	@Override
	public void saveCustomer(Customer customer) {

	}
}
