package com.onlinestore.customerservice.services;

import com.onlinestore.customerservice.domain.Customer;
import com.onlinestore.customerservice.exceptions.CustomerNotFoundException;
import com.onlinestore.customerservice.repositories.CustomerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CustomerServiceImplTest {
	private static final String ANY_CUSTOMER_ID = "1234";

	@Mock
	private CustomerRepository customerRepository;

	@Mock
	private Customer customer;

	private CustomerService customerService;

	@BeforeEach
	public void setUp() throws Exception {
		customerService = new CustomerServiceImpl(customerRepository);
	}

	@Test
	public void shouldGetCustomerById() throws Exception {
		when(customerRepository.findByCustomerId(ANY_CUSTOMER_ID)).thenReturn(Optional.of(customer));
		customerService.getCustomerById(ANY_CUSTOMER_ID);
		verify(customerRepository).findByCustomerId(ANY_CUSTOMER_ID);
	}

	@Test
	public void shouldThrowExceptionIfEmptyOptional() throws Exception {
		when(customerRepository.findByCustomerId(ANY_CUSTOMER_ID)).thenReturn(Optional.empty());

		assertThrows(CustomerNotFoundException.class, () -> customerService.getCustomerById(ANY_CUSTOMER_ID));
	}

	@Test
	public void shouldSaveCustomer() throws Exception {
		customerService.saveCustomer(customer);
		verify(customerRepository).save(customer);
	}

	@Test
	public void shouldDeleteCustomer() throws Exception {
		customerService.deleteCustomer(ANY_CUSTOMER_ID);
		verify(customerRepository).deleteById(ANY_CUSTOMER_ID);
	}
}