package com.ssm.dao;

import com.ssm.entity.Role;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDao {
    Role get(int roleId);
}
