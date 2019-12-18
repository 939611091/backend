package com.backend.dao;

import com.backend.entity.FarmingOperating;

import java.util.List;
import java.util.Map;

public interface FarmingOperatingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FarmingOperating record);

    int insertSelective(FarmingOperating record);

    FarmingOperating selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FarmingOperating record);

    int updateByPrimaryKey(FarmingOperating record);

    List<FarmingOperating> selectByMap(Map<String, Object> map);
}