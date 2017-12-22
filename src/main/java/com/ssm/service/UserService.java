package com.ssm.service;

import com.ssm.entity.User;

public interface UserService {
    User selectUser(int id);

    /**
     * 根据用户名、密码查找用户
     * @param userName
     * @param password
     * @return
     */
    User findByNameAndPassword(String userName,String password);

    /**
     * 根据用户名查找用户
     * @param userName
     * @return
     */
    User getUserByName(String userName);
}
