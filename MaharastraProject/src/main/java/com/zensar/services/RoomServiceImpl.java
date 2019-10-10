package com.zensar.services;

import java.sql.SQLException;
import java.util.List;

import com.zensar.dao.RoomDao;
import com.zensar.dao.RoomDaoImpl;
import com.zensar.entities.Room;

public class RoomServiceImpl implements RoomService {
	private RoomDao roomDao;

	public RoomServiceImpl() {
		// TODO Auto-generated constructor stub
		roomDao = new RoomDaoImpl();
	}

	public void setUserDao(RoomDao roomDao) {
		this.roomDao = roomDao;
	}

	public void addRoom(Room room) throws SQLException {
		// TODO Auto-generated method stub
		roomDao.insert(room);
	}

	public void updateRoom(Room room) throws SQLException {
		// TODO Auto-generated method stub
		roomDao.update(room);
	}

	public void removeRoom(Room room) throws SQLException {
		// TODO Auto-generated method stub
		roomDao.delete(room);
	}

	public Room findRoomById(int roomId) throws SQLException {
		return roomDao.getbyRoomID(roomId);
	}

	public List<Room> findAllRooms() throws SQLException {
		// TODO Auto-generated method stub
		return roomDao.getAll();
	}
}
