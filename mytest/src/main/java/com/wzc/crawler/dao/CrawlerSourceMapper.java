package com.wzc.crawler.dao;

import java.util.List;

import com.wzc.crawler.entity.CarType;
import com.wzc.crawler.entity.CrawlerSource;

public interface CrawlerSourceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CrawlerSource record);

    int insertSelective(CrawlerSource record);

    CrawlerSource selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CrawlerSource record);

    int updateByPrimaryKey(CrawlerSource record);
    
    List<CrawlerSource> findByCriteria(CrawlerSource cs);
}