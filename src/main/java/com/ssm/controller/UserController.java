package com.ssm.controller;

import com.ssm.entity.RoleResource;
import com.ssm.entity.User;
import com.ssm.entity.Resource;
import com.ssm.service.RoleService;
import com.ssm.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@Controller
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;

    private String status;

    @RequestMapping(value = "/select")
    public String getUserInfo(HttpServletRequest request) {
        Integer id = Integer.valueOf(request.getParameter("id"));
        String sessionid = request.getSession().getId();
        System.out.println(sessionid);
        System.out.println("**");
        User user = userService.selectUser(id);
        System.out.println(user);
        System.out.println("**");
        return "success";
    }

    @RequestMapping(value = "/toLogin")
    public String toLogin() {
        Subject currentUser = SecurityUtils.getSubject();
        if (!currentUser.isAuthenticated()) {
            return "login";
        } else {
            return "/toIndex";
        }
    }

    @RequestMapping(value = "/login")
    public String login(HttpServletRequest request) {
        System.out.println(request.getSession().getId());
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        Subject currentUser = SecurityUtils.getSubject();
        if (!currentUser.isAuthenticated()) {
            try {
                UsernamePasswordToken token = new UsernamePasswordToken(name, password);
                currentUser.login(token);
                // 1.验证用户，从数据库获取user对象
                User user = userService.findByNameAndPassword(name, password);
                System.out.println(user.getName());

                // 菜单资源分配
                /*// 2.根据user对象获取roleId
                int roleId = user.getRole().getRoleId();

                // 3.根据roleId获取对应的resource
                List<Resource> resources = new ArrayList<Resource>();
                Set<RoleResource> roleResources = roleService.get(roleId).getRoleResources();

                for (RoleResource rrs : roleResources) {
                    resources.add(rrs.getResource());
                }

                List<Resource> _resources = new ArrayList<Resource>();
                for (Iterator<Resource> it = resources.iterator(); it.hasNext(); ) {
                    Resource resource = it.next();
                    String url = resource.getActionUrl();
                    int id = resource.getResourceId();
                    List<Resource> resources2 = new ArrayList<Resource>();
                    if ("none".equals(url)) {
                        // 取出子菜单
                        for (Iterator<Resource> it2 = resources.iterator(); it2.hasNext(); ) {
                            Resource resource2 = it2.next();
                            if (!("none").equals(resource2.getActionUrl()) && resource2.getResource().getResourceId() == id) {
                                resources2.add(resource2);
                            }
                        }
                    }
                    resource.setResources(resources2);
                    _resources.add(resource);
                }
                currentUser.getSession().setAttribute("resources", _resources);*/
            } catch (AuthenticationException e) {
                status = "failure";
                return "login";
            }
        }

        return "redirect:/toIndex";

    }

    @RequestMapping(value="/logout")
    public String logout(){
        Subject subject = SecurityUtils.getSubject();
        if (subject.isAuthenticated()) {
            subject.logout();
        }
        return "redirect:/toLogin";
    }

    @RequestMapping(value = "/toIndex")
    public String toIndex() {
        return "success";
    }

    public String getStatus() {
        return status;
    }

}
