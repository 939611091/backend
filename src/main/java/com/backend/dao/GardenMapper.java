package com.backend.dao;

import com.backend.entity.Garden;

public interface GardenMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Garden record);

    int insertSelective(Garden record);

    Garden selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Garden record);

    int updateByPrimaryKey(Garden record);
}