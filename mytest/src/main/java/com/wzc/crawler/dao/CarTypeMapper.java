package com.wzc.crawler.dao;

import java.util.List;

import com.wzc.crawler.entity.CarType;

public interface CarTypeMapper {
    int deleteByPrimaryKey(String id);

    int insert(CarType record);

    int insertSelective(CarType record);

    CarType selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(CarType record);

    int updateByPrimaryKey(CarType record);
    
    List<CarType> findByCriteria(CarType carType);
	
}