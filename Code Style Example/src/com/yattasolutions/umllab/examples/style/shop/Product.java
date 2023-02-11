package com.yattasolutions.umllab.examples.style.shop;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Product {
	private static final Logger log = Logger
			.getLogger("com.yattasolutions.umllab.examples.style.shop.Product");
	private long productId;

	private String description;

	private String labelling;

	private double price;

	/**
	 * <pre>
	 *           0..*     1..1
	 * Product ------------------------- ShoppingCart
	 *           products        &gt;       shoppingCart
	 * </pre>
	 */
	private ShoppingCart shoppingCart;

	/**
	 * <pre>
	 *           0..*     0..*
	 * Product ------------------------- ProductCategory
	 *           products        &gt;       category
	 * </pre>
	 */
	private Set<ProductCategory> category;

	public String getDescription() {
		return this.description;
	}

	public String getLabelling() {
		return this.labelling;
	}

	public double getPrice() {
		return this.price;
	}

	public long getProductId() {
		return this.productId;
	}

	public void setShoppingCart(ShoppingCart value) {
		this.shoppingCart = value;
	}

	public Set<ProductCategory> getCategory() {
		if (this.category == null) {
			this.category = new HashSet<ProductCategory>();
		}
		return this.category;
	}

	public void setDescription(String value) {
		log.log(Level.FINE, "change description");
		this.description = value;
	}

	public void setLabelling(String value) {
		log.log(Level.FINE, "change labelling");
		this.labelling = value;
	}

	public void setPrice(double value) {
		log.log(Level.FINE, "change price");
		this.price = value;
	}

	public void setProductId(long value) {
		log.log(Level.FINE, "change productId");
		this.productId = value;
	}

	public ShoppingCart getShoppingCart() {
		return this.shoppingCart;
	}

}
