package com.ssm.dao;

import com.ssm.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUserDao {
    User selectUser(int id);
    /**
     * 根据登录名与密码查询用户
     * @param UserName
     * @param Password  明文密码
     * @return
     */
    User findByLoginNP(@Param("username") String UserName,@Param("password") String Password);

    /**
     * 根据用户名查找用户
     * @param userName
     * @return
     */
    User getUserByName(@Param("username")String userName);

    List getUserList();
}
