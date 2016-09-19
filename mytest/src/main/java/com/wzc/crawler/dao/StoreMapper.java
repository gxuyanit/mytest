package com.wzc.crawler.dao;

import java.util.List;
import java.util.Map;

import com.wzc.crawler.entity.Store;

public interface StoreMapper {
    int deleteByPrimaryKey(String id);

    int insert(Store record);

    int insertSelective(Store record);

    Store selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Store record);

    int updateByPrimaryKey(Store record);
    
    List<Store> findByCriteria(Store store);
    
    /**
     * @Description: 根据爬虫id和区域查询门店 
     * @param map  爬虫id：sourceId；区域id：districtId
     * @return
     * @throws: 
     * @author: xxy
     * @update:[2015年7月2日 下午6:08:01] xxy 变更描述
     */
    List<Store> findBySource(Map<String, Object> map);

	List<Store> findAll();
}