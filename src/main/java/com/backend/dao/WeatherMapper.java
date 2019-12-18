package com.backend.dao;

import com.backend.entity.Weather;

import java.util.List;
import java.util.Map;

public interface WeatherMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Weather record);

    int insertSelective(Weather record);

    Weather selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Weather record);

    int updateByPrimaryKey(Weather record);
    
    List<Weather> selectByMap(Map<String, Object> map);
}