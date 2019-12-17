package com.backend.dao;

import com.backend.entity.FarmingImages;

public interface FarmingImagesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FarmingImages record);

    int insertSelective(FarmingImages record);

    FarmingImages selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FarmingImages record);

    int updateByPrimaryKey(FarmingImages record);
}