package com.onlinestore.customerservice.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
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
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	@Column(name = "customer_id", nullable = false)
	private String customerId;

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
	public Customer(String customerId, String customerName, String customerAddress) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
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
		return customerId.equals(customer.customerId);
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
