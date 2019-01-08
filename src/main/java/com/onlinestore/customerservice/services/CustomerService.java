package com.onlinestore.customerservice.services;

import com.onlinestore.customerservice.model.Customer;

public interface CustomerService {
	Customer getCustomerById(String customerId);
}
