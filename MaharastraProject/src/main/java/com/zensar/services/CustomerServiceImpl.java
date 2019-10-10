package com.zensar.services;

import java.util.ArrayList;
import java.util.List;

import com.zensar.dao.CustomerDao;
import com.zensar.dao.CustomerDaoImpl;
import com.zensar.entities.Customer;
/**
 * @author Akansha Shah
 * @Creation_date 5th Oct 2019 10.23AM
 * @Modification_date 5th Oct 2019 10.23AM
 * @version 1.0
 * @Copyright Zensar Technologies. All rights reserved
 * @description It is service class used in business layer.
 */
public class CustomerServiceImpl implements CustomerService {

	private CustomerDao customerDao;

	public CustomerServiceImpl() {
		customerDao = new CustomerDaoImpl();
	}

	public void addCustomer(Customer customer) {
		customerDao.insert(customer);
	}

	public void updateCustomer(Customer customer) {
		customerDao.update(customer);

	}

	public void removeCustomer(Customer customer) {
		customerDao.delete(customer);
	}

	public List<Customer> findAllCustomer() {
		return customerDao.getAll();
	}

	public Customer findCustomerById(int customerId) {
		return customerDao.getById(customerId);
	}

	public List<Customer> getCustomerByEmail(String emailId) {
		List<Customer> list1 = customerDao.getAll();
		List<Customer> list2 = new ArrayList();
		for (Customer customer : list1) {
			if(customer.getEmailId().equalsIgnoreCase(emailId))
			list2.add(customer);
		}
		return list2;
	}

	public List<Customer> getCustomerByName(String customerName) {
		List<Customer> list1 = customerDao.getAll();
		List<Customer> list2 = new ArrayList();
		for (Customer customer : list1) {
			if(customer.getCustomerName().equalsIgnoreCase(customerName))
			list2.add(customer);
		}
		return list2;
	}

}
