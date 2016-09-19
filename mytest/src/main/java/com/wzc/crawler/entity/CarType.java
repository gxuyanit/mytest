package com.wzc.crawler.entity;

import java.io.Serializable;

public class CarType implements Serializable {
    private String id;

    private String comanyId;

    private String name;

    private String groupName;

    private String transmissionType;

    private String displacement;

    private String manned;

    private String imagePath;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getComanyId() {
        return comanyId;
    }

    public void setComanyId(String comanyId) {
        this.comanyId = comanyId == null ? null : comanyId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType == null ? null : transmissionType.trim();
    }

    public String getDisplacement() {
        return displacement;
    }

    public void setDisplacement(String displacement) {
        this.displacement = displacement == null ? null : displacement.trim();
    }

    public String getManned() {
        return manned;
    }

    public void setManned(String manned) {
        this.manned = manned == null ? null : manned.trim();
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath == null ? null : imagePath.trim();
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
        CarType other = (CarType) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getComanyId() == null ? other.getComanyId() == null : this.getComanyId().equals(other.getComanyId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getGroupName() == null ? other.getGroupName() == null : this.getGroupName().equals(other.getGroupName()))
            && (this.getTransmissionType() == null ? other.getTransmissionType() == null : this.getTransmissionType().equals(other.getTransmissionType()))
            && (this.getDisplacement() == null ? other.getDisplacement() == null : this.getDisplacement().equals(other.getDisplacement()))
            && (this.getManned() == null ? other.getManned() == null : this.getManned().equals(other.getManned()))
            && (this.getImagePath() == null ? other.getImagePath() == null : this.getImagePath().equals(other.getImagePath()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getComanyId() == null) ? 0 : getComanyId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        result = prime * result + ((getTransmissionType() == null) ? 0 : getTransmissionType().hashCode());
        result = prime * result + ((getDisplacement() == null) ? 0 : getDisplacement().hashCode());
        result = prime * result + ((getManned() == null) ? 0 : getManned().hashCode());
        result = prime * result + ((getImagePath() == null) ? 0 : getImagePath().hashCode());
        return result;
    }
}