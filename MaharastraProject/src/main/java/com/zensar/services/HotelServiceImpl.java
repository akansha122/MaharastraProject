package com.zensar.services;

import java.util.ArrayList;
import java.util.List;

import com.zensar.daos.HotelDao;
import com.zensar.daos.HotelDaoImpl;
import com.zensar.entities.Hotel;

public class HotelServiceImpl implements HotelService {

	private HotelDao hotelDao;

	public HotelServiceImpl() {
		hotelDao=new HotelDaoImpl();
	}

	public List<Hotel> findAllHotels() {
		return hotelDao.getAll();
	}

	public Hotel findHotelById(int hotelId) {
		return hotelDao.getById(hotelId);

	}

	public void addHotel(Hotel hotel) {
		hotelDao.insert(hotel);

	}

	public void removeHotel(Hotel hotel) {

		hotelDao.delete(hotel);

	}

	public void updateHotel(Hotel hotel) {

		hotelDao.update(hotel);

	}

	public List<Hotel> getHotelByLocation(String location) {
		// TODO Auto-generated method stub
		List<Hotel> list1 = hotelDao.getAll();
		List<Hotel> list2 = new ArrayList();
		for (Hotel h : list1) {
			if (h.getLocation().equalsIgnoreCase(location)) {
				list2.add(h);
			}
		}
		return list2;
	}

	public List<Hotel> getHotelByName(String hotelName) {
		List<Hotel> list1 = hotelDao.getAll();
		List<Hotel> list2 = new ArrayList();

		for (Hotel h1 : list1) {
			if (h1.getHotelName().equalsIgnoreCase(hotelName)) {
				list2.add(h1);
			}
		}
		return list2;

	}
}
