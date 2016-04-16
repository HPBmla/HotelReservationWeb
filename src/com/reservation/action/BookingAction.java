package com.reservation.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.omg.PortableInterceptor.SUCCESSFUL;
import org.apache.struts2.components.Bean;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.reservation.beans.Customer;
import com.reservation.beans.ReservationBean;
import com.reservation.beans.User;
import com.reservation.manage.HotelReservationDAOImpl;
import com.reservation.service.HotelReservationServceImpl;

public class BookingAction extends ActionSupport implements SessionAware {
	private String name;
	private User user;
<<<<<<< HEAD
	private ReservationBean bean = null;
=======
	private Customer customer;
	private ReservationBean bean;
>>>>>>> origin/master
	private List<ReservationBean> bookingList;

	Map<String, Object> session = (Map) ActionContext.getContext().getSession();

	HotelReservationDAOImpl db = new HotelReservationDAOImpl();

	HotelReservationServceImpl service = new HotelReservationServceImpl();

	public String execute() throws Exception {
		/*
		 * User loginUser = new
		 * User("malani","Rani","2A","Mahara","wat","malani"
		 * ,"1234",0112233456,"true","342134567v");
		 * loginUser.setUsername("bimla"); String username =
		 * loginUser.getUsername(); loginUser.setPassword("1234"); String psswrd
		 * = loginUser.getPassword();
		 */
		// service.connection();
		// System.out.println("hellow world!!!!"+name);
		/*
		 * service.login(username, psswrd);
		 * //service.userRegistration(loginUser); User userDetail = new User();
		 * 
		 * 
		 * // userDetail = service.getUserDetails(1);
		 * 
		 * List<User> details = new ArrayList<User>(); details.add(userDetail);
		 * // service.getAllBookings(); service.getAllBookings(1);
		 */

		return "success";

	}

	public String login() {
		
		if (user != null) {
			System.out.println("another calling");
			
			//service.getBooking(2);
			
			
			System.out.println("" + user.getUsername());
			System.out.println("" + user.getPassword());
			int value = service.login(user.getUsername(), user.getPassword());
			if (value == 1) {
				user = db.getUser(user.getUsername());
			}
			session.put("user", user);
			System.out.println(user.getUserId());
			
<<<<<<< HEAD
=======
			//service.userRegistrations(user, customer);
>>>>>>> origin/master
			return "success";
		} else {
			return "error";
		}
	}

	public String register() {
		if (user != null) {
              customer = new Customer();
			System.out.println("" + user.getFname());
			System.out.println("" + user.getLname());
			System.out.println("" + user.getAdd1());
			System.out.println("" + user.getAdd2());
			System.out.println("" + user.getAdd3());
			System.out.println("" + user.getUsername());
			System.out.println("" + user.getPassword());

			// System.out.println(""+user.getReTypedPassword());
			System.out.println("" + user.getTelNum());
			System.out.println("" + user.getUserType());
			System.out.println("" + user.getNic());
			System.out.println("" + customer.getEmail());
			System.out.println("" + customer.getModeOfTraveling());
			service.userRegistration(user);
			
		} else {
			System.out.println("No registration is done");
		}
		return "success";
	}

	public String bookings() {
		System.out.println("calling");
		user = (User) session.get("user");
		int id = user.getUserId();
		System.out.println(id);
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

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;

	}

	public String createreservation() {
		System.out.println("calling method in boking action");
		user = (User) session.get("user");
		int id = user.getUserId();
		System.out.println(id);
		bean = new ReservationBean();
		if (bean != null) {

			System.out.println("" + bean.getChechinDte());
			System.out.println("" + bean.getChechoutDte());
			int x = bean.getNoOfRms();
			System.out.println("getNoOfRms" + (x));
			//System.out.println("" + Integer.parseInt("bean.getNoOfGuests()"));
			System.out.println("" + bean.getRoomType());
			//System.out.println("" + bean.getStatus());
			System.out.println("" + id);

			service.createReservation(bean);

		} else {
			System.out.println("Reservation creation is failed");
		}
		return "success";
	}

	public String getBooking() {
		if (user != null) {

			System.out.println("correct");

			service.getBooking(user.getUserId());

		} else {
			System.out.println("Reservation creation is failed");
		}
		return "success";
	}

	public String cancelResrvtn() {
		if (bean != null) {
			System.out.println("success cancel reservation");
			service.getBooking(bean.getReservationId());
		} else {
			System.out.println("Reservation cancelling is failed");
		}
		return "success";
	}
}
