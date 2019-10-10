package com.zensar.dao;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.HotelBooking;

public class HotelBookingDaoImpl implements HotelBookingDao {
	private Session session;

	public HotelBookingDaoImpl() throws SQLException {
		// TODO Auto-generated constructor stub
		Configuration configuration = new Configuration().configure();
		SessionFactory sessionfactory = configuration.buildSessionFactory();
		session = sessionfactory.openSession();
	}

	
	public List<HotelBooking> getAllBookings()  {
		// TODO Auto-generated method stub

		return session.createQuery("from HotelBooking").getResultList();
	}

	public List<HotelBooking> getAllBookingsByDate(Date bookingDate) {
		// TODO Auto-generated method stub

		
		List<HotelBooking> list = (List<HotelBooking>) session.get(HotelBooking.class, bookingDate);
		return list;

	}

	public void insert(HotelBooking hb)  {
		// TODO Auto-generated method stub
		Transaction transaction = session.beginTransaction();
		session.save(hb);
		transaction.commit();

	}

	public void update(HotelBooking hb)  {
		// TODO Auto-generated method stub
		Transaction transaction = session.beginTransaction();
		session.update(hb);
		transaction.commit();

	}

	public void delete(HotelBooking hb)  {
		// TODO Auto-generated method stub
		Transaction transaction = session.beginTransaction();
		session.delete(hb);
		transaction.commit();

	}


	public HotelBooking getById(int bookId) {
		// TODO Auto-generated method stub
		return  session.get(HotelBooking.class,bookId);
	}

}
