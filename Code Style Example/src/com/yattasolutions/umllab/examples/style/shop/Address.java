package com.yattasolutions.umllab.examples.style.shop;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Address {
	private static final Logger log = Logger
			.getLogger("com.yattasolutions.umllab.examples.style.shop.Address");
	private String name;

	private String street;

	private Integer houseNumber;

	private Integer zipCode;

	private String city;

	private String district;

	private String country;

	public String getCity() {
		return this.city;
	}

	public String getCountry() {
		return this.country;
	}

	public String getDistrict() {
		return this.district;
	}

	public Integer getHouseNumber() {
		return this.houseNumber;
	}

	public String getName() {
		return this.name;
	}

	public String getStreet() {
		return this.street;
	}

	public Integer getZipCode() {
		return this.zipCode;
	}

	public void setCity(String value) {
		log.log(Level.FINE, "change city");
		this.city = value;
	}

	public void setCountry(String value) {
		log.log(Level.FINE, "change country");
		this.country = value;
	}

	public void setDistrict(String value) {
		log.log(Level.FINE, "change district");
		this.district = value;
	}

	public void setHouseNumber(Integer value) {
		log.log(Level.FINE, "change houseNumber");
		this.houseNumber = value;
	}

	public void setName(String value) {
		log.log(Level.FINE, "change name");
		this.name = value;
	}

	public void setStreet(String value) {
		log.log(Level.FINE, "change street");
		this.street = value;
	}

	public void setZipCode(Integer value) {
		log.log(Level.FINE, "change zipCode");
		this.zipCode = value;
	}

}
