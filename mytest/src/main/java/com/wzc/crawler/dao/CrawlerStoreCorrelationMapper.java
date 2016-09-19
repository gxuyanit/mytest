package com.wzc.crawler.dao;


import java.util.List;

import com.wzc.crawler.entity.CrawlerStoreCorrelation;

public interface CrawlerStoreCorrelationMapper {
    int deleteByPrimaryKey(String id);

    int insert(CrawlerStoreCorrelation record);

    int insertSelective(CrawlerStoreCorrelation record);

    CrawlerStoreCorrelation selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(CrawlerStoreCorrelation record);

    int updateByPrimaryKey(CrawlerStoreCorrelation record);
    
    List<CrawlerStoreCorrelation> findByCriteria(CrawlerStoreCorrelation record);
}