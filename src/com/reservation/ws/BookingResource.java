package com.reservation.ws;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

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
	@Produces("text/pliain")
		public User login()
	{
	   HotelReservationServceImpl serviceLogin = new HotelReservationServceImpl();
	   
	   serviceLogin.login(user.getUsername(), user.getPassword());
	   return user;
	   
	}
	


	

}
