package com.reservation.ws;


import java.util.List;




import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriInfo;


import com.reservation.beans.Customer;
import com.reservation.beans.ReservationBean;
import com.reservation.beans.User;
import com.reservation.service.HotelReservationServceImpl;

@Path("/booking")
public class BookingResource {
	User user = new User();
	Customer customer = new Customer();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String greeting() {
 
	    System.out.println("correct");
		return "Hello world";
	}
	
	@GET
	@Path("/get")
	@Produces(MediaType.TEXT_PLAIN)
	public String hello() {
 
	    System.out.println("correct");
		return "Hello world";
	}
	@POST
	@Path("/login")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
		public int login(@FormParam("username") String username, @FormParam("password") String password)
	{
		//String usernme = user.getUsername();
		//String passwrd = user.getPassword();
		System.out.println("username"+username);
		System.out.println("passwrd"+password);
		System.out.println("method invoked");
	   HotelReservationServceImpl serviceLogin = new HotelReservationServceImpl();
	   
	  int i = serviceLogin.login(username, password);
	   return i;
	   
	}
	
	
	@POST
	@Path("/register")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
    public int registration()
	{
		HotelReservationServceImpl serviceRegistr = new HotelReservationServceImpl();
		int i= serviceRegistr.userRegistration(user);
		return i;
	}
	
	@GET
	@Path("/viewBooking")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<ReservationBean> getAllBookings(@QueryParam("userId") String id)
	{
		HotelReservationServceImpl serviceBookings = new HotelReservationServceImpl();
		List<ReservationBean> resrvation = serviceBookings.getAllBookings(user.getUserId());
		return resrvation;
	}
	


	

}
