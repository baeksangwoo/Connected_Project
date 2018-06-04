package com.hw.Car_latlong;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hw.frame.Biz;
import com.hw.frame.Dao;
import com.hw.vo.Car_control;
import com.hw.vo.Car_latlong;

@Service("Car_latlongBiz")
public class Car_latlongBiz implements Biz<Car_latlong, String> {

			// Resource�� AutoWired�� ����� ���
		@Resource(name = "Car_latlongDao")
		Dao<Car_latlong, String> dao;
		
		@Transactional // �ڵ� Ʈ������ ó�� �����Ͱ� �ٲ�
		@Override
		public void register(Car_latlong m) {
			dao.insert(m);
		}
		
		@Transactional
		@Override
		public void remove(String s) {
			dao.delete(s);
		}
		
		@Transactional
		@Override
		public void modify(Car_latlong m) {
			dao.update(m);
		
		}
		
		@Override
		public Car_latlong get(String s) {
			return dao.select(s);
		}
		
		@Override
		public List<Car_latlong> get() {
		
			return dao.select();
		}

}