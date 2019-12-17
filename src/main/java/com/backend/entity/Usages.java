package com.backend.entity;

public class Usages {
    private Integer id;

    private Integer operationid;

    public Usages(Integer id, Integer operationid) {
        this.id = id;
        this.operationid = operationid;
    }

    public Usages() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOperationid() {
        return operationid;
    }

    public void setOperationid(Integer operationid) {
        this.operationid = operationid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", operationid=").append(operationid);
        sb.append("]");
        return sb.toString();
    }
}