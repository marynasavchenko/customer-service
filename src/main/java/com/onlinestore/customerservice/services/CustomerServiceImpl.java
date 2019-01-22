package com.onlinestore.customerservice.services;

import com.onlinestore.customerservice.model.Customer;
import com.onlinestore.customerservice.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository;

	@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@Override
	public Customer getCustomerById(String customerId) {
		return customerRepository.findByCustomerId(customerId);
	}

	@Override
	public void saveCustomer(Customer customer) {
		customerRepository.save(customer);
	}

}
