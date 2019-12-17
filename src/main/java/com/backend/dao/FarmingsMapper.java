package com.backend.dao;

import com.backend.entity.Farmings;

public interface FarmingsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Farmings record);

    int insertSelective(Farmings record);

    Farmings selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Farmings record);

    int updateByPrimaryKey(Farmings record);
}