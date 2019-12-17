package com.backend.service;

import com.backend.entity.Variety;
import com.github.pagehelper.PageInfo;

import java.util.Map;

public interface VarietyService {
    int deleteByPrimaryKey(Integer id);

    int insert(Variety record);

    int insertSelective(Variety record);

    Variety selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Variety record);

    int updateByPrimaryKey(Variety record);

    PageInfo<Variety> selectByMap(Map<String, Object> map, int pageNum, int pageSize);
}
