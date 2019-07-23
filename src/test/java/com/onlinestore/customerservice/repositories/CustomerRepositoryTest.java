package com.onlinestore.customerservice.repositories;

import com.onlinestore.customerservice.domain.Customer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith(SpringExtension.class)
@DataJpaTest
public class CustomerRepositoryTest {
	private static final String ANY_CUSTOMER_ID = "123";
	private static final String ANY_CUSTOMER_NAME = "Jane";
	private static final String ANY_CUSTOMER_ADDRESS = "New York";

	private Customer customer;

	@Autowired
	private CustomerRepository customerRepository;

	@BeforeEach
	public void setUp() throws Exception {
		customer = new Customer(null, ANY_CUSTOMER_NAME, ANY_CUSTOMER_ADDRESS);
	}

	@AfterEach
	public void tearDown() throws Exception {
		customerRepository.deleteAll();
	}

	@Test
	public void shouldFindCustomerByIdIfPresent() throws Exception {
		customerRepository.save(customer);
		Optional<Customer> optionalCustomer = customerRepository.findByCustomerId(customer.getCustomerId());
		assertEquals(customer, optionalCustomer.get());
	}

	@Test
	public void shouldReturnEmptyOptionalWhenNoSuchId() throws Exception {
		Optional<Customer> optionalCustomer = customerRepository.findByCustomerId(ANY_CUSTOMER_ID);
		assertEquals(Optional.empty(), optionalCustomer);
	}

	@Test
	public void shouldDeleteCustomerById() throws Exception {
		customerRepository.save(customer);

		customerRepository.deleteById(customer.getCustomerId());
		Optional<Customer> optionalCustomer = customerRepository.findByCustomerId(customer.getCustomerId());
		assertEquals(Optional.empty(), optionalCustomer);
	}
}