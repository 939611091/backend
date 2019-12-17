package com.backend.entity;

public class UsagesDetail {
    private Integer id;

    private Integer usagesid;

    private Integer reasonid;

    private String name;

    private String dose;

    public UsagesDetail(Integer id, Integer usagesid, Integer reasonid, String name, String dose) {
        this.id = id;
        this.usagesid = usagesid;
        this.reasonid = reasonid;
        this.name = name;
        this.dose = dose;
    }

    public UsagesDetail() {
        super();
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

    public Integer getReasonid() {
        return reasonid;
    }

    public void setReasonid(Integer reasonid) {
        this.reasonid = reasonid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDose() {
        return dose;
    }

    public void setDose(String dose) {
        this.dose = dose == null ? null : dose.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", usagesid=").append(usagesid);
        sb.append(", reasonid=").append(reasonid);
        sb.append(", name=").append(name);
        sb.append(", dose=").append(dose);
        sb.append("]");
        return sb.toString();
    }
}