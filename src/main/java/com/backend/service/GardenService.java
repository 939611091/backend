package com.backend.service;

import com.backend.entity.Garden;
import com.backend.vo.GardenVo;
import com.github.pagehelper.PageInfo;

import java.util.Map;

public interface GardenService {
    int deleteByPrimaryKey(Integer id);

    int insert(Garden record);

    Garden selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(Garden record);

    PageInfo<GardenVo> selectByMap(Map<String, Object> map, int pageNum, int pageSize);

    //根据id查vo
    GardenVo selectById(Integer id);
}
