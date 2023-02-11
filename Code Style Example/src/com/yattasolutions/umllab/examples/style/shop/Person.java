package com.yattasolutions.umllab.examples.style.shop;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Person implements Human {
	private static final Logger log = Logger
			.getLogger("com.yattasolutions.umllab.examples.style.shop.Person");

	/**
	 * <pre>
	 *           1..1     1..1
	 * Person ------------------------> Address
	 *           &lt;       address
	 * </pre>
	 */
	private Address address;

	private String name;

	private int age;

	private String gender;

	public void setAddress(Address value) {
		this.address = value;
	}

	public int getAge() {
		return this.age;
	}

	public String getGender() {
		return this.gender;
	}

	public String getName() {
		return this.name;
	}

	public Address getAddress() {
		return this.address;
	}

	public void setAge(int value) {
		log.log(Level.FINE, "change age");
		this.age = value;
	}

	public void setGender(String value) {
		log.log(Level.FINE, "change gender");
		this.gender = value;
	}

	public void setName(String value) {
		log.log(Level.FINE, "change name");
		this.name = value;
	}

}
