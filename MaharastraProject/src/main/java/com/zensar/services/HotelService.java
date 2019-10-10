package com.zensar.services;

import com.zensar.entities.Hotel;

public interface HotelService {

	Hotel findHotelById(int hotel_id);

	void addHotel(Hotel hotel);

	void removeHotel(Hotel hotel);

	void updateHotel(Hotel hotel);
	
	//List<Hotel> findHotelByLocation(String location);

}
