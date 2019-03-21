package com.blog.controller;

import com.blog.entity.User;
import com.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author:shui.li
 * @Date:2019/3/715:31
 */
@Controller
@ResponseBody
public class UserController {
    @Autowired
    UserService userService;


    @RequestMapping("/hehe")
    User hehe(){
        User user=new User();
        user.setNickName("小帅");
        userService.regist(user);
        return user;
    }
}
