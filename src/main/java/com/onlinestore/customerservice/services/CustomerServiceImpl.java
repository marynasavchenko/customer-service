package com.onlinestore.customerservice.services;

import com.onlinestore.customerservice.model.Customer;
import com.onlinestore.customerservice.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

CustomerRepository customerRepository;

	@Override
	public Customer getCustomerById(String customerId) {
		return null;
	}
}
