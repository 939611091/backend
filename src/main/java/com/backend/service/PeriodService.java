package com.backend.service;

import com.backend.entity.Period;
import com.github.pagehelper.PageInfo;

import java.util.Map;

public interface PeriodService {
    int deleteByPrimaryKey(Integer id);

    int insert(Period record);

    Period selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(Period record);

    PageInfo<Period> selectByMap(Map<String, Object> map, int pageNum, int pageSize);
}
