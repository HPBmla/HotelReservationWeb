package com.reservation.action;

import java.util.ArrayList;
import java.util.List;

import org.omg.PortableInterceptor.SUCCESSFUL;

import com.reservation.beans.User;
import com.reservation.service.HotelReservationServceImpl;

public class BookingAction {
	private String name;
	
	HotelReservationServceImpl service = new HotelReservationServceImpl();

	   public String execute() throws Exception {
		/*   User loginUser = new User("malani","Rani","2A","Mahara","wat","malani","1234",0112233456,true,"342134567v");
		   loginUser.setUsername("bimla");
		 String username =  loginUser.getUsername();
		 loginUser.setPassword("1234");
		 String psswrd = loginUser.getPassword();
		 //  service.connection();
		   //System.out.println("hellow world!!!!"+name);
		   service.login(username, psswrd);
		//service.userRegistration(loginUser);
		   User userDetail = new User();
		  
		   
		 userDetail =  service.getUserDetails(1);
		 
		 List<User> details = new ArrayList<User>();
		 details.add(userDetail);
		 service.getAllBookings();
//		 service.getAllBookings(1);*/
	      return "success";
	   }
	   
	   public String loginExecute() 
	   {
		   
		   
		   return "success";
	   }
	   public String getName() {
	      return name;
	   }

	   public void setName(String name) {
	      this.name = name;
	   }
	   
	   
	   

}
 