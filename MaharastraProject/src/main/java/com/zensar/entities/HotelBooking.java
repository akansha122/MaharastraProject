package com.zensar.entities;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class HotelBooking {
	@Id
	private int bookId;
	private LocalDate bookingDate;
	private Date checkInDate;
	private Date checkOutDate;
	private int noOfPerson;
	
	@ManyToOne
	@JoinColumn(name = "customerId")
	private Customer customer;
	@ManyToOne
	@JoinColumn(name = "hotelId")
	private Hotel hotel;
	
	@OneToMany(mappedBy = "hotelBooking")
	List<Payment> payment;
	
	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}


	public Date getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}

	public int getNoOfPerson() {
		return noOfPerson;
	}

	public void setNoOfPerson(int noOfPerson) {
		this.noOfPerson = noOfPerson;
	}

	public int getBeds() {
		return beds;
	}

	public void setBeds(int beds) {
		this.beds = beds;
	}

	public Date getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	@Override
	public String toString() {
		return "HotelBooking=>BookId=" +bookId+"=>BookingDate=" + bookingDate + "=>CheckInDate="+ checkInDate
				+ ", checkOutDate=" + checkOutDate + ", noOfPerson=" + noOfPerson + ", beds=" + beds + "]";
	}

}
