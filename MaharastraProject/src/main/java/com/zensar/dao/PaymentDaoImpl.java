package com.zensar.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Payment;
/**
 * @author Susmita Basak
 * @creation_date 5/10/2019 7:26
 * @modification_date 5/10/2019 7:26
 * @version 1.0
 * @copyright All rights are  for Zensar Technologies.
 * @description It is a Payment Dao Implementation Class.
 * 
 *
 */
public class PaymentDaoImpl implements PaymentDao {
	private Session session;
	
	public PaymentDaoImpl() {
		// TODO Auto-generated constructor stub
		Configuration configuration =new Configuration().configure();
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		session = sessionFactory.openSession();
	}

	public List<Payment> getAll() {
		// TODO Auto-generated method stub
		return session.createQuery("from Payment").getResultList();
		
	}

	public Payment getByPaymentId(int paymentId) {
		// TODO Auto-generated method stub
		return session.get(Payment.class, paymentId);
	}

	public void insert(Payment payment) {
		// TODO Auto-generated method stub
		Transaction t = session.beginTransaction();
		session.save(payment);
		t.commit();

	}

	public void update(Payment payment) {
		// TODO Auto-generated method stub
		Transaction t1 = session.beginTransaction();
		session.update(payment);
		t1.commit();
		

	}

	public void delete(Payment payment) {
		// TODO Auto-generated method stub
		Transaction t1 = session.beginTransaction();
		session.delete(payment);
		t1.commit();
		

	}

}
