package com.hw.vo;

import java.util.Date;

public class Car_ChargingList {
	
	String car_charging_status;
	Date car_charging_date;
	String car_charging_place;
	float car_battery_capacity;
	float car_battery_cicle;
	float car_battery_temperature;
	int car_remain_date;
	String car_number;
	String cs_name;
	String cs_addr;
	int start;
	int end;
		
	public String getCs_name() {
		return cs_name;
	}
	public void setCs_name(String cs_name) {
		this.cs_name = cs_name;
	}
	public String getCs_addr() {
		return cs_addr;
	}
	public void setCs_addr(String cs_addr) {
		this.cs_addr = cs_addr;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public String getName() {
		return cs_name;
	}
	public void setName(String cs_name) {
		this.cs_name = cs_name;
	}
	public String getAddr() {
		return cs_addr;
	}
	public void setAddr(String cs_addr) {
		this.cs_addr = cs_addr;
	}
	public String getCar_charging_status() {
		return car_charging_status;
	}
	public void setCar_charging_status(String car_charging_status) {
		this.car_charging_status = car_charging_status;
	}
	public Date getCar_charging_date() {
		return car_charging_date;
	}
	public void setCar_charging_date(Date car_charging_date) {
		this.car_charging_date = car_charging_date;
	}
	public String getCar_charging_place() {
		return car_charging_place;
	}
	public void setCar_charging_place(String car_charging_place) {
		this.car_charging_place = car_charging_place;
	}
	public float getCar_battery_capacity() {
		return car_battery_capacity;
	}
	public void setCar_battery_capacity(float car_battery_capacity) {
		this.car_battery_capacity = car_battery_capacity;
	}
	public float getCar_battery_cicle() {
		return car_battery_cicle;
	}
	public void setCar_battery_cicle(float car_battery_cicle) {
		this.car_battery_cicle = car_battery_cicle;
	}
	public float getCar_battery_temperature() {
		return car_battery_temperature;
	}
	public void setCar_battery_temperature(float car_battery_temperature) {
		this.car_battery_temperature = car_battery_temperature;
	}
	public int getCar_remain_date() {
		return car_remain_date;
	}
	public void setCar_remain_date(int car_remain_date) {
		this.car_remain_date = car_remain_date;
	}
	public String getCar_number() {
		return car_number;
	}
	public void setCar_number(String car_number) {
		this.car_number = car_number;
	}
	
}
