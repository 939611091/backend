package com.backend.service.impl;

import com.backend.dao.GardenMapper;
import com.backend.dao.PeriodMapper;
import com.backend.dao.UserMapper;
import com.backend.dao.VarietyMapper;
import com.backend.entity.Garden;
import com.backend.entity.Period;
import com.backend.entity.User;
import com.backend.entity.Variety;
import com.backend.service.GardenService;
import com.backend.vo.GardenVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
@Service
public class GardenServiceImpl implements GardenService {
    @Autowired
    private GardenMapper gardenMapper;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private VarietyMapper varietyMapper;
    @Autowired
    private PeriodMapper periodMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return gardenMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Garden record) {
        return gardenMapper.insert(record);
    }

    @Override
    public Garden selectByPrimaryKey(Integer id) {
        return gardenMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKey(Garden record) {
        return gardenMapper.updateByPrimaryKey(record);
    }

    @Override
    public PageInfo<GardenVo> selectByMap(Map<String, Object> map, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        //查出所有课程
        List<Garden> gardenList = gardenMapper.selectByMap(map);
        //定义课程VO列表
        List<GardenVo> gardenVoList = new LinkedList<>();
        //把课程逐个转成课程VO
        for (Garden garden : gardenList) {
            gardenVoList.add(assembleGardenVo(garden));
        }
        //定义返回pageInfo结果集把课程列表传进去
        PageInfo pageResult = new PageInfo(gardenList);
        //把vo传到结果集
        pageResult.setList(gardenVoList);
        return pageResult;
    }

    /**
     * Course转换成CourseVo
     * 用 BeanUtils.copyProperties(原对象, 目标对象) 把 Course 中的基本信息复制到 CourseVo 中
     * 通过 Course 中的 id 获取 对应ID的信息
     * @param course
     * @return courseVo
     */
    private GardenVo assembleGardenVo(Garden garden) {
        GardenVo gardenVo = new GardenVo();
        BeanUtils.copyProperties(garden, gardenVo);
        //把ID查出的实体传给Vo
        User user = userMapper.selectByPrimaryKey(garden.getUserid());
        gardenVo.setUser(user);

        Variety variety = varietyMapper.selectByPrimaryKey(garden.getVarietyid());
        gardenVo.setVariety(variety);

        Period period = periodMapper.selectByPrimaryKey(garden.getPeriodid());
        gardenVo.setPeriod(period);
        return gardenVo;
    }
}
