package com.backend.dao;

import com.backend.entity.Admin;
import org.apache.ibatis.annotations.Param;

public interface AdminMapper {
    int deleteByPrimaryKey(Integer adminid);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(Integer adminid);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
    //登录
    Admin selectLogin(@Param("username") String username, @Param("password") String password);
    //根据id查密码
    String selectPasswordById(Integer adminId);
}