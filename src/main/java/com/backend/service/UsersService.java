package com.backend.service;

import com.backend.entity.Users;
import com.github.pagehelper.PageInfo;

import java.util.Map;

public interface UsersService {
    int deleteByPrimaryKey(Integer id);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);

    PageInfo<Users> selectByMap(Map<String, Object> map, int pageNum, int pageSize);
}
