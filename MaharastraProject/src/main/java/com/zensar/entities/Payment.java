package com.zensar.entities;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
/**
 * @author Susmita Basak
 * @creation_date 5/10/2019 7:26
 * @modification_date 5/10/2019 7:26
 * @version 1.0
 * @copyright All rights are  for Zensar Technologies.
 * @description It is a Payment Entity Class.
 * 
 *
 */

@Entity
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int paymentId;
	private double roomCharge;
	private double miscCharge;
	private double totalCharge;
	@Column(nullable = false)
	private String creditCardNo;
	private String creditCardType;
	private int creditCardExpiryMonth;
	private int creditCardExpiryYear;
	@Column(nullable = false)
	private String debitDebitNo;
	private String debitCardType;
	private int deditCardExpiryMonth;
	private int deditCardExpiryYear;
	private LocalDate paymentDate;
	@ManyToOne
	@JoinColumn(name = "customerId")
	private Customer customer;
	@ManyToOne
	@JoinColumn(name = "hotelId")
	private Hotel hotel;

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public double getRoomCharge() {
		return roomCharge;
	}

	public void setRoomCharge(double roomCharge) {
		this.roomCharge = roomCharge;
	}

	public double getMiscCharge() {
		return miscCharge;
	}

	public void setMiscCharge(double miscCharge) {
		this.miscCharge = miscCharge;
	}

	public double getTotalCharge() {
		return totalCharge;
	}

	public void setTotalCharge(double totalCharge) {
		this.totalCharge = totalCharge;
	}

	public String getCreditCardNo() {
		return creditCardNo;
	}

	public void setCreditCardNo(String creditCardNo) {
		this.creditCardNo = creditCardNo;
	}

	public String getCreditCardType() {
		return creditCardType;
	}

	public void setCreditCardType(String creditCardType) {
		this.creditCardType = creditCardType;
	}

	public int getCreditCardExpiryMonth() {
		return creditCardExpiryMonth;
	}

	public void setCreditCardExpiryMonth(int creditCardExpiryMonth) {
		this.creditCardExpiryMonth = creditCardExpiryMonth;
	}

	public int getCreditCardExpiryYear() {
		return creditCardExpiryYear;
	}

	public void setCreditCardExpiryYear(int creditCardExpiryYear) {
		this.creditCardExpiryYear = creditCardExpiryYear;
	}

	public String getDebitDebitNo() {
		return debitDebitNo;
	}

	public void setDebitDebitNo(String debitDebitNo) {
		this.debitDebitNo = debitDebitNo;
	}

	public String getDebitCardType() {
		return debitCardType;
	}

	public void setDebitCardType(String debitCardType) {
		this.debitCardType = debitCardType;
	}

	public int getDeditCardExpiryMonth() {
		return deditCardExpiryMonth;
	}

	public void setDeditCardExpiryMonth(int deditCardExpiryMonth) {
		this.deditCardExpiryMonth = deditCardExpiryMonth;
	}

	public int getDeditCardExpiryYear() {
		return deditCardExpiryYear;
	}

	public void setDeditCardExpiryYear(int deditCardExpiryYear) {
		this.deditCardExpiryYear = deditCardExpiryYear;
	}

	public LocalDate getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
}
