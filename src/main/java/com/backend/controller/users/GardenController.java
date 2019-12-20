package com.backend.controller.users;


import com.backend.service.GardenService;
import com.backend.vo.GardenVo;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.Map;

@Controller
@RequestMapping("/users/garden")
public class GardenController {
    @Autowired
    private GardenService gardenService;
    @GetMapping("/map")
    public String map(Integer id,Map<String, Object> map) {
        GardenVo gardenVo = gardenService.selectById(id);
        map.put("gardenVo",gardenVo);
        if(gardenVo.getLoc() != null && !"".equals(gardenVo.getLoc().trim()) ){
            String[] locArr = gardenVo.getLoc().split(",");
            if(locArr.length >= 2){
                map.put("locX",locArr[0]);
                map.put("locY",locArr[1]);
            }

        }
        return "manager/users/garden_map";
    }
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
        PageInfo<GardenVo> pageResult = gardenService.selectByMap(params, pageNum, pageSize);
        map.put("pageResult", pageResult);
        map.put("params", params);
        return "manager/users/garden_list";
    }
    /**
     * 查看果园信息页面
     *
     * @author vanh
     * @date 2019/12/19
     * @param id
     * @return gardenVo
     */
    @GetMapping("/info")
    public String gardenInfo(Integer id,Map<String, Object> map) {
        //id是果园Id
        GardenVo gardenVo = gardenService.selectById(id);
        map.put("gardenVo",gardenVo);
        return "manager/users/garden_info";
    }
}
