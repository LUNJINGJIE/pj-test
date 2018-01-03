package com.ssm.mybatis.test.dao;

import com.ssm.entity.person;

import java.util.List;
import java.util.Map;

/**
 * @author Administrator
 */
public interface MyBatisTestMapper {
    /**
     * selectPerson
     *
     * @param id
     * @return
     */
    Map selectPerson(int id);

    /**
     * insert an record
     *
     * @param
     */
    int insertPerson(person user);

    /**
     * @param user
     * @return
     */
    int updatePerson(person user);

    /**
     * @param id
     * @return
     */
    int deletePerson(int id);

    /**
     * 批量插入
     * @param list
     * @return
     */
    int insertPersonList(List<person> list);
}
