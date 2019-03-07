package com.blog.service;

import com.blog.entity.User;

/**
 * @Author:shui.li
 * @Date:2019/3/715:11
 */
public interface UserService {
    //用户注册
    int regist(User user);

    //用户登录
    User login(String email,String password);

    //根据邮箱查询用户
    User findByEmail(String email);

    //根据用户手机号码查询用户
    User findByPhone(String phone);

    //根据用户Id查询用户
    User findById(Long id);

    //根据邮箱删除用户
    void deleteByEmail(String email);

    //更新用户信息
    void update(User user);
}
