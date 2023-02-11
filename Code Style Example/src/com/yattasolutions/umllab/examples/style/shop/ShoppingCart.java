package com.yattasolutions.umllab.examples.style.shop;

import java.util.HashSet;
import java.util.Set;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ShoppingCart {
	/**
	 * <pre>
	 *           1..1     0..*
	 * ShoppingCart ------------------------- Product
	 *           shoppingCart        &lt;       products
	 * </pre>
	 */
	private Set<Product> products;

	public Set<Product> getProducts() {
		if (this.products == null) {
			this.products = new HashSet<Product>();
		}
		return this.products;
	}

	private long cartId;

	/**
	 * <pre>
	 *           1..1     1..1
	 * ShoppingCart ------------------------- Customer
	 *           shoppingCart        &gt;       customer
	 * </pre>
	 */
	private Customer customer;

	public long getCartId() {
		return this.cartId;
	}

	public void setCustomer(Customer value) {
		this.customer = value;
	}

	public void setCartId(long value) {
		log.log(Level.FINE, "change cartId");
		this.cartId = value;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	private static final Logger log = Logger
			.getLogger("com.yattasolutions.umllab.examples.style.shop.ShoppingCart");

}
