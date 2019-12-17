package com.backend.dao;

import com.backend.entity.GardenImages;

public interface GardenImagesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GardenImages record);

    int insertSelective(GardenImages record);

    GardenImages selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GardenImages record);

    int updateByPrimaryKey(GardenImages record);
}