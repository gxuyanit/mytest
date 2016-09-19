package com.wzc.crawler.entity;

import java.io.Serializable;

public class SDistrict implements Serializable {
    private Integer districtid;

    private String districtname;

    private Integer cityid;

    private static final long serialVersionUID = 1L;

    public Integer getDistrictid() {
        return districtid;
    }

    public void setDistrictid(Integer districtid) {
        this.districtid = districtid;
    }

    public String getDistrictname() {
        return districtname;
    }

    public void setDistrictname(String districtname) {
        this.districtname = districtname == null ? null : districtname.trim();
    }

    public Integer getCityid() {
        return cityid;
    }

    public void setCityid(Integer cityid) {
        this.cityid = cityid;
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
        SDistrict other = (SDistrict) that;
        return (this.getDistrictid() == null ? other.getDistrictid() == null : this.getDistrictid().equals(other.getDistrictid()))
            && (this.getDistrictname() == null ? other.getDistrictname() == null : this.getDistrictname().equals(other.getDistrictname()))
            && (this.getCityid() == null ? other.getCityid() == null : this.getCityid().equals(other.getCityid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDistrictid() == null) ? 0 : getDistrictid().hashCode());
        result = prime * result + ((getDistrictname() == null) ? 0 : getDistrictname().hashCode());
        result = prime * result + ((getCityid() == null) ? 0 : getCityid().hashCode());
        return result;
    }
}