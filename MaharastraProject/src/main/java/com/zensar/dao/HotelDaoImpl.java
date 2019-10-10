package com.zensar.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Hotel;

public class HotelDaoImpl implements HotelDao {

	private Session session;

	public HotelDaoImpl() {

		Configuration configuration = new Configuration().configure();
		SessionFactory factory = configuration.buildSessionFactory();
		session = factory.openSession();
	}

	public List<Hotel> getAll() {
		return session.createQuery("From Hotel").getResultList();
	}

	public Hotel getById(int hotel_id) {

		return session.get(Hotel.class, hotel_id);
	}

	public void insert(Hotel hotel) {

		Transaction transaction = session.beginTransaction();
		session.save(hotel);
		transaction.commit();
	}

	public void update(Hotel hotel) {
		Transaction transaction = session.beginTransaction();
		session.update(hotel);
		transaction.commit();

	}

	public void delete(Hotel hotel) {
		Transaction transaction = session.beginTransaction();
		session.delete(hotel);
		transaction.commit();
	}

}
