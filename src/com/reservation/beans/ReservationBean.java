package com.reservation.beans;

import java.util.Date;

public class ReservationBean {
	private String chechinDte;
	private String chechoutDte;
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
	public String getChechinDte() {
		return chechinDte;
	}
	public void setChechinDte(String chechinDte) {
		this.chechinDte = chechinDte;
	}
	public String getChechoutDte() {
		return chechoutDte;
	}
	public void setChechoutDte(String chechoutDte) {
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
