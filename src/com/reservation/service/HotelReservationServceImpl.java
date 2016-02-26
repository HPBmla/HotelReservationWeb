package com.reservation.service;

import java.util.List;

import com.reservation.beans.ReservationBean;
import com.reservation.beans.User;
import com.reservation.manage.HotelReservationDAOImpl;
import com.reservation.manage.HotelReservationManagerImpl;

public class HotelReservationServceImpl implements IHotelReservationService {

	
	HotelReservationDAOImpl dbcon = new HotelReservationDAOImpl();
	@Override
	public int login(String username, String passwrd) {
		if(username.isEmpty() || passwrd.isEmpty())
		{
			System.out.print(" Enter username and password ");
			
		}
		else
		{
		int i =	dbcon.login(username, passwrd);
		
		}
		
		
		//dbcon.dbConnector();
		return 0;
	}

	@Override
	public int userRegistration(User user) {
		
		return 0;
	}

	@Override
	public User getUserDetails(int UId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ReservationBean> getAllBookings() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ReservationBean> getAllBookings(int UsrId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createReservation(ReservationBean bean) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public ReservationBean getBooking(int Uid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String UpdateReservation(ReservationBean bean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean cancelResrvtn(int resrvtnId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean changeCredentials(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void connection() {
		HotelReservationDAOImpl db = new HotelReservationDAOImpl();
		db.dbConnector();
		
	}
	


}
