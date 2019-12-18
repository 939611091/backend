package com.backend.controller.statics;

import com.backend.entity.Weather;
import com.backend.service.WeatherService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Map;

@Controller
@RequestMapping("/static/weather")
public class WeatherController {
    @Autowired
    private WeatherService weatherService;
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
        PageInfo<Weather> pageResult = weatherService.selectByMap(params, pageNum, pageSize);
        map.put("pageResult", pageResult);
        map.put("params", params);
        return "manager/static/weather_list";
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

        return "manager/static/weather_add";
    }

    /**
     * 添加API
     *
     * @author vanh
     * @date 2019/7/19
     */
    @PostMapping("/add.do")
    public String add(Weather weather, RedirectAttributes redirectAttributes) {
        //检查不能为空
        if (weather.getName().equals("")) {
            redirectAttributes.addFlashAttribute("msgError", "错误提示：品种名不能为空！");
            return "redirect:/static/weather/add";
        }

        weatherService.insert(weather);
        redirectAttributes.addFlashAttribute("msgSuccess","成功提示：添加成功");
        return "redirect:/static/weather/list";
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


        Weather weather = weatherService.selectByPrimaryKey(id);

        map.put("weather",weather);

        return "manager/static/weather_edit";
    }

    /**
     * 修改API
     *
     * @author vanh
     * @date 2019/12/17
     */
    @RequestMapping("/edit.do")
    public String edit(Weather weather, RedirectAttributes redirectAttributes) {
        //检查不能为空
        if (weather.getName().equals("")) {
            redirectAttributes.addFlashAttribute("msgError", "错误提示：品种不能为空！");
            return "redirect:/admin/weather/edit";
        }
        if(weatherService.updateByPrimaryKey(weather)>0){
            redirectAttributes.addFlashAttribute("msgSuccess","成功提示：修改成功");
        }else {
            redirectAttributes.addFlashAttribute("msgError","错误提示：修改失败");
        }

        return "redirect:/static/weather/list";
    }

    /**
     * 删除
     * @author vanh
     * @date 2019/12/17
     */
    @GetMapping("/delete.do")
    public String delete(Integer id, RedirectAttributes redirectAttributes) {
        weatherService.deleteByPrimaryKey(id);
        redirectAttributes.addFlashAttribute("msgError","成功提示：删除成功");
        return "redirect:/static/weather/list";
    }
}
