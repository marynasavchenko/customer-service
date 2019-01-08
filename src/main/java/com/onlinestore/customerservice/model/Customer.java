package com.onlinestore.customerservice.model;

import java.util.Objects;

public class Customer {
	private int customerId;

	private String customerName;

	private String customerAddress;

	public Customer() {

	}

	public Customer(int customerId, String customerName, String customerAdress) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAdress;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Customer customer = (Customer) o;
		return customerId == customer.customerId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(customerId);
	}

	@Override
	public String toString() {
		return "Customer{" +
				"customerId=" + customerId +
				", customerName='" + customerName + '\'' +
				", customerAddress='" + customerAddress + '\'' +
				'}';
	}
}
