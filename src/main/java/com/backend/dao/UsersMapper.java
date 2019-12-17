package com.backend.dao;

import com.backend.entity.Users;
import com.github.pagehelper.PageInfo;

import java.util.List;
import java.util.Map;

public interface UsersMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);

    List<Users> selectByMap(Map<String, Object> map);
}