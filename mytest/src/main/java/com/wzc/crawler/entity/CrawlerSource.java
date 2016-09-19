package com.wzc.crawler.entity;

import java.io.Serializable;

public class CrawlerSource implements Serializable {
    private Integer id;

    private String name;

    private Integer pageSleep;

    private Integer roundSleep;

    private String searchUrl;

    private Integer maxConnectErrorNum;

    private Integer maxBodyErrorNum;

    private Integer threadSize;

    private String crawlerCitys;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getPageSleep() {
        return pageSleep;
    }

    public void setPageSleep(Integer pageSleep) {
        this.pageSleep = pageSleep;
    }

    public Integer getRoundSleep() {
        return roundSleep;
    }

    public void setRoundSleep(Integer roundSleep) {
        this.roundSleep = roundSleep;
    }

    public String getSearchUrl() {
        return searchUrl;
    }

    public void setSearchUrl(String searchUrl) {
        this.searchUrl = searchUrl == null ? null : searchUrl.trim();
    }

    public Integer getMaxConnectErrorNum() {
        return maxConnectErrorNum;
    }

    public void setMaxConnectErrorNum(Integer maxConnectErrorNum) {
        this.maxConnectErrorNum = maxConnectErrorNum;
    }

    public Integer getMaxBodyErrorNum() {
        return maxBodyErrorNum;
    }

    public void setMaxBodyErrorNum(Integer maxBodyErrorNum) {
        this.maxBodyErrorNum = maxBodyErrorNum;
    }

    public Integer getThreadSize() {
        return threadSize;
    }

    public void setThreadSize(Integer threadSize) {
        this.threadSize = threadSize;
    }

    public String getCrawlerCitys() {
        return crawlerCitys;
    }

    public void setCrawlerCitys(String crawlerCitys) {
        this.crawlerCitys = crawlerCitys == null ? null : crawlerCitys.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        CrawlerSource other = (CrawlerSource) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getPageSleep() == null ? other.getPageSleep() == null : this.getPageSleep().equals(other.getPageSleep()))
            && (this.getRoundSleep() == null ? other.getRoundSleep() == null : this.getRoundSleep().equals(other.getRoundSleep()))
            && (this.getSearchUrl() == null ? other.getSearchUrl() == null : this.getSearchUrl().equals(other.getSearchUrl()))
            && (this.getMaxConnectErrorNum() == null ? other.getMaxConnectErrorNum() == null : this.getMaxConnectErrorNum().equals(other.getMaxConnectErrorNum()))
            && (this.getMaxBodyErrorNum() == null ? other.getMaxBodyErrorNum() == null : this.getMaxBodyErrorNum().equals(other.getMaxBodyErrorNum()))
            && (this.getThreadSize() == null ? other.getThreadSize() == null : this.getThreadSize().equals(other.getThreadSize()))
            && (this.getCrawlerCitys() == null ? other.getCrawlerCitys() == null : this.getCrawlerCitys().equals(other.getCrawlerCitys()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPageSleep() == null) ? 0 : getPageSleep().hashCode());
        result = prime * result + ((getRoundSleep() == null) ? 0 : getRoundSleep().hashCode());
        result = prime * result + ((getSearchUrl() == null) ? 0 : getSearchUrl().hashCode());
        result = prime * result + ((getMaxConnectErrorNum() == null) ? 0 : getMaxConnectErrorNum().hashCode());
        result = prime * result + ((getMaxBodyErrorNum() == null) ? 0 : getMaxBodyErrorNum().hashCode());
        result = prime * result + ((getThreadSize() == null) ? 0 : getThreadSize().hashCode());
        result = prime * result + ((getCrawlerCitys() == null) ? 0 : getCrawlerCitys().hashCode());
        return result;
    }
}