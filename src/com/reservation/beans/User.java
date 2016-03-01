package com.reservation.beans;

public class User {

	private String username;
	private String password;
	private String newPassword;
	private String reTypedPassword;
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
	public User(String fnme,String lnme, String ad1,String ad2,String ad3,String uNme,String pWrd, int tel, boolean flg,String nic )
	{
		setUsername(uNme);
		username = getUsername();
		setPassword(pWrd);
		password = getPassword();
		setFname(fnme);
		fname = getFname();
		setLname(lnme);
		
		lname = getLname();
		setAdd1(ad1);
		add1 = getAdd1();
		setAdd2(ad2);
		add2 = getAdd2();
		setAdd3(ad3);
		add3 = getAdd3();
		setTelNum(tel);
		telNum = getTelNum();
		setNic(nic);
		this.nic = getNic();
		setUserType(flg);
		
		userType = isUserType();
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
	//newly created methods for change credentials method
 public String getNewPassword() {
		return newPassword;
	}
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
public String getReTypedPassword() {
		return reTypedPassword;
	}
	public void setReTypedPassword(String reTypedPassword) {
		this.reTypedPassword = reTypedPassword;
	}
public enum UserType
 {
	 CUSTOMER,
	 EMPLOYEE,
	 ADMIN
 }
	
}
