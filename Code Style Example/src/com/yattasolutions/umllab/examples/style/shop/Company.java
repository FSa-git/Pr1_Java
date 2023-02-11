package com.yattasolutions.umllab.examples.style.shop;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Company {
	private static final Logger log = Logger
			.getLogger("com.yattasolutions.umllab.examples.style.shop.Company");
	/**
	 * <pre>
	 *           0..1     0..*
	 * Company ------------------------- Employee
	 *           employer        &lt;       employees
	 * </pre>
	 */
	private Set<Employee> employees;
	private String companyName;

	/**
	 * <pre>
	 *           0..*     0..*
	 * Company ------------------------- Customer
	 *           companies        &lt;       customers
	 * </pre>
	 */
	private Set<Customer> customers;

	/**
	 * <pre>
	 *           1..1     0..*
	 * Company ------------------------- Webshop
	 *           company        &lt;       webshops
	 * </pre>
	 */
	private Set<Webshop> webshops;

	/**
	 * <pre>
	 *           1..1     1..1
	 * Company ------------------------> Address
	 *           &lt;       address
	 * </pre>
	 */
	private Address address;

	public void setAddress(Address value) {
		this.address = value;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public Address getAddress() {
		return this.address;
	}

	public void setCompanyName(String value) {
		log.log(Level.FINE, "change companyName");
		this.companyName = value;
	}

	public Set<Customer> getCustomers() {
		if (this.customers == null) {
			this.customers = new HashSet<Customer>();
		}
		return this.customers;
	}

	public Set<Employee> getEmployees() {
		if (this.employees == null) {
			this.employees = new HashSet<Employee>();
		}
		return this.employees;
	}

	public Set<Webshop> getWebshops() {
		if (this.webshops == null) {
			this.webshops = new HashSet<Webshop>();
		}
		return this.webshops;
	}

}
