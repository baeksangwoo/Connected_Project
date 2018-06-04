package com.hw.car_ChargingList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hw.frame.Dao;
import com.hw.mapper.Car_ChargingListMapper;
import com.hw.vo.Car_ChargingList;


@Repository("Car_ChargingListDao")
public class Car_ChargingListDao {

	@Autowired
	Car_ChargingListMapper mapper;
	// ¸â¹ö ¸ÊÆÛ¸¦ ÂüÁ¶ÇÏ°Ú´Ù mybatis
	
	public void insert(Car_ChargingList m) {
		mapper.insert(m);
	}

	public void delete(String s) {
		mapper.delete(s);
	}
	public void update(Car_ChargingList m) {
		mapper.update(m);
	}

	public Car_ChargingList select(String s) {
		return mapper.select(s);
	}
	
	public List<Car_ChargingList> select() {
		return mapper.selectall();
	}

	public List<Car_ChargingList> selectalls(int s) {
		return mapper.selectalls(s);
	}
	
}



