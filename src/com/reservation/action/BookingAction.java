package com.reservation.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import java.util.Map;

import org.omg.PortableInterceptor.SUCCESSFUL;


import org.apache.struts2.components.Bean;

import com.opensymphony.xwork2.ActionContext;
import com.reservation.beans.ReservationBean;
import com.reservation.beans.User;
import com.reservation.service.HotelReservationServceImpl;

public class BookingAction {
	private String name;
	private User user;
	private List<ReservationBean> bookingList ;
	
	

	Map<String,Object> session = ActionContext.getContext().getSession();

	

	HotelReservationServceImpl service = new HotelReservationServceImpl();

	   public String execute() throws Exception {
		  /*User loginUser = new User("malani","Rani","2A","Mahara","wat","malani","1234",0112233456,"true","342134567v");
		   loginUser.setUsername("bimla");
		 String username =  loginUser.getUsername();
		 loginUser.setPassword("1234");
		 String psswrd = loginUser.getPassword();
		 //  service.connection();
		   //System.out.println("hellow world!!!!"+name);
		   service.login(username, psswrd);
		//service.userRegistration(loginUser);
		   User userDetail = new User();
		  
		   
		// userDetail =  service.getUserDetails(1);
		 
		 List<User> details = new ArrayList<User>();
		 details.add(userDetail);
		// service.getAllBookings();
	 service.getAllBookings(1);*/
	      return "success";
	     
	   }
	   
	   public String login() 
	   {
		   
		   if(user!= null)
		   {
			   System.out.println(""+user.getUsername());
			   System.out.println(""+user.getPassword());
			 user =  service.login(user.getUsername(), user.getPassword());
			 session.put("user", user);
			 return "success";
		   }
		   else
		   {
			   return "error";
		   }
		   
		   
	   }
	   
	   public String register()
	   {
		   if (user!=null)
		   {
			   
			   System.out.println(""+user.getFname());
			   System.out.println(""+user.getLname()); 
			   System.out.println(""+user.getAdd1());
			   System.out.println(""+user.getAdd2()); 
			   System.out.println(""+user.getAdd3());
			   System.out.println(""+user.getUsername());
			   System.out.println(""+user.getPassword());
			   
			 //  System.out.println(""+user.getReTypedPassword());
			   System.out.println(""+user.getTelNum());
			   System.out.println(""+user.getUserType());
			   System.out.println(""+user.getNic());
			   service.userRegistration(user);
			   
			    
		   }
		   else
		   {
			   System.out.println("No registration is done");
		   }
		   return "success";
	   }
	   
	   public String bookings()
	   {
		
		 int id = (int) session.get(user.getUserId());
		 bookingList = service.getAllBookings(id);
		  
		   return "success";
	   }
	   public String getName() {
	      return name;
	   }

	   public void setName(String name) {
	      this.name = name;
	   }
	   public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}
		public List<ReservationBean> getBookingList() {
			return bookingList;
		}

		public void setBookingList(List<ReservationBean> bookingList) {
			this.bookingList = bookingList;
		}
	   

}
 