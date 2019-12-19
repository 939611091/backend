package com.backend.service;

import com.backend.entity.User;
import com.github.pagehelper.PageInfo;

import java.util.Map;

public interface UserService {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(User record);

    PageInfo<User> selectByMap(Map<String, Object> map, int pageNum, int pageSize);
}
