package com.backend.vo;

import com.backend.entity.Garden;
import com.backend.entity.Period;
import com.backend.entity.Weather;

import java.util.Date;

public class OperationVo {
    private Integer id;

    private Garden garden;

    private Weather weather;

    private Period period;

    private Date time;

    private Date date;

    private Date lastmodified;

    private Date created;

    private Date remarks;

    public OperationVo() {
        super();
    }

    public OperationVo(Integer id, Garden garden, Weather weather, Period period, Date time, Date date, Date lastmodified, Date created, Date remarks) {
        this.id = id;
        this.garden = garden;
        this.weather = weather;
        this.period = period;
        this.time = time;
        this.date = date;
        this.lastmodified = lastmodified;
        this.created = created;
        this.remarks = remarks;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Garden getGarden() {
        return garden;
    }

    public void setGarden(Garden garden) {
        this.garden = garden;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period period) {
        this.period = period;
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
        return "OperationVo{" +
                "id=" + id +
                ", garden=" + garden +
                ", weather=" + weather +
                ", period=" + period +
                ", time=" + time +
                ", date=" + date +
                ", lastmodified=" + lastmodified +
                ", created=" + created +
                ", remarks=" + remarks +
                '}';
    }
}
