package com.reservation.manage;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

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

}
