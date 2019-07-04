package com.onlinestore.customerservice.domain;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

@DataJpaTest
@RunWith(SpringRunner.class)
public class CustomerJpaTest {
	private static final String ANY_CUSTOMER_NAME = "Anthony";
	private static final String ANY_CUSTOMER_ADDRESS = "Berlin";

	@Autowired
	private TestEntityManager entityManager;

	@Test
	public void shouldMapCustomerEntity() throws Exception {
		Customer customer = this.entityManager.persistAndFlush(new Customer(null, ANY_CUSTOMER_NAME, ANY_CUSTOMER_ADDRESS));
		Assertions.assertThat(customer.getCustomerId()).isNotNull();
	}
}