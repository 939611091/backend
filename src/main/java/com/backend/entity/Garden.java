package com.backend.entity;

import java.util.Date;

public class Garden {
    private Integer id;

    private Integer userid;

    private Integer varietyid;

    private Integer periodid;

    private String name;

    private Float age;

    private String area;

    private String loc;

    private String address;

    private Date lastmodified;

    private Date created;

    public Garden(Integer id, Integer userid, Integer varietyid, Integer periodid, String name, Float age, String area, String loc, String address, Date lastmodified, Date created) {
        this.id = id;
        this.userid = userid;
        this.varietyid = varietyid;
        this.periodid = periodid;
        this.name = name;
        this.age = age;
        this.area = area;
        this.loc = loc;
        this.address = address;
        this.lastmodified = lastmodified;
        this.created = created;
    }

    public Garden() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getVarietyid() {
        return varietyid;
    }

    public void setVarietyid(Integer varietyid) {
        this.varietyid = varietyid;
    }

    public Integer getPeriodid() {
        return periodid;
    }

    public void setPeriodid(Integer periodid) {
        this.periodid = periodid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Float getAge() {
        return age;
    }

    public void setAge(Float age) {
        this.age = age;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc == null ? null : loc.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Date getLastmodified() {
        return lastmodified;
    }

    public void setLastmodified(Date lastmodified) {
        this.lastmodified = lastmodified;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userid=").append(userid);
        sb.append(", varietyid=").append(varietyid);
        sb.append(", periodid=").append(periodid);
        sb.append(", name=").append(name);
        sb.append(", age=").append(age);
        sb.append(", area=").append(area);
        sb.append(", loc=").append(loc);
        sb.append(", address=").append(address);
        sb.append(", lastmodified=").append(lastmodified);
        sb.append(", created=").append(created);
        sb.append("]");
        return sb.toString();
    }
}