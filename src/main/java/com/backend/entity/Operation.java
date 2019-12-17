package com.backend.entity;

import java.util.Date;

public class Operation {
    private Integer id;

    private Integer gardenid;

    private Integer weatherid;

    private Integer periodid;

    private Date time;

    private Date date;

    private Date lastmodified;

    private Date created;

    private Date remarks;

    public Operation(Integer id, Integer gardenid, Integer weatherid, Integer periodid, Date time, Date date, Date lastmodified, Date created, Date remarks) {
        this.id = id;
        this.gardenid = gardenid;
        this.weatherid = weatherid;
        this.periodid = periodid;
        this.time = time;
        this.date = date;
        this.lastmodified = lastmodified;
        this.created = created;
        this.remarks = remarks;
    }

    public Operation() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGardenid() {
        return gardenid;
    }

    public void setGardenid(Integer gardenid) {
        this.gardenid = gardenid;
    }

    public Integer getWeatherid() {
        return weatherid;
    }

    public void setWeatherid(Integer weatherid) {
        this.weatherid = weatherid;
    }

    public Integer getPeriodid() {
        return periodid;
    }

    public void setPeriodid(Integer periodid) {
        this.periodid = periodid;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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

    public Date getRemarks() {
        return remarks;
    }

    public void setRemarks(Date remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", gardenid=").append(gardenid);
        sb.append(", weatherid=").append(weatherid);
        sb.append(", periodid=").append(periodid);
        sb.append(", time=").append(time);
        sb.append(", date=").append(date);
        sb.append(", lastmodified=").append(lastmodified);
        sb.append(", created=").append(created);
        sb.append(", remarks=").append(remarks);
        sb.append("]");
        return sb.toString();
    }
}