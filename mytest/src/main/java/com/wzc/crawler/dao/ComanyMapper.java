package com.wzc.crawler.dao;

import java.util.List;

import com.wzc.crawler.entity.Comany;

public interface ComanyMapper {
    int deleteByPrimaryKey(String id);

    int insert(Comany record);

    int insertSelective(Comany record);

    Comany selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Comany record);

    int updateByPrimaryKey(Comany record);
    
    List<Comany> getByName(String name);

    List<Comany> findAll();
}