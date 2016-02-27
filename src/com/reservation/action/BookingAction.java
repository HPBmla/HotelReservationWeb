package com.reservation.action;

import com.reservation.beans.User;
import com.reservation.service.HotelReservationServceImpl;

public class BookingAction {
	private String name;
	
	HotelReservationServceImpl service = new HotelReservationServceImpl();

	   public String execute() throws Exception {
		   User loginUser = new User("malani","1234","malani","Rani","2A","Mahara","wat",0112233456,"342134567v",true);
		   loginUser.setUsername("bimla");
		 String username =  loginUser.getUsername();
		 loginUser.setPassword("1234");
		 String psswrd = loginUser.getPassword();
		 //  service.connection();
		   //System.out.println("hellow world!!!!"+name);
		   service.login(username, psswrd);
		service.userRegistration(loginUser);
	      return "success";
	   }
	   
	   public String getName() {
	      return name;
	   }

	   public void setName(String name) {
	      this.name = name;
	   }
	   
	   
	   

}
 