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
	// Resource�� AutoWired�� ����� ���
	@Resource(name = "Car_Air_conditionDao")
	Dao<Car_Air_condition, String> dao;

	@Transactional // �ڵ� Ʈ������ ó�� �����Ͱ� �ٲ�
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
