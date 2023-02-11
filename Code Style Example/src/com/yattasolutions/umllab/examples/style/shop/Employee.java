package com.yattasolutions.umllab.examples.style.shop;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Employee extends Person {
	private static final Logger log = Logger
			.getLogger("com.yattasolutions.umllab.examples.style.shop.Employee");
	private long employeeId;

	private Boolean onVacation;

	/**
	 * <pre>
	 *           0..*     0..1
	 * Employee ------------------------- Company
	 *           employees        &gt;       employer
	 * </pre>
	 */
	private Company employer;

	public long getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployer(Company value) {
		this.employer = value;
	}

	public Boolean getOnVacation() {
		return this.onVacation;
	}

	public void setEmployeeId(long value) {
		log.log(Level.FINE, "change employeeId");
		this.employeeId = value;
	}

	public Company getEmployer() {
		return this.employer;
	}

	public void setOnVacation(Boolean value) {
		log.log(Level.FINE, "change onVacation");
		this.onVacation = value;
	}

	public void work(Integer hours) {
		// TODO implement this operation
		throw new UnsupportedOperationException("not implemented");
	}
}
