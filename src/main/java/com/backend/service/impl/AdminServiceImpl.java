package com.backend.service.impl;

import com.backend.dao.AdminMapper;
import com.backend.entity.Admin;
import com.backend.service.AdminService;
import com.backend.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return adminMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Admin record) {
        return adminMapper.insert(record);
    }

    @Override
    public Admin selectByPrimaryKey(Integer id) {
        return adminMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKey(Admin record) {
        //对密码进行加密
        record.setPassword(MD5Util.MD5EncodeUtf8(record.getPassword()));
        return adminMapper.updateByPrimaryKey(record);
    }

    @Override
    public Admin login(String username, String password) {
        //对输入的密码进行加密然后和数据库比对
        String md5Password = MD5Util.MD5EncodeUtf8(password);

        Admin admin = adminMapper.selectLogin(username,md5Password);
        if (admin != null){
            //把密码设为空，防止别人获取
            admin.setPassword(org.apache.commons.lang3.StringUtils.EMPTY);
            return admin;
        }else {
            return null;
        }
    }

    @Override
    public String selectPasswordById(Integer adminId) {
        return adminMapper.selectPasswordById(adminId);
    }
}
