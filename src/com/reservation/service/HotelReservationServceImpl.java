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
		int i = 0;
		if(user.getFname().isEmpty())
		{
			System.out.print(" Enter your name ");
		}
		else if (user.getLname().isEmpty())
		{
			System.out.print(" Enter your last name ");
		}
		else if(user.getAdd1().isEmpty())
		{
			System.out.print(" Enter your address ");
		}
		else if(user.getAdd2().isEmpty())
		{
			System.out.print(" Enter your address ");
		}
		else if(user.getAdd3().isEmpty())
		{
			System.out.print(" Enter your address ");
		}
		else if(user.getNic().isEmpty())
		{
			System.out.print(" Enter your National Id  ");
		}
		else if(user.getPassword().isEmpty())
		{
			System.out.print(" Enter a password ");
		}
		else if(user.getUsername().isEmpty())
		{
			System.out.print(" Enter a username ");
		}
		else
		{
			 i = dbcon.userRegistration(user);
		}
		
		
		return i;
	}

	@Override
	public User getUserDetails(int UId) {
		
		User user = new User();
	    user =dbcon.getUserDetails(UId);
	 String fname = user.getFname();
	 //String lname = user.
	// System.out.println(name);
		return user;
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
