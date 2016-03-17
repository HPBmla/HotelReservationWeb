package com.reservation.service;

import java.util.List;

import com.reservation.beans.ReservationBean;
import com.reservation.beans.User;
import com.reservation.manage.HotelReservationDAOImpl;
import com.reservation.manage.HotelReservationManagerImpl;

public class HotelReservationServceImpl implements IHotelReservationService {

	
	HotelReservationDAOImpl dbcon = new HotelReservationDAOImpl();
	User user = new User();
	
	@Override
	public int login(String username, String passwrd) {
		int i = 0;
		if(username.isEmpty() || passwrd.isEmpty())
		{
			System.out.print(" Enter username and password ");
			
		}
		else
		{
		 i =	dbcon.login(username, passwrd);
		
		}
		
		
		//dbcon.dbConnector();
		return i;
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

/*	@Override
	public User getUserDetails(int UId) {
		
		User user = new User();
	    user =dbcon.getUserDetails(UId);
	 String fname = user.getFname();
	 //String lname = user.
	// System.out.println(name);
		return user;
	}*/

/*	@Override
	public List<ReservationBean> getAllBookings() {
		
	List<ReservationBean> bookingList =	dbcon.getAllBookings();
	
	for(ReservationBean resrvtn : bookingList)
	{
		System.out.println(resrvtn.getNoOfRms());
	}
		
		return null;
	}*/

	@Override
	public List<ReservationBean> getAllBookings(int UsrId) {
		List<ReservationBean> indvidualBookingList =	dbcon.getAllBookings(UsrId);
		
		for(ReservationBean resrvation : indvidualBookingList)
		{
			System.out.println(resrvation.getChechinDte());
		}
			
			
		return indvidualBookingList;
	}

	@Override
	public String createReservation(ReservationBean bean) {
		// TODO Auto-generated method stub
		String i = null;
		if(bean.getChechinDte()== null)
		{
			System.out.print(" Please select your Check In Date ");
		}
		else if (bean.getChechoutDte() == null)
		{
			System.out.print(" Please select your Check Out Date ");
		}
		else if(bean.getNoOfRms()==(int)bean.getNoOfRms())
		{
			System.out.print("  Please select the Number of rooms you need  ");
		}
		else if(bean.getNoOfGuests() == (int)bean.getNoOfGuests())
		{
			System.out.print(" Please select the Number of Guests you have ");
		}
		else if(bean.getRoomType().isEmpty())
		{
			System.out.print(" Please select the Room type you need ");
		}
		else
		{
			 i = dbcon.createReservation(bean);
		}
		return "success";
	}

	@Override
	public ReservationBean getBooking(int Uid) {

		if(Uid == (int)Uid)
		{
			System.out.print(" Please Login to complete this functionality ");
		}
		else
		{
		//int i =	dbcon.getBooking(Uid);
		}

		return null;
		//return dbcon.getBooking(Uid);
	}

	@Override
	public String UpdateReservation(ReservationBean bean) {
		// TODO Auto-generated method stub
		String i = null;
		if(bean.getChechinDte()== null)
		{
			System.out.print(" Please select your Check In Date ");
		}
		else if (bean.getChechoutDte() == null)
		{
			System.out.print(" Please select your Check Out Date ");
		}
		else if(bean.getNoOfRms()==(int)bean.getNoOfRms())
		{
			System.out.print("  Please select the Number of rooms you need  ");
		}
		else if(bean.getNoOfGuests() == (int)bean.getNoOfGuests())
		{
			System.out.print(" Please select the Number of Guests you have ");
		}
		else if(bean.getRoomType().isEmpty())
		{
			System.out.print(" Please select the Room type you need ");
		}
		else
		{
			 i = dbcon.updateReservation(bean);
		}
		return "success";
	}

	@Override
	public boolean cancelResrvtn(int resrvtnId) {
		// TODO Auto-generated method stub
		if(resrvtnId==(int)resrvtnId)
		{
			System.out.print(" Please select a Reservation ");	
		}
		else
		{
		dbcon.cancelResrvtn(resrvtnId);
		}
		return true;
	}
/*
	@Override
	public boolean changeCredentials(User user) {
		// TODO Auto-generated method stub
		boolean i = false;
		if(user.getUsername().isEmpty())
		{
			System.out.print(" Please enter your Username ");
		}
		else if (user.getPassword().isEmpty())
		{
			System.out.print(" Please enter your Existing Password ");
		}
		else if(user.getNewPassword().isEmpty())
		{
			System.out.print(" Please enter your New Password ");
		}
		else if(user.getReTypedPassword().isEmpty())
		{
			System.out.print(" Please Re-type your New Password ");
		}
		else
		{
			 i = dbcon.changeCredentials(user);
		}
		return false;
	}*/

	@Override
	public void connection() {
		HotelReservationDAOImpl db = new HotelReservationDAOImpl();
		db.dbConnector();
		
	}
	
}