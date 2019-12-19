package com.backend.controller.admin;

import com.backend.entity.Admin;
import com.backend.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;
    @GetMapping("/login")
    public String login() {
        return "manager/admin/admin_login";
    }
    @GetMapping("/index")
    public String index() {
        return "manager/admin/index";
    }
    /**
     * 登录操作
     * @param username 手机
     * @param password 密码
     * @param session session
     * @param redirectAttributes
     * @return
     */
    @RequestMapping(value = "/login.do",method = RequestMethod.POST)
    public String doLogin(@RequestParam("username") String username, @RequestParam("password") String password, HttpSession session, RedirectAttributes redirectAttributes ) {

        if (username.equals("")) {
            redirectAttributes.addFlashAttribute("msg", "用户名不能为空");
            return "redirect:/admin/login";
        }

        Admin admin = adminService.login(username,password);
        if (admin != null) {
            session.setAttribute("admin", admin);
            return "manager/admin/index";
        } else {
            redirectAttributes.addFlashAttribute("msg", "错误提示：用户名和密码错误，请重试。");
            return "redirect:/admin/login";
        }
    }
    //退出用户
    @GetMapping("exit")
    public String exitAdmin(HttpServletRequest request) {

        HttpSession session = request.getSession();
        //从session判断admin是否存在，即可判断用户是否登录
        if (session.getAttribute("admin") != null) {
            //使当前session的admin无效
            session.removeAttribute("admin");

        }
        return "redirect:/admin/login";
    }
    //修改个人信息
    @GetMapping("/edit")
    public String editAdmin(Integer id, Map<String, Object> map) {


        Admin admin = adminService.selectByPrimaryKey(id);

        map.put("admin",admin);

        return "manager/admin/admin_edit";
    }

    /**
     * 修改API
     *
     * @author vanh
     * @date 2019/12/17
     */
    @RequestMapping("/edit.do")
    public String edit(Admin admin, RedirectAttributes redirectAttributes) {
        //检查不能为空
        if (admin.getUsername().equals("")) {
            redirectAttributes.addFlashAttribute("msgError", "错误提示：用户名不能为空！");
            return "redirect:/admin/edit";
        }
        //根据id查该用户的密码赋给password
        String password = adminService.selectPasswordById(admin.getAdminid());

        if(admin.getPassword()!=""){
            admin.setPassword(admin.getPassword());
        }else{
            admin.setPassword(password);
        }
        if(adminService.updateByPrimaryKey(admin)>0){
            redirectAttributes.addFlashAttribute("msg","成功提示：修改成功,请重新登录");
        }else {
            redirectAttributes.addFlashAttribute("msg","错误提示：修改失败");
        }

        return "redirect:/admin/login";
    }
}
