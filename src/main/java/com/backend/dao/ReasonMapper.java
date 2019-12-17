package com.backend.dao;

import com.backend.entity.Reason;

public interface ReasonMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Reason record);

    int insertSelective(Reason record);

    Reason selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Reason record);

    int updateByPrimaryKey(Reason record);
}