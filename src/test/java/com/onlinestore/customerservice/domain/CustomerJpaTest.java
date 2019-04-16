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
	@Autowired
	private TestEntityManager entityManager;

	@Test
	public void shouldMapCustomerEntity() throws Exception {
		Customer customer = this.entityManager.persistAndFlush(new Customer(null, "Jane", "New York"));
		Assertions.assertThat(customer.getCustomerId()).isNotNull();
		Assertions.assertThat(customer.getCustomerId()).inUnicode();
	}
}