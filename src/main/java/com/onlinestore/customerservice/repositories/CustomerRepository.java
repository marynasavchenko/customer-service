package com.onlinestore.customerservice.repositories;

import com.onlinestore.customerservice.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {
	Customer findByCustomerId(String customerId);
}
