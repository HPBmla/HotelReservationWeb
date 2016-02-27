package com.reservation.manage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.reservation.beans.User;

public class HotelReservationDAOImpl implements IHotelReservationDAO {

    private static final String String = null;
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
     /*   try {
			//con.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}*/

        return 1;
    }

	@Override
	public int userRegistration(User user) {
		//user.setFname();
		String firstNme = user.getFname();
		String lastNme = user.getLname();
		String add1 = user.getAdd1();
		String add2 = user.getAdd2();
		String add3 = user.getAdd3();
		String usrnme = user.getUsername();
		String pswrd = user.getPassword();
		int telNum = user.getTelNum();
		boolean flagUser = user.isUserType();
		
		String addSql = " insert into user (fname,lname,add_lne1,add_lne2,add_ln3,username,password,tel_num,flag_user,nic) "+ 
				"values "+ "('"+ firstNme+"','"+lastNme+"','"+add1+"','"+add2+"','"+add3+"','"+usrnme+"','"+pswrd+"','"+telNum+"','"+flagUser+"')";
		try {
			stmnt = con.createStatement();
			int i = stmnt.executeUpdate(addSql);
			if(i > 0)
			{
				System.out.println("Records inserted");
			}
			else
			{
				System.out.println("Records not inserted");
			}
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return 1;
	}

}
