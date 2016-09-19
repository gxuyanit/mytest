package com.wzc.crawler.dao;

import java.util.List;

import com.wzc.crawler.entity.CarType;
import com.wzc.crawler.entity.StoreCartype;

public interface StoreCartypeMapper {
    int deleteByPrimaryKey(String id);

    int insert(StoreCartype record);

    int insertSelective(StoreCartype record);

    StoreCartype selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(StoreCartype record);

    int updateByPrimaryKey(StoreCartype record);
    
    List<StoreCartype> findByCriteria(StoreCartype storeCartype);
}