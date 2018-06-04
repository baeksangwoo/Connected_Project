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

			// Resource가 AutoWired와 비슷한 기능
		@Resource(name = "Car_latlongDao")
		Dao<Car_latlong, String> dao;
		
		@Transactional // 자동 트렌젝션 처리 데이터가 바뀔때
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