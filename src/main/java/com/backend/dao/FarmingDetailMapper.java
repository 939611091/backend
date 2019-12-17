package com.backend.dao;

import com.backend.entity.FarmingDetail;

public interface FarmingDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FarmingDetail record);

    int insertSelective(FarmingDetail record);

    FarmingDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FarmingDetail record);

    int updateByPrimaryKey(FarmingDetail record);
}