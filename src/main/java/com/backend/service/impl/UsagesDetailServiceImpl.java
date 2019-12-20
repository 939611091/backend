package com.backend.service.impl;

import com.backend.dao.*;
import com.backend.entity.*;
import com.backend.service.UsagesDetailService;
import com.backend.vo.OperationVo;
import com.backend.vo.UsagesDetailVo;
import com.backend.vo.UsagesVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
@Service
public class UsagesDetailServiceImpl implements UsagesDetailService {
    @Autowired
    private UsagesDetailMapper usagesDetailMapper;
    @Autowired
    private UsagesMapper usagesMapper;
    @Autowired
    private OperationMapper operationMapper;
    @Autowired
    private GardenMapper gardenMapper;
    @Autowired
    private WeatherMapper weatherMapper;
    @Autowired
    private PeriodMapper periodMapper;
    @Autowired
    private ReasonMapper reasonMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return usagesDetailMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UsagesDetail record) {
        return usagesDetailMapper.insert(record);
    }

    @Override
    public UsagesDetail selectByPrimaryKey(Integer id) {
        return usagesDetailMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKey(UsagesDetail record) {
        return usagesDetailMapper.updateByPrimaryKey(record);
    }

    @Override
    public PageInfo<UsagesDetailVo> selectByMap(Map<String, Object> map, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        //查出所有课程
        List<UsagesDetail> usagesDetailList = usagesDetailMapper.selectByMap(map);
        //定义课程VO列表
        List<UsagesDetailVo> usagesDetailVoList = new LinkedList<>();
        //把课程逐个转成课程VO
        for (UsagesDetail usagesDetail : usagesDetailList) {
            usagesDetailVoList.add(assembleUsagesDetailVo(usagesDetail));
        }
        //定义返回pageInfo结果集把课程列表传进去
        PageInfo pageResult = new PageInfo(usagesDetailList);
        //把vo传到结果集
        pageResult.setList(usagesDetailVoList);
        return pageResult;
    }

    @Override
    public OperationVo selectById(Integer id) {
        Usages usages = usagesMapper.selectById(id);
//        UsagesVo usagesVo = assembleUsagesVo(usages);
        Operation operation = operationMapper.selectByPrimaryKey(usages.getOperationid());
        OperationVo operationVo = assembleUsagesVo(operation);

        return operationVo;
    }

    @Override
    public OperationVo selectByOperationId(Integer id) {
        return null;
    }

    /**
     * usages转换成UsagesVo
     * 用 BeanUtils.copyProperties(原对象, 目标对象) 把 Course 中的基本信息复制到 CourseVo 中
     * 通过 usages 中的 id 获取 对应ID的信息
     * @param usages
     * @return UsagesVo
     */
    private UsagesVo assembleUsagesVo(Usages usages) {
        UsagesVo usagesVo = new UsagesVo();
        BeanUtils.copyProperties(usages, usagesVo);
        //把ID查出的实体传给Vo
        Operation operation = operationMapper.selectByPrimaryKey(usages.getOperationid());
        usagesVo.setOperation(operation);

        return usagesVo;
    }
    private UsagesDetailVo assembleUsagesDetailVo(UsagesDetail usagesDetail) {
        UsagesDetailVo usagesDetailVo = new UsagesDetailVo();
        BeanUtils.copyProperties(usagesDetail, usagesDetailVo);
        //把ID查出的实体传给Vo
        Reason reason = reasonMapper.selectByPrimaryKey(usagesDetail.getReasonid());
        usagesDetailVo.setReason(reason);

        return usagesDetailVo;
    }

    private OperationVo assembleUsagesVo(Operation operation) {
        OperationVo operationVo = new OperationVo();
        BeanUtils.copyProperties(operation, operationVo);
        //把ID查出的实体传给Vo
        Garden garden = gardenMapper.selectByPrimaryKey(operation.getGardenid());
        operationVo.setGarden(garden);

        Weather weather = weatherMapper.selectByPrimaryKey(operation.getWeatherid());
        operationVo.setWeather(weather);

        Period period = periodMapper.selectByPrimaryKey(operation.getPeriodid());
        operationVo.setPeriod(period);

        return operationVo;
    }
}
