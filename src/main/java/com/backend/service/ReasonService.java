package com.backend.service;

import com.backend.entity.Reason;
import com.github.pagehelper.PageInfo;

import java.util.Map;

public interface ReasonService {
    int deleteByPrimaryKey(Integer id);

    int insert(Reason record);

    Reason selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(Reason record);

    PageInfo<Reason> selectByMap(Map<String, Object> map, int pageNum, int pageSize);
}
