package com.bus.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="bus_info")
@Component
public class BusInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "BUS_ID")
	private long busId;
	@Column(name = "BUS_NAME")
	private String busName;
	@Column(name = "BUS_TYPE")
	private String busType;
	@Column(name = "BUS_NUMBER")
	private String busNumber;
	@Column(name = "STARTS_FROM")
	private String startsFrom;
	@Column(name = "ARRIVES_AT")
	private String arrivesAt;
	@Column(name = "FARE")
	private double fare;
	public long getBusId() {
		return busId;
	}
	public void setBusId(long busId) {
		this.busId = busId;
	}
	public String getBusName() {
		return busName;
	}
	public void setBusName(String busName) {
		this.busName = busName;
	}
	public String getBusType() {
		return busType;
	}
	public void setBusType(String busType) {
		this.busType = busType;
	}
	public String getBusNumber() {
		return busNumber;
	}
	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}
	public String getStartsFrom() {
		return startsFrom;
	}
	public void setStartsFrom(String startsFrom) {
		this.startsFrom = startsFrom;
	}
	public String getArrivesAt() {
		return arrivesAt;
	}
	public void setArrivesAt(String arrivesAt) {
		this.arrivesAt = arrivesAt;
	}
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	
}
