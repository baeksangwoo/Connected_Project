package com.hw.mapper;

import java.util.List;
import com.hw.vo.Car_Air_condition;

public interface Car_Air_conditionMapper {
	public void insert(Car_Air_condition obj);
	public void delete(String code);
	public void update(Car_Air_condition obj);
	public  Car_Air_condition select(String code);
	public List< Car_Air_condition> selectall();
}
