package com.backend.controller.statics;

import com.backend.entity.Reason;
import com.backend.service.ReasonService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/static/reason")
public class ReasonController {
    @Autowired
    private ReasonService reasonService;
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
        PageInfo<Reason> pageResult = reasonService.selectByMap(params, pageNum, pageSize);
        map.put("pageResult", pageResult);
        map.put("params", params);
        return "manager/static/reason_list";
    }

    /**
     * 添加界面
     *
     * @return jsp页面
     * @author vanh
     * @date 2019/12/17
     */
    @GetMapping("/add")
    public String add(Map<String, Object> map) {
        List<Reason> parentList =reasonService.selectAllParent();
        map.put("parentList",parentList);
        return "manager/static/reason_add";
    }

    /**
     * 添加API
     *
     * @author vanh
     * @date 2019/7/19
     */
    @PostMapping("/add.do")
    public String add(Reason reason, RedirectAttributes redirectAttributes) {
        //检查不能为空
        if (reason.getName().equals("")) {
            redirectAttributes.addFlashAttribute("msgError", "错误提示：品种名不能为空！");
            return "redirect:/static/reason/add";
        }

        reasonService.insert(reason);
        redirectAttributes.addFlashAttribute("msgSuccess","成功提示：添加成功");
        return "redirect:/static/reason/list";
    }
    @GetMapping("/edit")
    public String editreason(Integer id, Map<String, Object> map) {

        List<Reason> parentList =reasonService.selectAllParent();
        map.put("parentList",parentList);
        Reason reason = reasonService.selectByPrimaryKey(id);

        map.put("reason",reason);

        return "manager/static/reason_edit";
    }

    /**
     * 修改API
     *
     * @author vanh
     * @date 2019/12/17
     */
    @RequestMapping("/edit.do")
    public String edit(Reason reason, RedirectAttributes redirectAttributes) {
        //检查不能为空
        if (reason.getName().equals("")) {
            redirectAttributes.addFlashAttribute("msgError", "错误提示：施肥原因不能为空！");
            return "redirect:/static/reason/edit";
        }
        if(reasonService.updateByPrimaryKey(reason)>0){
            redirectAttributes.addFlashAttribute("msgSuccess","成功提示：修改成功");
        }else {
            redirectAttributes.addFlashAttribute("msgError","错误提示：修改失败");
        }

        return "redirect:/static/reason/list";
    }

    /**
     * 删除
     * @author vanh
     * @date 2019/12/17
     */
    @GetMapping("/delete.do")
    public String delete(Integer id, RedirectAttributes redirectAttributes) {
        reasonService.deleteByPrimaryKey(id);
        redirectAttributes.addFlashAttribute("msgError","成功提示：删除成功");
        return "redirect:/static/reason/list";
    }
}
