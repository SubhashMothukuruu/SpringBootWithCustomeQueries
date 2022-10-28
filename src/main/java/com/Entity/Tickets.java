package com.Entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;


@Entity
@Table(name = "TICKETS")
public class Tickets {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="TICKET_ID")
	private int ticketId;
	
	@Column(name="USER_NAME")
	private String userName;
	
	@Column(name="BUS_NUMBER")
	private String busNumber;
	
	@Column(name="BUS_TYPE")
	private String busType;
	
	@Column(name="DEPOT")
	private String depot;

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}

	public String getBusType() {
		return busType;
	}

	public void setBusType(String busType) {
		this.busType = busType;
	}

	public String getDepot() {
		return depot;
	}

	public void setDepot(String depot) {
		this.depot = depot;
	}

	public Tickets(int ticketId, String userName, String busNumber, String busType, String depot) {
		super();
		this.ticketId = ticketId;
		this.userName = userName;
		this.busNumber = busNumber;
		this.busType = busType;
		this.depot = depot;
	}

	public Tickets() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
