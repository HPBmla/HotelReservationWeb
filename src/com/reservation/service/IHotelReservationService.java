package com.reservation.service;

import java.util.List;
import java.util.Date;

import com.reservation.beans.ReservationBean;
import com.reservation.beans.User;

public interface IHotelReservationService {

	public User login (String username, String passwrd);
	public int userRegistration(User user);
	//public User getUserDetails(int UId);
	//public List<ReservationBean> getAllBookings();
	public List<ReservationBean> getAllBookings(int UsrId);
	
	public String createReservation(ReservationBean bean);
	public ReservationBean getBooking (int Uid);
	public String UpdateReservation(ReservationBean bean);
	
	public boolean cancelResrvtn(int resrvtnId);
	//public boolean changeCredentials(User user);
	public void connection();
	
	
	
}
