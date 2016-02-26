package com.reservation.manage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HotelReservationDAOImpl implements IHotelReservationDAO {

    public Statement stmnt = null;
    public ResultSet rows = null;
   public Connection con = null;
    
    @Override
    public Connection dbConnector() {

     
        try {
        	
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);

            if (con != null) {
                System.out.println("Connection successfull");
            } else {
                System.out.println("Connection not successfull");
            }

        } catch (SQLException e) {
            e.printStackTrace();

        } catch (ClassNotFoundException ex) {

            ex.printStackTrace();

        }

        return con;

    }

    @Override
    public int login(String usrnme, String passwrd) {
        int count = 0;
        con = dbConnector();
        String logQuery = " select username,password from user where username = '" + usrnme + "' and  password ='" + passwrd + "'";
        try {
            stmnt = con.createStatement();
            rows = stmnt.executeQuery(logQuery);
            while (rows.next()) {
                count = count + 1;

            }

            if (count == 1) {
                System.out.println("granted");

            } else if (count > 0) {
                System.out.println("duplicate");

            } else {
                System.out.println("check username password");

            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return 1;
    }

}
