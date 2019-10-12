package com.zensar.services;

import java.util.List;

import com.zensar.entities.Hotel;

public interface HotelService {
	
	List<Hotel> findAllHotels();

	Hotel findHotelById(int hotelId);

	void addHotel(Hotel hotel);

	void removeHotel(Hotel hotel);

	void updateHotel(Hotel hotel);

	List<Hotel> getHotelByLocation(String location);
	
	List<Hotel> getHotelByName(String hotelName);

}
