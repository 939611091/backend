package com.backend.dao;

import com.backend.entity.Period;

public interface PeriodMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Period record);

    int insertSelective(Period record);

    Period selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Period record);

    int updateByPrimaryKey(Period record);
}