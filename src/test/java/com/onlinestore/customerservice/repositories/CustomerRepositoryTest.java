package com.onlinestore.customerservice.repositories;

import com.onlinestore.customerservice.domain.Customer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)
@DataJpaTest
public class CustomerRepositoryTest {
	private static final String ANY_CUSTOMER_ID = "123";
	private static final String ANY_CUSTOMER_NAME = "Jane";
	private static final String ANY_CUSTOMER_ADDRESS = "New York";

	private Customer customer;

	@Autowired
	private CustomerRepository customerRepository;

	@Before
	public void setUp() throws Exception {
		customer = new Customer(ANY_CUSTOMER_ID, ANY_CUSTOMER_NAME, ANY_CUSTOMER_ADDRESS);
	}

	@After
	public void tearDown() throws Exception {
		customerRepository.deleteAll();
	}

	@Test
	public void shouldFindCustomerByIdIfPresent() throws Exception {
		customerRepository.save(customer);
		Optional<Customer> optionalCustomer = customerRepository.findByCustomerId(ANY_CUSTOMER_ID);
		assertEquals(customer, optionalCustomer.get());
	}

	@Test
	public void shouldReturnEmptyOptionalWhenNoSuchId() throws Exception {
		Optional<Customer> optionalCustomer = customerRepository.findByCustomerId(ANY_CUSTOMER_ID);
		assertEquals(Optional.empty(), optionalCustomer);
	}
}