package com.wzc.crawler.entity;

import java.io.Serializable;
import java.util.Date;

public class ShenZhouCarType implements Serializable {
    private String id;

    private String name;

    private String chexi;

    private String year;

    private String peizhi;

    private String zuowei;

    private String chemen;

    private String ranyoutype;

    private String biansu;

    private String pailiang;

    private String ranyouhao;

    private String qudong;

    private String fadongji;

    private String tianchuang;

    private String youxiang;

    private String yinxiang;

    private String zuoyi;

    private String daozheleida;

    private String qinang;

    private String dvd;

    private String gps;

    private Date indate;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getChexi() {
        return chexi;
    }

    public void setChexi(String chexi) {
        this.chexi = chexi == null ? null : chexi.trim();
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    public String getPeizhi() {
        return peizhi;
    }

    public void setPeizhi(String peizhi) {
        this.peizhi = peizhi == null ? null : peizhi.trim();
    }

    public String getZuowei() {
        return zuowei;
    }

    public void setZuowei(String zuowei) {
        this.zuowei = zuowei == null ? null : zuowei.trim();
    }

    public String getChemen() {
        return chemen;
    }

    public void setChemen(String chemen) {
        this.chemen = chemen == null ? null : chemen.trim();
    }

    public String getRanyoutype() {
        return ranyoutype;
    }

    public void setRanyoutype(String ranyoutype) {
        this.ranyoutype = ranyoutype == null ? null : ranyoutype.trim();
    }

    public String getBiansu() {
        return biansu;
    }

    public void setBiansu(String biansu) {
        this.biansu = biansu == null ? null : biansu.trim();
    }

    public String getPailiang() {
        return pailiang;
    }

    public void setPailiang(String pailiang) {
        this.pailiang = pailiang == null ? null : pailiang.trim();
    }

    public String getRanyouhao() {
        return ranyouhao;
    }

    public void setRanyouhao(String ranyouhao) {
        this.ranyouhao = ranyouhao == null ? null : ranyouhao.trim();
    }

    public String getQudong() {
        return qudong;
    }

    public void setQudong(String qudong) {
        this.qudong = qudong == null ? null : qudong.trim();
    }

    public String getFadongji() {
        return fadongji;
    }

    public void setFadongji(String fadongji) {
        this.fadongji = fadongji == null ? null : fadongji.trim();
    }

    public String getTianchuang() {
        return tianchuang;
    }

    public void setTianchuang(String tianchuang) {
        this.tianchuang = tianchuang == null ? null : tianchuang.trim();
    }

    public String getYouxiang() {
        return youxiang;
    }

    public void setYouxiang(String youxiang) {
        this.youxiang = youxiang == null ? null : youxiang.trim();
    }

    public String getYinxiang() {
        return yinxiang;
    }

    public void setYinxiang(String yinxiang) {
        this.yinxiang = yinxiang == null ? null : yinxiang.trim();
    }

    public String getZuoyi() {
        return zuoyi;
    }

    public void setZuoyi(String zuoyi) {
        this.zuoyi = zuoyi == null ? null : zuoyi.trim();
    }

    public String getDaozheleida() {
        return daozheleida;
    }

    public void setDaozheleida(String daozheleida) {
        this.daozheleida = daozheleida == null ? null : daozheleida.trim();
    }

    public String getQinang() {
        return qinang;
    }

    public void setQinang(String qinang) {
        this.qinang = qinang == null ? null : qinang.trim();
    }

    public String getDvd() {
        return dvd;
    }

    public void setDvd(String dvd) {
        this.dvd = dvd == null ? null : dvd.trim();
    }

    public String getGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps == null ? null : gps.trim();
    }

    public Date getIndate() {
        return indate;
    }

    public void setIndate(Date indate) {
        this.indate = indate;
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
        ShenZhouCarType other = (ShenZhouCarType) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getChexi() == null ? other.getChexi() == null : this.getChexi().equals(other.getChexi()))
            && (this.getYear() == null ? other.getYear() == null : this.getYear().equals(other.getYear()))
            && (this.getPeizhi() == null ? other.getPeizhi() == null : this.getPeizhi().equals(other.getPeizhi()))
            && (this.getZuowei() == null ? other.getZuowei() == null : this.getZuowei().equals(other.getZuowei()))
            && (this.getChemen() == null ? other.getChemen() == null : this.getChemen().equals(other.getChemen()))
            && (this.getRanyoutype() == null ? other.getRanyoutype() == null : this.getRanyoutype().equals(other.getRanyoutype()))
            && (this.getBiansu() == null ? other.getBiansu() == null : this.getBiansu().equals(other.getBiansu()))
            && (this.getPailiang() == null ? other.getPailiang() == null : this.getPailiang().equals(other.getPailiang()))
            && (this.getRanyouhao() == null ? other.getRanyouhao() == null : this.getRanyouhao().equals(other.getRanyouhao()))
            && (this.getQudong() == null ? other.getQudong() == null : this.getQudong().equals(other.getQudong()))
            && (this.getFadongji() == null ? other.getFadongji() == null : this.getFadongji().equals(other.getFadongji()))
            && (this.getTianchuang() == null ? other.getTianchuang() == null : this.getTianchuang().equals(other.getTianchuang()))
            && (this.getYouxiang() == null ? other.getYouxiang() == null : this.getYouxiang().equals(other.getYouxiang()))
            && (this.getYinxiang() == null ? other.getYinxiang() == null : this.getYinxiang().equals(other.getYinxiang()))
            && (this.getZuoyi() == null ? other.getZuoyi() == null : this.getZuoyi().equals(other.getZuoyi()))
            && (this.getDaozheleida() == null ? other.getDaozheleida() == null : this.getDaozheleida().equals(other.getDaozheleida()))
            && (this.getQinang() == null ? other.getQinang() == null : this.getQinang().equals(other.getQinang()))
            && (this.getDvd() == null ? other.getDvd() == null : this.getDvd().equals(other.getDvd()))
            && (this.getGps() == null ? other.getGps() == null : this.getGps().equals(other.getGps()))
            && (this.getIndate() == null ? other.getIndate() == null : this.getIndate().equals(other.getIndate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getChexi() == null) ? 0 : getChexi().hashCode());
        result = prime * result + ((getYear() == null) ? 0 : getYear().hashCode());
        result = prime * result + ((getPeizhi() == null) ? 0 : getPeizhi().hashCode());
        result = prime * result + ((getZuowei() == null) ? 0 : getZuowei().hashCode());
        result = prime * result + ((getChemen() == null) ? 0 : getChemen().hashCode());
        result = prime * result + ((getRanyoutype() == null) ? 0 : getRanyoutype().hashCode());
        result = prime * result + ((getBiansu() == null) ? 0 : getBiansu().hashCode());
        result = prime * result + ((getPailiang() == null) ? 0 : getPailiang().hashCode());
        result = prime * result + ((getRanyouhao() == null) ? 0 : getRanyouhao().hashCode());
        result = prime * result + ((getQudong() == null) ? 0 : getQudong().hashCode());
        result = prime * result + ((getFadongji() == null) ? 0 : getFadongji().hashCode());
        result = prime * result + ((getTianchuang() == null) ? 0 : getTianchuang().hashCode());
        result = prime * result + ((getYouxiang() == null) ? 0 : getYouxiang().hashCode());
        result = prime * result + ((getYinxiang() == null) ? 0 : getYinxiang().hashCode());
        result = prime * result + ((getZuoyi() == null) ? 0 : getZuoyi().hashCode());
        result = prime * result + ((getDaozheleida() == null) ? 0 : getDaozheleida().hashCode());
        result = prime * result + ((getQinang() == null) ? 0 : getQinang().hashCode());
        result = prime * result + ((getDvd() == null) ? 0 : getDvd().hashCode());
        result = prime * result + ((getGps() == null) ? 0 : getGps().hashCode());
        result = prime * result + ((getIndate() == null) ? 0 : getIndate().hashCode());
        return result;
    }
}