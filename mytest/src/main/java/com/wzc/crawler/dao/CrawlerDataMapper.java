package com.wzc.crawler.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.wzc.crawler.entity.CrawlerData;

public interface CrawlerDataMapper {
    int deleteByPrimaryKey(String id);

    int insert(CrawlerData record);

    int insertSelective(CrawlerData record);

    CrawlerData selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(CrawlerData record);

    int updateByPrimaryKey(CrawlerData record);
    
    /**
     * @Description: 根据条件查询数据 
     * @param map
     * @return
     * @throws: 
     * @author: xxy
     * @update:[2015年6月26日 上午11:02:18] xxy 变更描述
     */
    List<CrawlerData> findByCriteria(CrawlerData cd);
    
    /**
     * @Description: 删除这个时间之前的数据
     * @param date
     * @return
     * @throws: 
     * @author: xxy
     * @update:[2015年6月26日 上午11:02:35] xxy 变更描述
     */
    int deleteLessThenDate(Date date);
    
    /**
     * @Description: 根据门店id更新车型日期可租状态
     * @param storeId
     * @return
     * @throws: 
     * @author: xxy
     * @update:[2015年6月26日 上午11:09:35] xxy 变更描述
     */
    int updateByStoreId(String storeId);
    
    /**
     * @Description: 将数据更新标示变为初始状态 0
     * @return
     * @throws: 
     * @author: xxy
     * @update:[2015年6月26日 下午4:01:18] xxy 变更描述
     */
    int updateFlagIsInit(Integer sourceId);
    
    int updateStatus(Integer sourceId);
}