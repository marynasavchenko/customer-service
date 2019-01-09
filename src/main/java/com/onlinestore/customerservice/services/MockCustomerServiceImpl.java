package com.onlinestore.customerservice.services;

import com.onlinestore.customerservice.model.Customer;
import org.springframework.stereotype.Service;

@Service
public class MockCustomerServiceImpl implements CustomerService {
	@Override
	public Customer getCustomerById(String customerId) {
		return new Customer();
	}
}
