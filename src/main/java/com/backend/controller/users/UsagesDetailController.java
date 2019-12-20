package com.backend.controller.users;

import com.backend.entity.UsagesDetail;
import com.backend.service.UsagesDetailService;
import com.backend.vo.GardenVo;
import com.backend.vo.OperationVo;
import com.backend.vo.UsagesDetailVo;
import com.backend.vo.UsagesVo;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
@RequestMapping("/users/usages_detail")
public class UsagesDetailController {
    @Autowired
    private UsagesDetailService usagesDetailService;
    /**
     * 列表界面
     *
     * @param pageNum  第几页
     * @param pageSize 每页数据大小
     * @param map      传到页面的 model
     * @return jsp页面
     */
    @RequestMapping(value = "/list", method = {RequestMethod.GET, RequestMethod.POST})
    public String list(@RequestParam(required = false, defaultValue = "1") int pageNum,
                       @RequestParam(required = false, defaultValue = "10") int pageSize,
                       @RequestParam Map<String, Object> params,
                       Map<String, Object> map) {
        PageInfo<UsagesDetailVo> pageResult = usagesDetailService.selectByMap(params, pageNum, pageSize);
        map.put("pageResult", pageResult);
        map.put("params", params);
        return "manager/users/usages_detail_list";
    }

    /**
     * 前端模态框数据
     */
    @RequestMapping("/modeDate")
    @ResponseBody
    public OperationVo modeDate(Integer id)  {

        OperationVo operationVo = usagesDetailService.selectById(id);

        return operationVo;
    }
}
