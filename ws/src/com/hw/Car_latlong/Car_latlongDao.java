package com.hw.Car_latlong;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hw.frame.Dao;
import com.hw.mapper.Car_latlongMapper;
import com.hw.vo.Car_latlong;

@Repository("Car_latlongDao")
public class Car_latlongDao implements Dao<Car_latlong, String> {

	@Autowired
	Car_latlongMapper mapper;
	// ¸â¹ö ¸ÊÆÛ¸¦ ÂüÁ¶ÇÏ°Ú´Ù mybatis

	@Override
	public void insert(Car_latlong m) {
		mapper.insert(m);
	}

	@Override
	public void delete(String s) {
		mapper.delete(s);
	}

	@Override
	public void update(Car_latlong m) {
		mapper.update(m);
	}

	@Override
	public Car_latlong select(String s) {
		return mapper.select(s);
	}

	@Override
	public List<Car_latlong> select() {
		return mapper.selectall();
	}

}
