package com.ssm.controller;

import com.ssm.entity.User;
import com.ssm.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value="/select")
    public String getUserInfo(HttpServletRequest request){
        Integer id = Integer.valueOf(request.getParameter("id"));
        System.out.println("**");
        User user = userService.selectUser(id);
        System.out.println(user);
        System.out.println("**");
        return "success";
    }
}
