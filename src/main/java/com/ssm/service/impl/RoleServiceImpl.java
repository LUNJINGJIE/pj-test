package com.ssm.service.impl;

import com.ssm.dao.RoleDao;
import com.ssm.entity.Role;
import com.ssm.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleDao roleDao;
    @Override
    public Role get(int roleId) {
        return roleDao.get(roleId);
    }
}
