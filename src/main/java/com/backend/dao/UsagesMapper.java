package com.backend.dao;

import com.backend.entity.Usages;
import com.backend.vo.UsagesVo;

public interface UsagesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Usages record);

    int insertSelective(Usages record);

    Usages selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Usages record);

    int updateByPrimaryKey(Usages record);

    //根据id查vo
    Usages selectById(Integer id);
}