package com.backend.entity;

public class FarmingDetail {
    private Integer id;

    private Integer farmingid;

    private Integer farmingoperatingid;

    public FarmingDetail(Integer id, Integer farmingid, Integer farmingoperatingid) {
        this.id = id;
        this.farmingid = farmingid;
        this.farmingoperatingid = farmingoperatingid;
    }

    public FarmingDetail() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFarmingid() {
        return farmingid;
    }

    public void setFarmingid(Integer farmingid) {
        this.farmingid = farmingid;
    }

    public Integer getFarmingoperatingid() {
        return farmingoperatingid;
    }

    public void setFarmingoperatingid(Integer farmingoperatingid) {
        this.farmingoperatingid = farmingoperatingid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", farmingid=").append(farmingid);
        sb.append(", farmingoperatingid=").append(farmingoperatingid);
        sb.append("]");
        return sb.toString();
    }
}