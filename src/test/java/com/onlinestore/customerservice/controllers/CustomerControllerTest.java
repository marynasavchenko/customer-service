package com.onlinestore.customerservice.controllers;

import com.onlinestore.customerservice.services.CustomerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest
public class CustomerControllerTest {
	@Autowired
	private MockMvc mockMvc;

	private CustomerService customerService;

	@Test
	public void shouldGetCustomerById () throws Exception{
		mockMvc.perform(get("/v1/customers/CUSTOMER_ID")).andExpect(status().isOk());
		//verify(customerService).getCustomerById();
	}
}
