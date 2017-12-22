package com.ssm.service.security;

import com.ssm.entity.Role;
import com.ssm.entity.RoleResource;
import com.ssm.entity.User;
import com.ssm.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.cache.Cache;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.SimplePrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class MonitorRealm extends AuthorizingRealm{

    @Autowired
    public UserService userService;

    public MonitorRealm() {
        super();
        setAuthenticationTokenClass(UsernamePasswordToken.class);
    }
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        String loginName = (String) principals.fromRealm(getName()).iterator().next();
        Set<String> roleNames = new HashSet<String>();
        Set<String> permissions = new HashSet<String>();
        User user = userService.getUserByName(loginName);

        if(user != null){
            Role role = user.getRole();
            roleNames.add(role.getName());
            Set<RoleResource> roleResourceSet = role.getRoleResources();
            //页面资源权限
            for(RoleResource roleResource : roleResourceSet){
                permissions.add(roleResource.getResource().getActionUrl());
            }

        }

        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo(roleNames);
        info.setStringPermissions(permissions);
        return info;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) token;
        String username = String.valueOf(usernamePasswordToken.getUsername());
        String password = new String(usernamePasswordToken.getPassword());
        User user = userService.findByNameAndPassword(username,password);
        AuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(user.getName(), user.getPassword(), getName());
        return authenticationInfo;
    }
    /**
     * 更新用户授权信息缓存.
     */
    public void clearCachedAuthorizationInfo(Object principal) {
        SimplePrincipalCollection principals = new SimplePrincipalCollection(principal, getName());
        clearCachedAuthorizationInfo(principals);
    }

    /**
     * 清除所有用户授权信息缓存.
     */
    public void clearAllCachedAuthorizationInfo() {
        Cache<Object, AuthorizationInfo> cache = getAuthorizationCache();
        if (cache != null) {
            for (Object key : cache.keys()) {
                cache.remove(key);
            }
        }
    }
}
