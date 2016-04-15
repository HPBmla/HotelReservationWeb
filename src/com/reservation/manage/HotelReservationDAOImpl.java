package com.reservation.manage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import com.reservation.beans.Customer;
import com.reservation.beans.ReservationBean;
import com.reservation.beans.User;

public class HotelReservationDAOImpl implements IHotelReservationDAO {

    private static final String String = null;
	public Statement stmnt = null;
    public ResultSet rows = null;
   public Connection con = null;
   public PreparedStatement pstmnt =null; 
    Customer customer = null;
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
        finally
        {
        	closeConnctn(con, rows, stmnt);
        }
     /*   try {
			//con.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}*/

        
        return count;
    }
     public User getUser(String username)
     {
    	 
    	 String query = "select user_id,fname,lname,tel_num,nic from user where username='"+username+"'";
    	 User user = new User();
    	 con = dbConnector();
    	 try {
			stmnt = con.createStatement();
			rows = stmnt.executeQuery(query);
			while(rows.next())
			{
				user.setUserId(rows.getInt("user_id"));
			    user.setFname(rows.getString("fname"));
			    user.setLname(rows.getString("lname"));
			    user.setNic(rows.getString("nic"));
			    user.setTelNum(rows.getInt("tel_num"));
				
			}
	    	 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         finally
         {
        	 closeConnctn(con, rows, stmnt);
         }
    	 return user;
     }
     
	@Override
	public int userRegistration(User user) {
		//user.setFname();
		
		customer = new Customer();
		user.setUserType("true");
		String flag = user.getUserType();
		String firstNme = user.getFname();
		String lastNme = user.getLname();
		String add1 = user.getAdd1();
		String add2 = user.getAdd2();
		String add3 = user.getAdd3();
		String usrnme = user.getUsername();
		String pswrd = user.getPassword();
		int telNum = user.getTelNum();
		String flagUser = user.getUserType();
		String nic = user.getNic();
		int userId =0;
		
		String email = customer.getEmail();
		System.out.println("userId is "+email);
		String travel = customer.getModeOfTraveling();
		
		String addSql = " insert into user (fname,lname,add_lne1,add_lne2,add_lne3,username,password,tel_num,flag_user,nic) "+ 
				"values "+ "('"+firstNme+"','"+lastNme+"','"+add1+"','"+add2+"','"+add3+"','"+usrnme+"','"+pswrd+"','"+telNum+"','"+flagUser+"','"+nic+"')";
		try {
			con =dbConnector();
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
		
		
		
		finally
		{
			closeConnctn(con, rows, stmnt);
		}
               
	user=getUser(usrnme);
	
	userId = user.getUserId();
		
		
		String addCusQuery = "insert into customer (email,rsn_of_travl,user_id)"+ 
				"values "+ "('"+email+"','"+travel+"','"+userId+"')";
		try {
			con =dbConnector();
			stmnt = con.createStatement();
			int i = stmnt.executeUpdate(addCusQuery);
			
			
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
		
		
		
		finally
		{
			closeConnctn(con, rows, stmnt);
		}
		
		
		return 1;
	}
	
	
/*	@Override
	public int userRegistrations(User user,Customer cus) {
		//user.setFname();
		user.setUserType("true");
		String flag = user.getUserType();
		String firstNme = user.getFname();
		String lastNme = user.getLname();
		String add1 = user.getAdd1();
		String add2 = user.getAdd2();
		String add3 = user.getAdd3();
		String usrnme = user.getUsername();
		String pswrd = user.getPassword();
		int telNum = user.getTelNum();
		String flagUser = user.getUserType();
		String nic = user.getNic();
		int userId = user.getUserId();
	//	String email = cus.getEmail();
	//	String travel = cus.getModeOfTraveling();
		
		
		String addSql = " insert into user (fname,lname,add_lne1,add_lne2,add_lne3,username,password,tel_num,flag_user,nic) "+ 
				"values "+ "('"+firstNme+"','"+lastNme+"','"+add1+"','"+add2+"','"+add3+"','"+usrnme+"','"+pswrd+"','"+telNum+"','"+flagUser+"','"+nic+"')";
		try {
			con =dbConnector();
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
		
		
		
		finally
		{
			closeConnctn(con, rows, stmnt);
		}
		String emails = "ssssssssssssss";
		String travels = "travel";
		
		String addCusQuery = "insert into customer (email,rsn_of_travl,user_id)"+ 
				"values "+ "('"+emails+"','"+travels+"','"+userId+"')";
		try {
			con =dbConnector();
			stmnt = con.createStatement();
			int i = stmnt.executeUpdate(addCusQuery);
			
			
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
		
		
		
		finally
		{
			closeConnctn(con, rows, stmnt);
		}
		
		return 1;
	}*/
	
	//create reservation
		public String createReservation(ReservationBean bean) {
			
			Date chechinDte = bean.getChechinDte();
			Date chechoutDte = bean.getChechoutDte();
			int noOfRms = bean.getNoOfRms();
			int noOfGuests = bean.getNoOfGuests();
			String roomType = bean.getRoomType();
			int personId = bean.getPersonId();
			String status = bean.getStatus();
			
			String addSql = " INSERT INTO reservation (checkin_date,chechout_date,persn_id,status) "+ 
					"values "+ "('"+ chechinDte +"','"+ chechoutDte +"','"+ personId +"','"+ status +"')";
			String addnewSql = " INSERT INTO room (no_of_rms,no_of_guests,room_type) "+
					"values "+ "('"+ noOfRms +"','"+ noOfGuests +"','"+ roomType +"')";
			
			/*String addSql = " INSERT INTO reservation (checkin_date,chechout_date,no_of_rooms,guests,room_type) "+ 
					"values "+ "('"+ chechinDte +"','"+ chechoutDte +"','"+ noOfRms +"','"+ noOfGuests +"','"+ roomType +"')";*/
			try {
				con = dbConnector();
				stmnt = con.createStatement();
				int i = stmnt.executeUpdate(addSql);
				int j = stmnt.executeUpdate(addnewSql);
				if(i > 0)
				{
					System.out.println("New Reservation Inserted into reservation table");
				}
				else
				{
					System.out.println("Error inserting new Reservation into reservation tbl");
				}
				if(j > 0)
				{
					System.out.println("New Reservation Inserted into room table");
				}
				else
				{
					System.out.println("Error inserting new Reservation into room tbl");
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			return "success";
		}
	
	//getBookings
		public ReservationBean getBooking(int Uid) {
			int userid = Uid;
			con = dbConnector();
			ReservationBean bean = new ReservationBean();
			
			//fields names seperately
			String getBookingQuery = " SELECT checkindate,checkoutdate,noofrooms,noofguests,roomtype,status,personid FROM reservation WHERE persn_id = '"+ userid +"' ";
			
			try {
				stmnt = con.createStatement();
				rows = pstmnt.executeQuery();
				while(rows.next()){
					//user.setFname(rows.getString("fname"));
					bean.setChechinDte(rows.getDate("checkindate"));
					bean.setChechoutDte(rows.getDate("checkoutdate"));
					bean.setNoOfRms(rows.getInt("noofrooms"));
					bean.setNoOfGuests(rows.getInt("noofguests"));
					bean.setRoomType(rows.getString("roomtype"));
					bean.setStatus(rows.getString("status"));
					bean.setPersonId(rows.getInt("personid"));
				}
				//int i = stmnt.executeUpdate(getBookingQuery);
				/*if(i > 0)
				{
					//same as below method
					System.out.println("Retrieved all Bookings");
				}
				else
				{
					System.out.println("Error Retrieving Bookings");
				}	*/
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			finally
			{
				closeConnctn(con, rows, stmnt);
			}
		return bean;
		}
		
		//update reservation
		public String updateReservation(ReservationBean bean){
			con = dbConnector();
			Date chechinDte = bean.getChechinDte();
			Date chechoutDte = bean.getChechoutDte();
			int noOfRms = bean.getNoOfRms();
			int noOfGuests = bean.getNoOfGuests();
			String roomType = bean.getRoomType();
			
			String updQuery = " UPDATE reservation SET checkin_date = '"+ chechinDte +"' || chechout_date = '"+ chechoutDte +"' || no_of_rooms = '"+ noOfRms +"' || guests = '"+ noOfGuests +"' || room_type = '"+ roomType +"' ";
			
			try {
				stmnt = con.createStatement();
				int i = stmnt.executeUpdate(updQuery);
				if(i > 0)
				{
					System.out.println("Reservation Updated");
				}
				else
				{
					System.out.println("Error Updating Reservation");
				}	
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			return "success";
		}
	
	//cancel reservation
		public boolean cancelResrvtn(int resrvtnId) {
			System.out.println("method calling");
			con = dbConnector();
			String canclResQuery = " DELETE FROM reservation WHERE res_id = '"+ resrvtnId +"' ";
			try
			{
				stmnt = con.createStatement();
				int i = stmnt.executeUpdate(canclResQuery);
				if(i > 0)
				{
					System.out.println("Reservation Cancelled Successfully");
				}
				else
				{
					System.out.println("Error Cancelling Reservation");
				}
			}catch(SQLException e){
				// TODO Auto-generated catch block
	            e.printStackTrace();
			}
			return true;
		}
	
	//update user credentials
		public boolean changeCredentials(User user) 
		{
	        con = dbConnector();
	        String username = user.getUsername();
	        String extPassword = user.getPassword();
	    	String newPassword = user.getNewPassword();
	    	//String reTypedPassword = user.getReTypedPassword();
			
	    	String updQuery = " UPDATE user SET password = '"+ newPassword +"' WHERE password = '"+ extPassword +"' && username = '"+ username +"' ";
	        try {
	        	stmnt = con.createStatement();
				int i = stmnt.executeUpdate(updQuery);
				if(i > 0)
				{
					System.out.println("Credentials Updated");
				}
				else
				{
					System.out.println("Credentials not Updated");
				}
	        } catch (SQLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
			return true;
	    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public User getUserDetails(int UId)
	{
		String viewQuery = "select fname,lname,add_lne1,add_lne2,add_lne3,username,password,tel_num,flag_user,nic from user where user_id ='"+UId+"'";
		con = dbConnector();
		User user = new User();
		try {
			pstmnt = con.prepareStatement(viewQuery);
			rows = pstmnt.executeQuery();
			while(rows.next())
			{

				user.setFname(rows.getString("fname"));
				user.setLname(rows.getString("lname"));
				user.setAdd1(rows.getString("add_lne1"));
				user.setAdd2(rows.getString("add_lne1"));
				user.setAdd3(rows.getString("add_lne3"));
				user.setUsername(rows.getString("username"));
				user.setPassword(rows.getString("password"));
				user.setTelNum(rows.getInt("tel_num"));
				user.setUserType(rows.getString("flag_user"));
				user.setNic(rows.getString("nic"));
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			closeConnctn(con, rows, stmnt);
		}
		return user;
	}
	
	public List<ReservationBean> getAllBookings()
	{
		String getReservtbQuery = "select checkin_date,checkout_date,no_of_rooms,guests,persn_id,room_type from reservation";
		con = dbConnector();
		ReservationBean reservation = new ReservationBean();
		List<ReservationBean> resrveBean = null ;
		try {
			pstmnt = con.prepareStatement(getReservtbQuery);
			rows = pstmnt.executeQuery();
 resrveBean = new ArrayList<ReservationBean>();
			while(rows.next())
			{
				reservation.setChechinDte(rows.getDate("checkin_date"));
				reservation.setChechoutDte(rows.getDate("checkout_date"));
				reservation.setNoOfRms(rows.getInt("no_of_rooms"));
				reservation.setNoOfGuests(rows.getInt("guests"));
				reservation.setPersonId(rows.getInt("persn_id"));
				reservation.setRoomType(rows.getString("room_type"));
				resrveBean.add(reservation);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			closeConnctn(con, rows, stmnt);
		}
		
		return resrveBean;
	}
	
	public List<ReservationBean> getAllBookings(int UsrId)
	{
		String getReservtbQuery = "select checkin_date,checkout_date,persn_id,status,no_of_rms,no_of_guests,room_type from reservation where persn_id='"+UsrId+"'";
		con = dbConnector();
		ReservationBean reservtn = null;
		List<ReservationBean> resrveBean = null ;
		try {
			pstmnt = con.prepareStatement(getReservtbQuery);
			rows = pstmnt.executeQuery();
			 resrveBean = new ArrayList<ReservationBean>();
			while(rows.next())
			{
				
				reservtn = new ReservationBean();
				reservtn.setChechinDte(rows.getDate("checkin_date"));
				reservtn.setChechoutDte(rows.getDate("checkout_date"));
				reservtn.setPersonId(rows.getInt("persn_id"));
				reservtn.setStatus(rows.getString("status"));
				reservtn.setNoOfRms(rows.getInt("no_of_rms"));
				reservtn.setNoOfGuests(rows.getInt("no_of_guests"));
				reservtn.setRoomType(rows.getString("room_type"));
				resrveBean.add(reservtn);
			}
			System.out.println(resrveBean.size());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			closeConnctn(con, rows, stmnt);
		}
		
		return resrveBean;
		
		
		
	}

	@Override
	public String encryption(String password) {
		
		StringBuilder hashVal = new StringBuilder();
		try {
			MessageDigest shaType = MessageDigest.getInstance("SHA-1");
			byte[] hashByte = shaType.digest(password.getBytes());
			char[] characters = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                    'a', 'b', 'c', 'd', 'e', 'f' };
			for(int i=0; i< hashByte.length; i++ )
			{
				byte b = hashByte[i];
				hashVal.append(characters[(b & 0Xf0)  >> 4]);
				hashVal.append(characters[(b & 0Xf0) ]);
			}
			
		} catch (NoSuchAlgorithmException e) {
		
			e.printStackTrace();
		}
		
		
		return hashVal.toString();
	}
	
	private void closeConnctn(Connection con, ResultSet rs, Statement stmnt)
	{
		if(rs != null)
		{
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(con != null)
		{
			try {
				con.close();
				
				//stmnt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
