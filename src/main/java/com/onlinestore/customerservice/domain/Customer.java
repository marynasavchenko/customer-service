package com.onlinestore.customerservice.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

/**
 * Customer entity class.
 */
@Entity
@Table(name = "customers")
public class Customer {
	/**
	 * Unique Id of the customer.
	 */
	@Id
	@Column(name = "customer_id", nullable = false)
	private int customerId;

	/**
	 * Name of the customer.
	 */
	@Column(name = "customer_name", nullable = false)
	private String customerName;

	/**
	 * Address of the customer.
	 */
	@Column(name = "customer_address", nullable = false)
	private String customerAddress;

	/**
	 * Constructs new empty {@code Customer} instance.
	 */
	public Customer() {
	}

	/**
	 * Constructs new {@code Customer} instance.
	 *
	 * @param customerId      unique Id of the customer
	 * @param customerName    name of the customer
	 * @param customerAddress address of the customer
	 */
	public Customer(int customerId, String customerName, String customerAddress) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
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
