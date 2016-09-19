package com.wzc.crawler.dao;

import java.util.List;

import com.wzc.crawler.entity.CarType;
import com.wzc.crawler.entity.CrawlerCity;

public interface CrawlerCityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CrawlerCity record);

    int insertSelective(CrawlerCity record);

    CrawlerCity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CrawlerCity record);

    int updateByPrimaryKey(CrawlerCity record);
    
    List<CrawlerCity> findByCriteria(CrawlerCity cc);
}