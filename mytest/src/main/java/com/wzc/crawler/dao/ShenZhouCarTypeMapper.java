package com.wzc.crawler.dao;

import java.util.List;

import com.wzc.crawler.entity.CarType;
import com.wzc.crawler.entity.ShenZhouCarType;

public interface ShenZhouCarTypeMapper {
    int deleteByPrimaryKey(String id);

    int insert(ShenZhouCarType record);

    int insertSelective(ShenZhouCarType record);

    ShenZhouCarType selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ShenZhouCarType record);

    int updateByPrimaryKey(ShenZhouCarType record);
}