package com.reservation.ws;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import javax.ws.rs.Produces;

import com.reservation.beans.ReservationBean;
import com.reservation.beans.User;
import com.reservation.service.HotelReservationServceImpl;

@Path("/abc")
public class BookingResource {
	User user = new User();
	
	@GET
	@Produces("text/plain")
	public String greeting() {
 
	    System.out.println("correct");
		return "Hello world";
	}
	@GET
	@Path("/login")
	@Produces("text/plain")
		public int login()
	{
	   HotelReservationServceImpl serviceLogin = new HotelReservationServceImpl();
	   
	  int i = serviceLogin.login(user.getUsername(), user.getPassword());
	   return i;
	   
	}
	
	@GET
	@Path("/register")
	@Produces("text/plain")
    public int registration()
	{
		HotelReservationServceImpl serviceRegistr = new HotelReservationServceImpl();
		int i= serviceRegistr.userRegistration(user);
		return i;
	}
	
	@GET
	@Path("/viewBooking")
	@Produces("text/plain")
	public List<ReservationBean> getAllBookings()
	{
		HotelReservationServceImpl serviceBookings = new HotelReservationServceImpl();
		List<ReservationBean> resrvation = serviceBookings.getAllBookings(user.getUserId());
		return resrvation;
	}
	


	

}
