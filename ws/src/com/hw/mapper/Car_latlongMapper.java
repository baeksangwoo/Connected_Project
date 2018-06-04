package com.hw.mapper;

import java.util.List;

import com.hw.vo.Car_latlong;

public interface Car_latlongMapper {
	public void insert(Car_latlong obj);
	public void delete(String code);
	public void update(Car_latlong obj);
	public  Car_latlong select(String code);
	public List< Car_latlong> selectall();
}
