package com.backend.dao;

import com.backend.entity.Weather;

public interface WeatherMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Weather record);

    int insertSelective(Weather record);

    Weather selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Weather record);

    int updateByPrimaryKey(Weather record);
}