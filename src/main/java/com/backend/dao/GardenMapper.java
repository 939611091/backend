package com.backend.dao;

import com.backend.entity.Garden;

import java.util.List;
import java.util.Map;

public interface GardenMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Garden record);

    int insertSelective(Garden record);

    Garden selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Garden record);

    int updateByPrimaryKey(Garden record);

    List<Garden> selectByMap(Map<String, Object> map);

    Garden selectById(Integer id);
}