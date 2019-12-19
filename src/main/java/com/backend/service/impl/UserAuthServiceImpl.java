package com.backend.service.impl;

import com.backend.dao.UserAuthMapper;
import com.backend.entity.UserAuth;
import com.backend.service.UserAuthService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class UserAuthServiceImpl implements UserAuthService {
    @Autowired
    private UserAuthMapper userAuthMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return userAuthMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UserAuth record) {
        return userAuthMapper.insert(record);
    }

    @Override
    public UserAuth selectByPrimaryKey(Integer id) {
        return userAuthMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKey(UserAuth record) {
        return userAuthMapper.updateByPrimaryKey(record);
    }

    @Override
    public PageInfo<UserAuth> selectByMap(Map<String, Object> map, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<UserAuth> userAuthList = userAuthMapper.selectByMap(map);
        PageInfo pageResult = new PageInfo(userAuthList);
        pageResult.setList(userAuthList);
        return pageResult;
    }
}
