package com.backend.dao;

import com.backend.entity.UserAuth;

import java.util.List;
import java.util.Map;

public interface UserAuthMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserAuth record);

    int insertSelective(UserAuth record);

    UserAuth selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserAuth record);

    int updateByPrimaryKey(UserAuth record);

    List<UserAuth> selectByMap(Map<String, Object> map);
}