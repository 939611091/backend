package com.backend.vo;

import com.backend.entity.Period;
import com.backend.entity.User;
import com.backend.entity.Variety;

import java.util.Date;

public class GardenVo {
    private Integer id;

    private User user;

    private Variety variety;

    private Period period;

    private String name;

    private Float age;

    private String area;

    private String loc;

    private String address;

    private Date lastmodified;

    private Date created;

    public GardenVo(Integer id, User user, Variety variety, Period period, String name, Float age, String area, String loc, String address, Date lastmodified, Date created) {
        this.id = id;
        this.user = user;
        this.variety = variety;
        this.period = period;
        this.name = name;
        this.age = age;
        this.area = area;
        this.loc = loc;
        this.address = address;
        this.lastmodified = lastmodified;
        this.created = created;
    }

    public GardenVo() {
        super();
    }

    @Override
    public String toString() {
        return "GardenVo{" +
                "id=" + id +
                ", user=" + user +
                ", variety=" + variety +
                ", period=" + period +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", area='" + area + '\'' +
                ", loc='" + loc + '\'' +
                ", address='" + address + '\'' +
                ", lastmodified=" + lastmodified +
                ", created=" + created +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Variety getVariety() {
        return variety;
    }

    public void setVariety(Variety variety) {
        this.variety = variety;
    }

    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        this.area = area;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
}