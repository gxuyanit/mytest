package com.wzc.crawler.dao;

import java.util.List;

import com.wzc.crawler.entity.BusinessCircles;

public interface BusinessCirclesMapper {
    int deleteByPrimaryKey(String id);

    int insert(BusinessCircles record);

    int insertSelective(BusinessCircles record);

    BusinessCircles selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BusinessCircles record);

    int updateByPrimaryKey(BusinessCircles record);
    
    List<BusinessCircles> findByCriteria(BusinessCircles businessCircles);
}