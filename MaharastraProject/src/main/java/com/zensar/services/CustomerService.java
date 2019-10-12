package com.zensar.services;

import java.util.List;

import com.zensar.entities.Customer;
/**
 * @author Akansha Shah
 * @Creation_date 6th Oct 2019 07.05PM
 * @Modification_date 6th Oct 2019 07.05PM
 * @version 1.0
 * @Copyright Zensar Technologies. All rights reserved
 * @description It is an service interface used in business layer.
 */
public interface CustomerService {

    void addCustomer(Customer customer);
    void updateCustomer(Customer customer);
    void removeCustomer(Customer customer);
    List<Customer> findAllCustomer();
    Customer findCustomerById(int customerId);
    List<Customer> getCustomerByEmail(String emailId);
    List<Customer> getCustomerByName(String customerName);
    long customerCount();
    
	/*
	 * public boolean checkLogin(String emailId,String password); public boolean
	 * checkIfUserExists(String emailId); public boolean resetPassword(String
	 * emailId,String newPassword);
	 */
	 
}
