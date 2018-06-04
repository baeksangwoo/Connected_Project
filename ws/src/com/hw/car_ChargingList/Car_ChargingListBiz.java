package com.hw.car_ChargingList;

import java.util.List;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hw.vo.Car_ChargingList;

@Service("Car_ChargingListBiz")
public class Car_ChargingListBiz {

	// Resource�� AutoWired�� ����� ���
	@Resource(name = "Car_ChargingListDao")
	@Inject
	Car_ChargingListDao dao;

	@Transactional // �ڵ� Ʈ������ ó�� �����Ͱ� �ٲ�
	public void register(Car_ChargingList m) {
		dao.insert(m);
	}
	@Transactional
	public void remove(String s) {
		dao.delete(s);
	}

	@Transactional
	public void modify(Car_ChargingList m) {
		dao.update(m);
	}


	public Car_ChargingList get(String s) {
		return dao.select(s);
	}
		
	public List<Car_ChargingList> get() {
		return dao.select();
	}
	
	public List<Car_ChargingList> getall(int s){
		return dao.selectalls(s);
	}
	
}
