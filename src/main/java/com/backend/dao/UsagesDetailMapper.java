package com.backend.dao;

import com.backend.entity.UsagesDetail;

import java.util.List;
import java.util.Map;

public interface UsagesDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UsagesDetail record);

    int insertSelective(UsagesDetail record);

    UsagesDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UsagesDetail record);

    int updateByPrimaryKey(UsagesDetail record);

    List<UsagesDetail> selectByMap(Map<String, Object> map);
}