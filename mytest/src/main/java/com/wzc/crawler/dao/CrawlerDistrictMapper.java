package com.wzc.crawler.dao;

import java.util.List;

import com.wzc.crawler.entity.CrawlerDistrict;

public interface CrawlerDistrictMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CrawlerDistrict record);

    int insertSelective(CrawlerDistrict record);

    CrawlerDistrict selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CrawlerDistrict record);

    int updateByPrimaryKey(CrawlerDistrict record);
    
    List<CrawlerDistrict> findByCriteria(CrawlerDistrict cd);
}