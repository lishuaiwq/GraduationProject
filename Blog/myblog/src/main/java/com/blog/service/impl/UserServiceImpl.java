package com.blog.service.impl;

import com.blog.dao.UserMapper;
import com.blog.entity.User;
import com.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author:shui.li
 * @Date:2019/3/715:25
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int regist(User user) {
        int i = userMapper.insert(user);
        i = i / 0;
        return i;
    }

    @Override
    public User login(String email, String password) {
        return null;
    }

    @Override
    public User findByEmail(String email) {
        return null;
    }

    @Override
    public User findByPhone(String phone) {
        return null;
    }

    @Override
    public User findById(Long id) {
        return null;
    }

    @Override
    public void deleteByEmail(String email) {

    }

    @Override
    public void update(User user) {

    }
}
