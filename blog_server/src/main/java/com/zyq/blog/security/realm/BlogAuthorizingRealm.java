package com.zyq.blog.security.realm;

import com.zyq.blog.facde.service.system.BlogPermissionService;
import com.zyq.blog.facde.service.system.BlogRoleService;
import com.zyq.blog.mapper.system.extmapper.BlogUserExtMapper;
import com.zyq.blog.model.system.BlogUser;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BlogAuthorizingRealm extends AuthorizingRealm {

    @Autowired
    private BlogRoleService blogRoleService;
    @Autowired
    private BlogPermissionService blogPermissionService;
    @Autowired
    private BlogUserExtMapper blogUserExtMapper;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        String userName = String.valueOf(principalCollection.getPrimaryPrincipal());
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        List<String> roles = blogRoleService.getRoles(userName);
        info.addRoles(roles);
        List<String> permissions = blogPermissionService.getPermissions(roles);
        info.addStringPermissions(permissions);
        return info;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String userName = String.valueOf(authenticationToken.getPrincipal());
        BlogUser user = blogUserExtMapper.getUserByName(userName);
        String passWord = user.getUserPassword();
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(userName ,passWord ,this.getName());
        return info;
    }
}
