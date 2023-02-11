package com.yattasolutions.umllab.examples.style.shop;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Customer extends Person {
	/**
	 * <pre>
	 *           1..1     1..1
	 * Customer ------------------------- ShoppingCart
	 *           customer        &lt;       shoppingCart
	 * </pre>
	 */
	private ShoppingCart shoppingCart;

	public void setShoppingCart(ShoppingCart value) {
		this.shoppingCart = value;
	}

	public ShoppingCart getShoppingCart() {
		return this.shoppingCart;
	}

	private static final Logger log = Logger
			.getLogger("com.yattasolutions.umllab.examples.style.shop.Customer");
	private long customerId;

	/**
	 * <pre>
	 *           0..*     0..*
	 * Customer ------------------------- Company
	 *           customers        &gt;       companies
	 * </pre>
	 */
	private Set<Company> companies;

	public long getCustomerId() {
		return this.customerId;
	}

	public Set<Company> getCompanies() {
		if (this.companies == null) {
			this.companies = new HashSet<Company>();
		}
		return this.companies;
	}

	public void setCustomerId(long value) {
		log.log(Level.FINE, "change customerId");
		this.customerId = value;
	}

}
