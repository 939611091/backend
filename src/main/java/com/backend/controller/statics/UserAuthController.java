package com.backend.controller.statics;

import com.backend.entity.UserAuth;
import com.backend.service.UserAuthService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Map;

@Controller
@RequestMapping("/static/user_auth")
public class UserAuthController {
    @Autowired
    private UserAuthService userAuthService;
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
        PageInfo<UserAuth> pageResult = userAuthService.selectByMap(params, pageNum, pageSize);
        map.put("pageResult", pageResult);
        map.put("params", params);
        return "manager/static/user_auth_list";
    }




    /**
     * 删除
     * @author vanh
     * @date 2019/12/17
     */
    @GetMapping("/delete.do")
    public String delete(Integer id, RedirectAttributes redirectAttributes) {
        userAuthService.deleteByPrimaryKey(id);
        redirectAttributes.addFlashAttribute("msgError","成功提示：取消成功");
        return "redirect:/static/user_auth/list";
    }

}
