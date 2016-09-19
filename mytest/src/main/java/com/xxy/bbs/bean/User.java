package com.xxy.bbs.bean;

import java.io.Serializable;

public class User implements Serializable {
    private Integer id;

    private String name;

    private String nikename;

    private String sex;

    private String bangpai;

    private Integer touid;

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

    public String getNikename() {
        return nikename;
    }

    public void setNikename(String nikename) {
        this.nikename = nikename == null ? null : nikename.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getBangpai() {
        return bangpai;
    }

    public void setBangpai(String bangpai) {
        this.bangpai = bangpai == null ? null : bangpai.trim();
    }

    public Integer getTouid() {
        return touid;
    }

    public void setTouid(Integer touid) {
        this.touid = touid;
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
        User other = (User) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getNikename() == null ? other.getNikename() == null : this.getNikename().equals(other.getNikename()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getBangpai() == null ? other.getBangpai() == null : this.getBangpai().equals(other.getBangpai()))
            && (this.getTouid() == null ? other.getTouid() == null : this.getTouid().equals(other.getTouid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getNikename() == null) ? 0 : getNikename().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getBangpai() == null) ? 0 : getBangpai().hashCode());
        result = prime * result + ((getTouid() == null) ? 0 : getTouid().hashCode());
        return result;
    }
}