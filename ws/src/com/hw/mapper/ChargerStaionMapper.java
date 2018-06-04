package com.hw.mapper;

import java.util.List;

import com.hw.vo.ChargerStation;

public interface ChargerStaionMapper {
	public void insert(ChargerStation obj);
	public void delete(String id);
	public void update(ChargerStation obj);
	public ChargerStation select(String id);
	public List<ChargerStation> selectall();
}
