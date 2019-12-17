package com.backend.service;

import com.backend.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserService {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(User record);

    //登录
    User login(String phone, String password);
}
