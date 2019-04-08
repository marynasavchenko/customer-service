package com.onlinestore.customerservice.services;

import com.onlinestore.customerservice.domain.Customer;
import com.onlinestore.customerservice.exceptions.CustomerNotFoundException;
import com.onlinestore.customerservice.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Implementation of the {@link CustomerService} interface.
 */
@Service
public class CustomerServiceImpl implements CustomerService {
	/**
	 * Spring Data repository for customers.
	 */
	private CustomerRepository customerRepository;

	/**
	 * Constructs new {@code CustomerServiceImpl} instance.
	 *
	 * @param customerRepository Spring Data repository for customers
	 */
	@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	/**
	 * Returns customer by id.
	 *
	 * @param customerId unique Id of the customer
	 * @return customer if customer is present
	 * @throws CustomerNotFoundException when {@code CustomerRepository} returns empty Optional
	 */
	@Override
	public Customer getCustomerById(String customerId) {
		return customerRepository.findByCustomerId(customerId).orElseThrow(() -> new CustomerNotFoundException(customerId));
	}

	/**
	 * Saves new customer.
	 *
	 * @param customer
	 */
	@Override
	public void saveCustomer(Customer customer) {
		customerRepository.save(customer);
	}

}
