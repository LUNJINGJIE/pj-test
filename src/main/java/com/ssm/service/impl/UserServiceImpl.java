package com.ssm.service.impl;

import com.ssm.dao.IUserDao;
import com.ssm.entity.User;
import com.ssm.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private IUserDao userDao;

    @Override
    public User selectUser(int id) {
        return userDao.selectUser(id);
    }


    @Override
    public User findByNameAndPassword(String userName, String password) {
        return userDao.findByLoginNP(userName, password);
    }

    @Override
    public User getUserByName(String userName) {
        return userDao.getUserByName(userName);
    }
}
