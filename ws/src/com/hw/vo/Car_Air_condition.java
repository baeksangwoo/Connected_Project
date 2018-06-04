package com.hw.vo;

import java.util.Date;

public class Car_Air_condition {
	
	float temper;
	float dust_m;
	float dust_s;
	float humidity;
	Date inside_time;
	String car_number;
	
	public float getTemper() {
		return temper;
	}
	public void setTemper(float temper) {
		this.temper = temper;
	}

	public float getDust_m() {
		return dust_m;
	}

	public void setDust_m(float dust_m) {
		this.dust_m = dust_m;
	}

	public float getDust_s() {
		return dust_s;
	}
	
	public void setDust_s(float dust_s) {
		this.dust_s = dust_s;
	}

	public float getHumidity() {
		return humidity;
	}
	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}
	public Date getInside_time() {
		return inside_time;
	}
	public void setInside_time(Date inside_time) {
		this.inside_time = inside_time;
	}
	public String getCar_number() {
		return car_number;
	}
	public void setCar_number(String car_number) {
		this.car_number = car_number;
	}


	@Override
	public String toString() {
		return "Car_Air_condition [temper=" + temper + ", dust_m=" + dust_m + ","
				+ " dust_s=" + dust_s + ", humidity=" + humidity + ","
						+ " inside_time=" + inside_time + ", car_number=" + car_number + "]";
	
	}
	
}
