package com.zensar.dao;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Room;

public class RoomDaoImpl implements RoomDao {
	private Session session;

	public RoomDaoImpl() {
		// TODO Auto-generated constructor stub
		Configuration configuration = new Configuration().configure();
		SessionFactory sessionfactory = configuration.buildSessionFactory();
		Session session = sessionfactory.openSession();

	}

	public void insert(Room room) throws SQLException {
		// TODO Auto-generated method stub
		Transaction t = session.beginTransaction();
		session.save(room);
		t.commit();

	}

	public void update(Room room) throws SQLException {
		// TODO Auto-generated method stub
		Transaction t = session.beginTransaction();
		session.update(room);
		t.commit();

	}

	public void delete(Room room) throws SQLException {
		// TODO Auto-generated method stub
		Transaction t = session.beginTransaction();
		session.delete(room);
		t.commit();

	}

	public Room getbyRoomID(int roomId) throws SQLException {
		// TODO Auto-generated method stub
		return session.get(Room.class, roomId);
	}

	public List<Room> getAll() throws SQLException {
		// TODO Auto-generated method stub
		Query q = session.createQuery("from room");
		return q.getResultList();

	}

}
