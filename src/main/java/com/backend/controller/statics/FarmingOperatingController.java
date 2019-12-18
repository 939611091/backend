package com.backend.controller.statics;

import com.backend.entity.FarmingOperating;
import com.backend.service.FarmingOperatingService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Map;

@Controller
@RequestMapping("/static/farming_operating")
public class FarmingOperatingController {
    @Autowired
    private FarmingOperatingService farmingOperatingService;
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
        PageInfo<FarmingOperating> pageResult = farmingOperatingService.selectByMap(params, pageNum, pageSize);
        map.put("pageResult", pageResult);
        map.put("params", params);
        return "manager/static/farming_operating_list";
    }

    /**
     * 添加界面
     *
     * @return jsp页面
     * @author vanh
     * @date 2019/12/17
     */
    @GetMapping("/add")
    public String add() {

        return "manager/static/farming_operating_add";
    }

    /**
     * 添加API
     *
     * @author vanh
     * @date 2019/7/19
     */
    @PostMapping("/add.do")
    public String add(FarmingOperating farmingOperating, RedirectAttributes redirectAttributes) {
        //检查不能为空
        if (farmingOperating.getName().equals("")) {
            redirectAttributes.addFlashAttribute("msgError", "错误提示：品种名不能为空！");
            return "redirect:/static/farming_operating/add";
        }

        farmingOperatingService.insert(farmingOperating);
        redirectAttributes.addFlashAttribute("msgSuccess","成功提示：添加成功");
        return "redirect:/static/farming_operating/list";
    }

    /**
     * 修改页面
     *
     * @author vanh
     * @date 2019/12/17
     * @param id
     * @param map
     * @return
     */
    @GetMapping("/edit")
    public String editWeather(Integer id, Map<String, Object> map) {


        FarmingOperating farming_operating = farmingOperatingService.selectByPrimaryKey(id);

        map.put("farming_operating",farming_operating);

        return "manager/static/farming_operating_edit";
    }

    /**
     * 修改API
     *
     * @author vanh
     * @date 2019/12/17
     */
    @RequestMapping("/edit.do")
    public String edit(FarmingOperating farmingOperating, RedirectAttributes redirectAttributes) {
        //检查不能为空
        if (farmingOperating.getName().equals("")) {
            redirectAttributes.addFlashAttribute("msgError", "错误提示：品种不能为空！");
            return "redirect:/admin/farming_operating/edit";
        }
        if(farmingOperatingService.updateByPrimaryKey(farmingOperating)>0){
            redirectAttributes.addFlashAttribute("msgSuccess","成功提示：修改成功");
        }else {
            redirectAttributes.addFlashAttribute("msgError","错误提示：修改失败");
        }

        return "redirect:/static/farming_operating/list";
    }

    /**
     * 删除
     * @author vanh
     * @date 2019/12/17
     */
    @GetMapping("/delete.do")
    public String delete(Integer id, RedirectAttributes redirectAttributes) {
        farmingOperatingService.deleteByPrimaryKey(id);
        redirectAttributes.addFlashAttribute("msgError","成功提示：删除成功");
        return "redirect:/static/farming_operating/list";
    }
}
