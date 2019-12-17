package com.backend.controller.users;

import com.backend.entity.User;
import com.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/users/user")
public class UserController {
    @Autowired
    private UserService userService;
    //跳转登录页面
    @GetMapping("/login")
    public String login() {
        return "manager/users/user_login";
    }
    /**
     * 登录操作
     * @param phone 手机
     * @param password 密码
     * @param session session
     * @param redirectAttributes
     * @return
     */
    @RequestMapping(value = "/login.do",method = RequestMethod.POST)
    public String doLogin(@RequestParam("phone") String phone, @RequestParam("password") String password, HttpSession session, RedirectAttributes redirectAttributes ) {

        if (phone.equals("")) {
            redirectAttributes.addFlashAttribute("msg", "用户名不能为空");
            return "redirect:users/user/login";
        }

        User user = userService.login(phone, password);
        if (user != null) {
            session.setAttribute("user", user);
            return "manager/users/index";
        } else {
            redirectAttributes.addFlashAttribute("msg", "错误提示：用户名和密码错误，请重试。");
            return "redirect:/users/user/login";
        }
    }


}
