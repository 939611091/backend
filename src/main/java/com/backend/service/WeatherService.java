package com.backend.service;

import com.backend.entity.Weather;
import com.github.pagehelper.PageInfo;

import java.util.Map;

public interface WeatherService {
    int deleteByPrimaryKey(Integer id);

    int insert(Weather record);

    Weather selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(Weather record);

    PageInfo<Weather> selectByMap(Map<String, Object> map, int pageNum, int pageSize);
}
