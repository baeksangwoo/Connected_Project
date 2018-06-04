package com.hw.ChargerStation;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hw.frame.Biz;
import com.hw.frame.Dao;
import com.hw.vo.ChargerStation;

@Service("chargerstationBiz")
public class ChargerStationBiz implements Biz<ChargerStation, String> {
	
	@Resource(name = "chargerstationDao")
	Dao<ChargerStation,String> dao;
	
	public ChargerStationBiz() {
		dao =new ChargerStationDao();
	}
	
	@Transactional
	@Override
	public void register(ChargerStation t) {
		dao.insert(t);
	}
	
	@Transactional
	@Override
	public void remove(String s) {
		dao.delete(s);
	}
	
	// transaction이 되는 함수라는 뜻이다.
		@Transactional
		@Override
		public void modify(ChargerStation t) {
			dao.update(t);
		}
		
		@Override
		public ChargerStation get(String s) {
			return dao.select(s);
		}

		@Override
		public List<ChargerStation> get() {
			return dao.select();
		}

}
