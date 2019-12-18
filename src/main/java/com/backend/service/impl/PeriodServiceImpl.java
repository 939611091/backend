package com.backend.service.impl;

import com.backend.dao.PeriodMapper;
import com.backend.entity.Period;
import com.backend.service.PeriodService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class PeriodServiceImpl implements PeriodService {
    @Autowired
    private PeriodMapper periodMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return periodMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Period record) {
        return periodMapper.insert(record);
    }

    @Override
    public Period selectByPrimaryKey(Integer id) {
        return periodMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKey(Period record) {
        return periodMapper.updateByPrimaryKey(record);
    }

    @Override
    public PageInfo<Period> selectByMap(Map<String, Object> map, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Period> periodList = periodMapper.selectByMap(map);
        PageInfo pageResult = new PageInfo(periodList);
        pageResult.setList(periodList);
        return pageResult;
    }
}
