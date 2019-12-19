package com.backend.service.impl;

import com.backend.dao.ReasonMapper;
import com.backend.entity.Reason;
import com.backend.service.ReasonService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ReasonServiceImpl implements ReasonService {
    @Autowired
    private ReasonMapper reasonMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return reasonMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Reason record) {
        return reasonMapper.insert(record);
    }

    @Override
    public Reason selectByPrimaryKey(Integer id) {
        return reasonMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKey(Reason record) {
        return reasonMapper.updateByPrimaryKey(record);
    }

    @Override
    public PageInfo<Reason> selectByMap(Map<String, Object> map, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Reason> reasonList = reasonMapper.selectByMap(map);
        PageInfo pageResult = new PageInfo(reasonList);
        pageResult.setList(reasonList);
        return pageResult;
    }

    @Override
    public List<Reason> selectAllParent() {
        return reasonMapper.selectAllParent();
    }
}
