package com.backend.service.impl;

import com.backend.dao.VarietyMapper;
import com.backend.entity.Variety;
import com.backend.service.VarietyService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class VarietyServiceImpl implements VarietyService {
    @Autowired
    private VarietyMapper varietyMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return varietyMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Variety record) {
        return varietyMapper.insert(record);
    }

    @Override
    public int insertSelective(Variety record) {
        return varietyMapper.insertSelective(record);
    }

    @Override
    public Variety selectByPrimaryKey(Integer id) {
        return varietyMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Variety record) {
        return varietyMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Variety record) {
        return varietyMapper.updateByPrimaryKey(record);
    }

    @Override
    public PageInfo<Variety> selectByMap(Map<String, Object> map, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Variety> varietyList = varietyMapper.selectByMap(map);
        PageInfo pageResult = new PageInfo(varietyList);
        pageResult.setList(varietyList);
        return pageResult;
    }
}
