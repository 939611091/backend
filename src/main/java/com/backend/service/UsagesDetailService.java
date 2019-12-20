package com.backend.service;

import com.backend.entity.UsagesDetail;
import com.backend.vo.OperationVo;
import com.backend.vo.UsagesDetailVo;
import com.backend.vo.UsagesVo;
import com.github.pagehelper.PageInfo;

import java.util.Map;

public interface UsagesDetailService {
    int deleteByPrimaryKey(Integer id);

    int insert(UsagesDetail record);

    UsagesDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(UsagesDetail record);

    PageInfo<UsagesDetailVo> selectByMap(Map<String, Object> map, int pageNum, int pageSize);

    //根据id查vo
    OperationVo selectById(Integer id);

    OperationVo selectByOperationId(Integer id);
}
