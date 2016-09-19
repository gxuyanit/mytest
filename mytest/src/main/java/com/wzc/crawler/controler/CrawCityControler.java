/**
 * @Title:  CrawCityControler.java
 * @Copyright (C) 2014-2015 by ywx.co.,ltd.All Rights Reserved.
 *  YWX CONFIDENTIAL AND TRADE SECRET
 * @author: xxy 
 * @data:   2015年7月13日 下午2:59:59 
 */
package com.wzc.crawler.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wzc.crawler.dao.CrawlerCityMapper;
import com.wzc.crawler.dao.SCityMapper;
import com.wzc.crawler.entity.CrawlerCity;
import com.wzc.crawler.entity.SCity;


/**  
 * @project：mytest  
 * @Title: CrawCityControler.java 
 * @Description: 城市对应控制类
 * @author xxy
 * @date 2015年7月13日 下午2:59:59 
 */

@RequestMapping("/CCity")
public class CrawCityControler {
	@Autowired
	private CrawlerCityMapper CrawlerCityMapper;
	
	@Autowired
	private SCityMapper sCityMapper;
	
	@RequestMapping(value = "/add" ,method=RequestMethod.GET)
	public String add(Model model){
		SCity sCity = new SCity();
		model.addAttribute("sCityList", sCityMapper.findByCriteria(sCity));
		return "cCtiyAdd";
	}
	@RequestMapping(value = "/add" ,method=RequestMethod.GET)
	public String add(CrawlerCity cCity,Model model){
		CrawlerCityMapper.insertSelective(cCity);
		SCity sCity = new SCity();
		model.addAttribute("sCityList", sCityMapper.findByCriteria(sCity));
		return "cCtiyAdd";
	}
}
