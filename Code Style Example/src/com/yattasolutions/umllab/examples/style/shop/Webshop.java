package com.yattasolutions.umllab.examples.style.shop;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Webshop {

	/**
	 * <pre>
	 *           0..*     0..*
	 * Webshop ------------------------- ProductCategory
	 *           offeredBy        &gt;       offers
	 * </pre>
	 */
	private Set<ProductCategory> offers;
	private String shopName;

	private String address;

	/**
	 * <pre>
	 *           0..*     1..1
	 * Webshop ------------------------- Company
	 *           webshops        &gt;       company
	 * </pre>
	 */
	private Company company;

	public String getAddress() {
		return this.address;
	}

	public void setCompany(Company value) {
		this.company = value;
	}

	public String getShopName() {
		return this.shopName;
	}

	public void setAddress(String value) {
		log.log(Level.FINE, "change address");
		this.address = value;
	}

	public Company getCompany() {
		return this.company;
	}

	public Set<ProductCategory> getOffers() {
		if (this.offers == null) {
			this.offers = new HashSet<ProductCategory>();
		}
		return this.offers;
	}

	public void setShopName(String value) {
		log.log(Level.FINE, "change shopName");
		this.shopName = value;
	}

	private static final Logger log = Logger
			.getLogger("com.yattasolutions.umllab.examples.style.shop.Webshop");
}
