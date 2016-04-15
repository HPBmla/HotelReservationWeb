package com.reservation.action;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.reservation.beans.Customer;
import com.reservation.beans.ReservationBean;
import com.reservation.beans.User;
import com.reservation.manage.HotelReservationDAOImpl;
import com.reservation.service.HotelReservationServceImpl;

public class LoginAction {
	
	User user = null;
	Customer customer = null;
	private List<ReservationBean> bookingList ;
	Map<String,Object> session = (Map)ActionContext.getContext().getSession();

	HotelReservationDAOImpl db = new HotelReservationDAOImpl();
	

	HotelReservationServceImpl service = new HotelReservationServceImpl();
	
	 public String login() 
	   {
		   System.out.println("connec");
		   if(user!= null)
		   {
			   System.out.println(""+user.getUsername());
			   System.out.println(""+user.getPassword());
			 int value =  service.login(user.getUsername(), user.getPassword());
			 if( value == 1)
			 {
				 user = db.getUser(user.getUsername());
			 }
			 session.put("user", user);
			 System.out.println(user.getUserId());
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
			   System.out.println("calling registration");
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
			   System.out.println("calling second registration");
			   
			   
			   System.out.println(""+customer.getEmail());
			   System.out.println(""+customer.getModeOfTraveling());
			   service.userRegistration(user);
			   
			}
		   else
		   {
			   System.out.println("No registration is done");
		   }
		   return "success";
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

		public void setSession(Map<String, Object> session) {
			this.session = session;
			
		}

}
