package com.wzc.crawler.dao;

import java.util.List;
import java.util.Map;

import com.wzc.crawler.entity.SDistrict;

public interface SDistrictMapper {
    int deleteByPrimaryKey(Integer districtid);

    int insert(SDistrict record);

    int insertSelective(SDistrict record);

    SDistrict selectByPrimaryKey(Integer districtid);

    int updateByPrimaryKeySelective(SDistrict record);

    int updateByPrimaryKey(SDistrict record);
    
    List<SDistrict> findByCriteria(SDistrict sDistrict);
    
    /**
     * @Description: 根据name得到区域id最小的那个 
     * @param name
     * @return
     * @throws: 
     * @author: xxy
     * @update:[2015年6月26日 上午11:22:03] xxy 变更描述
     */
    SDistrict getByName(String name);
	
	List<SDistrict> findAll();
   
}