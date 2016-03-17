package com.reservation.beans;

import java.util.Date;

public class ReservationBean {
	private Date chechinDte;
	private Date chechoutDte;
	private int noOfRms;
	private int noOfGuests;
	private String roomType;
	private int personId;
	private String status;
	private int reservationId;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public Date getChechinDte() {
		return chechinDte;
	}
	public void setChechinDte(Date chechinDte) {
		this.chechinDte = chechinDte;
	}
	public Date getChechoutDte() {
		return chechoutDte;
	}
	public void setChechoutDte(Date chechoutDte) {
		this.chechoutDte = chechoutDte;
	}
	public int getNoOfRms() {
		return noOfRms;
	}
	public void setNoOfRms(int noOfRms) {
		this.noOfRms = noOfRms;
	}
	public int getNoOfGuests() {
		return noOfGuests;
	}
	public void setNoOfGuests(int noOfGuests) {
		this.noOfGuests = noOfGuests;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public int getReservationId() {
		return reservationId;
	}
	public void setReservationId(int reservationId) {
		this.reservationId = reservationId;
	}
	
}
