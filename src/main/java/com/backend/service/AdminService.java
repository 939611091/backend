package com.backend.service;

import com.backend.entity.Admin;

public interface AdminService {
    int deleteByPrimaryKey(Integer id);

    int insert(Admin record);

    Admin selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(Admin record);

    //登录
    Admin login(String username, String password);
    String selectPasswordById(Integer adminId);
}
