package com.onlinestore.customerservice.services;

import com.onlinestore.customerservice.domain.Customer;
import com.onlinestore.customerservice.exceptions.CustomerNotFoundException;
import com.onlinestore.customerservice.repositories.CustomerRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Optional;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CustomerServiceImplTest {
	private static final String ANY_CUSTOMER_ID = "1234";

	@Mock
	private CustomerRepository customerRepository;

	@Mock
	private Customer customer;

	private CustomerService customerService;

	@Before
	public void setUp() throws Exception {
		customerService = new CustomerServiceImpl(customerRepository);
	}

	@Test
	public void shouldGetCustomerById() throws Exception {
		when(customerRepository.findByCustomerId(ANY_CUSTOMER_ID)).thenReturn(Optional.of(customer));
		customerService.getCustomerById(ANY_CUSTOMER_ID);
		verify(customerRepository).findByCustomerId(ANY_CUSTOMER_ID);
	}

	@Test(expected = CustomerNotFoundException.class)
	public void shouldThrowExceptionIfEmptyOptional() throws Exception {
		when(customerRepository.findByCustomerId(ANY_CUSTOMER_ID)).thenReturn(Optional.empty());
		customerService.getCustomerById(ANY_CUSTOMER_ID);
	}

	@Test
	public void shouldSaveCustomer() throws Exception {
		customerService.saveCustomer(customer);
		verify(customerRepository).save(customer);

	}
}