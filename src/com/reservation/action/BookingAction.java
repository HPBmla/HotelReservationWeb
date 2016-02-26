package com.reservation.action;

import com.reservation.beans.User;
import com.reservation.service.HotelReservationServceImpl;

public class BookingAction {
	private String name;
	
	HotelReservationServceImpl service = new HotelReservationServceImpl();

	   public String execute() throws Exception {
		   User loginUser = new User();
		   loginUser.setUsername("bimla");
		 String username =  loginUser.getUsername();
		 loginUser.setPassword("1234");
		 String psswrd = loginUser.getPassword();
		 //  service.connection();
		   //System.out.println("hellow world!!!!"+name);
		   service.login(username, psswrd);
	      return "success";
	   }
	   
	   public String getName() {
	      return name;
	   }

	   public void setName(String name) {
	      this.name = name;
	   }
	   
	   
	   

}
 