package com.backend.service;

import com.backend.entity.UserAuth;
import com.github.pagehelper.PageInfo;

import java.util.Map;

public interface UserAuthService {
    int deleteByPrimaryKey(Integer id);

    int insert(UserAuth record);

    UserAuth selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(UserAuth record);

    PageInfo<UserAuth> selectByMap(Map<String, Object> map, int pageNum, int pageSize);
}
