package com.zensar.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author Akansha Shah
 * @Creation_date 4th Oct 2019 6.10PM
 * @Modification_date 9th oct 2019 3.56PM
 * @Version 1.0
 * @Copyright Zensar Technologies. All rights reserved
 * @description It is a persistent class It represent database table Product It
 *              is POJO class
 */
@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerId;
	@Column(nullable = false)
	@Size(min = 3, max = 50)
	private String customerName;
	@Column(nullable = false)
	@Email
	private String emailId;
	private int contactNo;
	private String gender;
	@Column(nullable = false)
	@Size(min = 3, max = 12)
	@NotNull
	private String password;

	@OneToMany(mappedBy = "customer")
	List<Hotel> hotel;
	@OneToMany(mappedBy = "customer")
	List<HotelBooking> booking;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getContactNo() {
		return contactNo;
	}

	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
