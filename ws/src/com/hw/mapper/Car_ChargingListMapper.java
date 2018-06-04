package com.hw.mapper;

import java.util.List;

import com.hw.vo.Car_ChargingList;

public interface Car_ChargingListMapper {
	public void insert(Car_ChargingList obj);
	public void delete(String code);
	public void update(Car_ChargingList obj);
	public  Car_ChargingList select(String code);
	public List< Car_ChargingList> selectall();
	public List<Car_ChargingList> selectalls(int end);
}

