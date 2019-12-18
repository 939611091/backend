package com.backend.service;

import com.backend.entity.FarmingOperating;
import com.github.pagehelper.PageInfo;

import java.util.Map;

public interface FarmingOperatingService {
    int deleteByPrimaryKey(Integer id);

    int insert(FarmingOperating record);

    FarmingOperating selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(FarmingOperating record);

    PageInfo<FarmingOperating> selectByMap(Map<String, Object> map, int pageNum, int pageSize);
}
