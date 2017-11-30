package com.ssm.dao;

import com.ssm.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserDao {
    User selectUser(int id);
}
