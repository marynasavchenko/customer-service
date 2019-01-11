package com.onlinestore.customerservice.repository;

import com.onlinestore.customerservice.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, String>{
	Customer findByCustomerId(String customerId);
}
