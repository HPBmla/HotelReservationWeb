package com.reservation.beans;

public class User {

	private String username;
	private String password;
	private String fname;
	private String lname;
	private String add1;
	private String add2;
	private String add3;
	private int telNum;
	private String nic;
	private boolean userType;
	public User()
	{
		
	}
	public User(String uNme,String pWrd,String fnme,String lnme, String ad1,String ad2,String ad3, int tel,String nic, boolean flg )
	{
		username = uNme;
		password = pWrd;
		fname = fnme;
		lname = lnme;
		add1 = ad1;
		add2 = ad2;
		add3 = ad3;
		telNum = tel;
		this.nic = nic;
		userType = flg;
	}
	public boolean isUserType() {
		
		return userType;
	}
	public void setUserType(boolean userType) {
		this.userType = userType;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getAdd1() {
		return add1;
	}
	public void setAdd1(String add1) {
		this.add1 = add1;
	}
	public String getAdd2() {
		return add2;
	}
	public void setAdd2(String add2) {
		this.add2 = add2;
	}
	public String getAdd3() {
		return add3;
	}
	public void setAdd3(String add3) {
		this.add3 = add3;
	}
	public int getTelNum() {
		return telNum;
	}
	public void setTelNum(int telNum) {
		this.telNum = telNum;
	}
	public String getNic() {
		return nic;
	}
	public void setNic(String nic) {
		this.nic = nic;
	}
 public enum UserTpe
 {
	 CUSTOMER,
	 EMPLOYEE,
	 ADMIN
 }
	
}
