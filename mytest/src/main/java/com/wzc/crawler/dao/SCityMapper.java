package com.wzc.crawler.dao;

import java.util.List;

import com.wzc.crawler.entity.SCity;

public interface SCityMapper {
    int deleteByPrimaryKey(String cityid);

    int insert(SCity record);

    int insertSelective(SCity record);

    SCity selectByPrimaryKey(String cityid);

    int updateByPrimaryKeySelective(SCity record);

    int updateByPrimaryKey(SCity record);
    
    List<SCity> findByCriteria(SCity sCity);
}