package com.hw.car_Air_condition;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hw.frame.Dao;
import com.hw.mapper.Car_Air_conditionMapper;
import com.hw.vo.Car_Air_condition;

@Repository("Car_Air_conditionDao")
public class Car_Air_conditionDao implements Dao<Car_Air_condition, String> {

	@Autowired
	Car_Air_conditionMapper mapper;
	// ¸â¹ö ¸ÊÆÛ¸¦ ÂüÁ¶ÇÏ°Ú´Ù mybatis

	@Override
	public void insert(Car_Air_condition m) {
		mapper.insert(m);
	}

	@Override
	public void delete(String s) {
		mapper.delete(s);
	}

	@Override
	public void update(Car_Air_condition m) {
		mapper.update(m);
	}

	@Override
	public Car_Air_condition select(String s) {
		return mapper.select(s);
	}

	@Override
	public List<Car_Air_condition> select() {
		return mapper.selectall();
	}

}
