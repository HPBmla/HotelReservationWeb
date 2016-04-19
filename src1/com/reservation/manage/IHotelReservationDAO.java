package com.reservation.manage;
 
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import com.reservation.beans.Customer;
import com.reservation.beans.ReservationBean;
import com.reservation.beans.User;

public interface IHotelReservationDAO {
	
	public Connection connection = null;

    public static String driver = "com.mysql.jdbc.Driver";
    public static String url = "jdbc:mysql://localhost:3306/hotel_reservation";

    //db details
    public static String username = "root";

    public static String password = "";
    public static Statement stmnt = null;
    public static ResultSet rows = null;
	public Connection dbConnector();
	public int login(String usrnme, String passwrd);
	public int userRegistration(User user);
//	public int userRegistrations(User user,Customer cus);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public User getUserDetails(int UId);
	public List<ReservationBean> getAllBookings();
	public List<ReservationBean> getAllBookings(int UsrId);
	public String encryption(String password);
}
