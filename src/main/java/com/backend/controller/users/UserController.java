package com.backend.controller.users;

import com.backend.entity.User;
import com.backend.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Map;

@Controller
@RequestMapping("/users/user")
public class UserController {
    @Autowired
    private UserService userService;
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
        PageInfo<User> pageResult = userService.selectByMap(params, pageNum, pageSize);
        map.put("pageResult", pageResult);
        map.put("params", params);
        return "manager/users/user_list";
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
    public String edituser(Integer id, Map<String, Object> map) {


        User user = userService.selectByPrimaryKey(id);

        map.put("user",user);

        return "manager/users/user_edit";
    }

    /**
     * 修改API
     *
     * @author vanh
     * @date 2019/12/17
     */
    @RequestMapping("/edit.do")
    public String edit(User user, RedirectAttributes redirectAttributes) {
        //检查不能为空
        if (user.getNickname().equals("")) {
            redirectAttributes.addFlashAttribute("msgError", "错误提示：用户名不能为空！");
            return "redirect:/users/user/edit";
        }
        if(userService.updateByPrimaryKey(user)>0){
            redirectAttributes.addFlashAttribute("msgSuccess","成功提示：修改成功");
        }else {
            redirectAttributes.addFlashAttribute("msgError","错误提示：修改失败");
        }

        return "redirect:/users/user/list";
    }

    /**
     * 删除
     * @author vanh
     * @date 2019/12/17
     */
    @GetMapping("/delete.do")
    public String delete(Integer id, RedirectAttributes redirectAttributes) {
        userService.deleteByPrimaryKey(id);
        redirectAttributes.addFlashAttribute("msgError","成功提示：删除成功");
        return "redirect:/users/user/list";
    }
}
