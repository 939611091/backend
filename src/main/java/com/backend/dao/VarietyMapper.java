package com.backend.dao;

import com.backend.entity.Variety;

import java.util.List;
import java.util.Map;

public interface VarietyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Variety record);

    int insertSelective(Variety record);

    Variety selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Variety record);

    int updateByPrimaryKey(Variety record);

    List<Variety> selectByMap(Map<String, Object> map);
}