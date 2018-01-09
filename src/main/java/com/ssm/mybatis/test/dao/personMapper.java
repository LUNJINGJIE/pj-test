package com.ssm.mybatis.test.dao;

import com.ssm.entity.person;

public interface personMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(person record);

    int insertSelective(person record);

    person selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(person record);

    int updateByPrimaryKey(person record);
}