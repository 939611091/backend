package com.backend.vo;

import com.backend.entity.Operation;

public class UsagesVo {
    private Integer id;

    private Operation operation;

    public UsagesVo() {
        super();
    }

    public UsagesVo(Integer id, Operation operation) {
        this.id = id;
        this.operation = operation;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    @Override
    public String toString() {
        return "UsagesVo{" +
                "id=" + id +
                ", operation=" + operation +
                '}';
    }
}
