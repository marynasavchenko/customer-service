package com.onlinestore.customerservice.repositories;

import com.onlinestore.customerservice.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Spring Data JPA repository for Customer entity that supports CRUD operations.
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {
	/**
	 * Looks up customer in the database.
	 *
	 * @param customerId unique Id of the customer
	 * @return Optional of customer
	 */
	Optional<Customer> findByCustomerId(String customerId);
}
