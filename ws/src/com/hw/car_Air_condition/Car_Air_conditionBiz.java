package com.hw.car_Air_condition;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hw.frame.Biz;
import com.hw.frame.Dao;
import com.hw.vo.Car_Air_condition;

@Service("Car_Air_conditionBiz")
public class Car_Air_conditionBiz implements Biz<Car_Air_condition, String> { 
	// Resource가 AutoWired와 비슷한 기능
	@Resource(name = "Car_Air_conditionDao")
	Dao<Car_Air_condition, String> dao;

	@Transactional // 자동 트렌젝션 처리 데이터가 바뀔때
	@Override
	public void register(Car_Air_condition m) {
		dao.insert(m);
	}

	@Transactional
	@Override
	public void remove(String s) {
		dao.delete(s);
	}

	@Transactional
	@Override
	public void modify(Car_Air_condition m) {
		dao.update(m);
	}

	@Override
	public Car_Air_condition get(String s) {
		return dao.select(s);
	}

	@Override
	public List<Car_Air_condition> get() {
		return dao.select();
	}
}
