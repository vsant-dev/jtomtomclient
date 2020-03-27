package com.vs.jtomtomclient.model;

import java.time.LocalDate;

public class DateTime {
	private LocalDate date;
	private Integer hour;
	private Integer minute;
	
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Integer getHour() {
		return hour;
	}
	public void setHour(Integer hour) {
		this.hour = hour;
	}
	public Integer getMinute() {
		return minute;
	}
	public void setMinute(Integer minute) {
		this.minute = minute;
	}
	
	
}
