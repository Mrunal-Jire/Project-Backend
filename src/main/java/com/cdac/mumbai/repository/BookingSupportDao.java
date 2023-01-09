package com.cdac.mumbai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cdac.mumbai.entity.Booking;

public interface BookingSupportDao extends JpaRepository<Booking, Integer> {
	
	public List<Booking> findByBookingId(int bookingId);
	

}
