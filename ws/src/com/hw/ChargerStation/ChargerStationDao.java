package com.hw.ChargerStation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hw.frame.Dao;
import com.hw.mapper.ChargerStaionMapper;
import com.hw.vo.ChargerStation;

@Repository("chargerstationDao")
public class ChargerStationDao implements Dao<ChargerStation, String>{

	@Autowired
	ChargerStaionMapper mapper;
	
	@Override
	public void insert(ChargerStation t) {
		mapper.insert(t);
	}
	
	@Override
	public void delete(String s) {
		mapper.delete(s);
	}
	
	@Override
	public void update(ChargerStation t) {
		mapper.update(t);
	}

	@Override
	public ChargerStation select(String s) {
		
		return mapper.select(s);
	}

	@Override
	public List<ChargerStation> select() {	
		return mapper.selectall();
	}

	
}
