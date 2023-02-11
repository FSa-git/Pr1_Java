package com.yattasolutions.umllab.examples.style.shop;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProductCategory {
	private static final Logger log = Logger
			.getLogger("com.yattasolutions.umllab.examples.style.shop.ProductCategory");

	/**
	 * <pre>
	 *           0..*     0..*
	 * ProductCategory ------------------------- Webshop
	 *           offers        &lt;       offeredBy
	 * </pre>
	 */
	private Set<Webshop> offeredBy;

	private String categoryName;

	/**
	 * <pre>
	 *           1..1     0..*
	 * ProductCategory ------------------------- ProductCategory
	 *           parentCategory        &lt;       subCategories
	 * </pre>
	 */
	private Set<ProductCategory> subCategories;

	/**
	 * <pre>
	 *           0..*     1..1
	 * ProductCategory ------------------------- ProductCategory
	 *           subCategories        &gt;       parentCategory
	 * </pre>
	 */
	private ProductCategory parentCategory;

	/**
	 * <pre>
	 *           0..*     0..*
	 * ProductCategory ------------------------- Product
	 *           category        &lt;       products
	 * </pre>
	 */
	private Set<Product> products;

	public String getCategoryName() {
		return this.categoryName;
	}

	public void setParentCategory(ProductCategory value) {
		this.parentCategory = value;
	}

	public void setCategoryName(String value) {
		log.log(Level.FINE, "change categoryName");
		this.categoryName = value;
	}

	public Set<Webshop> getOfferedBy() {
		if (this.offeredBy == null) {
			this.offeredBy = new HashSet<Webshop>();
		}
		return this.offeredBy;
	}

	public ProductCategory getParentCategory() {
		return this.parentCategory;
	}

	public Set<Product> getProducts() {
		if (this.products == null) {
			this.products = new HashSet<Product>();
		}
		return this.products;
	}

	public Set<ProductCategory> getSubCategories() {
		if (this.subCategories == null) {
			this.subCategories = new HashSet<ProductCategory>();
		}
		return this.subCategories;
	}

}
