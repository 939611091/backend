package com.backend.service.impl;

import com.backend.dao.UserMapper;
import com.backend.entity.User;
import com.backend.entity.Users;
import com.backend.service.UserService;
import com.backend.service.UsersService;
import com.backend.util.MD5Util;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(User record) {
        return userMapper.insert(record);
    }

    @Override
    public User selectByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return userMapper.updateByPrimaryKey(record);
    }

    @Override
    public User login(String phone, String password) {
        //对输入的密码进行加密然后和数据库比对
        String md5Password = MD5Util.MD5EncodeUtf8(password);
        System.out.println(md5Password);
        User user = userMapper.selectLogin(phone,md5Password);
        if (user != null){
            //把密码设为空，防止别人获取
            user.setPassword(org.apache.commons.lang3.StringUtils.EMPTY);
            return user;
        }else {
            return null;
        }
    }
}
