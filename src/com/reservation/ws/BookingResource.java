package com.reservation.ws;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.reservation.service.HotelReservationServceImpl;

@Path("/abc")
public class BookingResource {
	
	@GET
	@Produces("text/plain")
	public String greeting() {
 
	    System.out.println("correct");
		return "Hello world";
	}
	/*	public int login()
	{
	   HotelReservationServceImpl serviceLogin = new HotelReservationServceImpl();
	   
	   serviceLogin.login(username, passwrd);
	   
	}*/


	

}
