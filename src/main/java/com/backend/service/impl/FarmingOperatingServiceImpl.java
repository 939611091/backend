package com.backend.service.impl;

import com.backend.dao.FarmingOperatingMapper;
import com.backend.entity.FarmingOperating;
import com.backend.service.FarmingOperatingService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class FarmingOperatingServiceImpl implements FarmingOperatingService {
    @Autowired
    private FarmingOperatingMapper farmingOperatingMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return farmingOperatingMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(FarmingOperating record) {
        return farmingOperatingMapper.insert(record);
    }

    @Override
    public FarmingOperating selectByPrimaryKey(Integer id) {
        return farmingOperatingMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKey(FarmingOperating record) {
        return farmingOperatingMapper.updateByPrimaryKey(record);
    }

    @Override
    public PageInfo<FarmingOperating> selectByMap(Map<String, Object> map, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<FarmingOperating> farmingOperatingList = farmingOperatingMapper.selectByMap(map);
        PageInfo pageResult = new PageInfo(farmingOperatingList);
        pageResult.setList(farmingOperatingList);
        return pageResult;
    }
}
