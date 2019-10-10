package com.zensar.services;

import java.util.List;

import com.zensar.dao.HotelDao;
import com.zensar.entities.Hotel;

public class HotelServiceImpl implements HotelService {

	private HotelDao hotelDao;

	public HotelServiceImpl() {
	}

	public List<Hotel> findAllHotels() {
		return hotelDao.getAll();
	}

	public Hotel findHotelById(int hotel_id) {
		return hotelDao.getById(hotel_id);
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

}
