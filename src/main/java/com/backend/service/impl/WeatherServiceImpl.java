package com.backend.service.impl;

import com.backend.dao.WeatherMapper;
import com.backend.entity.Weather;
import com.backend.service.WeatherService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class WeatherServiceImpl implements WeatherService {
    @Autowired
    private WeatherMapper weatherMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return weatherMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Weather record) {
        return weatherMapper.insert(record);
    }

    @Override
    public Weather selectByPrimaryKey(Integer id) {
        return weatherMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKey(Weather record) {
        return weatherMapper.updateByPrimaryKey(record);
    }

    @Override
    public PageInfo<Weather> selectByMap(Map<String, Object> map, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Weather> weatherList = weatherMapper.selectByMap(map);
        PageInfo pageResult = new PageInfo(weatherList);
        pageResult.setList(weatherList);
        return pageResult;
    }
}
