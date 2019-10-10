package com.zensar.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Admin {
	@Id
	private String adminName;
	private String password;
	@OneToMany(mappedBy = "admin")
	List<Customer> customer;
	public Admin() {
		// TODO Auto-generated constructor stub
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Admin [adminName=" + adminName + ", password=" + password + "]";
	}

	public Admin(String adminName, String password) {
		this.adminName = adminName;
		this.password = password;
	}

}
