package com.zensar.dao;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.Query;

import com.zensar.entities.Admin;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AdminDaoImpl implements AdminDao {
	private Session session;

	public AdminDaoImpl() {
		// TODO Auto-generated constructor stub
		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		session = sessionFactory.openSession();
	}

	public void insert(Admin admin) throws SQLException {
		// TODO Auto-generated method stub
		Transaction transaction = session.beginTransaction();
		session.save(admin);
		transaction.commit();

	}

	public void update(Admin admin) throws SQLException {
		// TODO Auto-generated method stub

		Transaction transaction = session.beginTransaction();
		session.update(admin);
		transaction.commit();

	}

	public void delete(Admin admin) throws SQLException {
		// TODO Auto-generated method stub
		Transaction transaction = session.beginTransaction();
		session.delete(admin);
		transaction.commit();

	}

	public Admin getbyUsername(String adminName) throws SQLException {
		// TODO Auto-generated method stub
		return session.get(Admin.class, adminName);
	}

	public List<Admin> getAll() throws SQLException {
		// TODO Auto-generated method stub
		Query q = session.createQuery("from Admin");
		return q.getResultList();
	}
}