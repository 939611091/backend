package com.backend.vo;

import com.backend.entity.Reason;

public class UsagesDetailVo {
    private Integer id;

    private Integer usagesid;

    private Reason reason;

    private String name;

    private String dose;

    public UsagesDetailVo() {
        super();
    }

    public UsagesDetailVo(Integer id, Integer usagesid, Reason reason, String name, String dose) {
        this.id = id;
        this.usagesid = usagesid;
        this.reason = reason;
        this.name = name;
        this.dose = dose;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUsagesid() {
        return usagesid;
    }

    public void setUsagesid(Integer usagesid) {
        this.usagesid = usagesid;
    }

    public Reason getReason() {
        return reason;
    }

    public void setReason(Reason reason) {
        this.reason = reason;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDose() {
        return dose;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }

    @Override
    public String toString() {
        return "UsagesDetailVo{" +
                "id=" + id +
                ", usagesid=" + usagesid +
                ", reason=" + reason +
                ", name='" + name + '\'' +
                ", dose='" + dose + '\'' +
                '}';
    }
}
