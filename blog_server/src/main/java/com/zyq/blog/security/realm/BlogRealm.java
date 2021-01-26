package com.zyq.blog.security.realm;

import com.zyq.blog.mapper.system.extmapper.BlogUserExtMapper;
import com.zyq.blog.model.system.BlogUser;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.realm.Realm;
import org.springframework.beans.factory.annotation.Autowired;

public class BlogRealm implements Realm {

    @Autowired
    private BlogUserExtMapper blogUserExtMapper;

    @Override
    public String getName() {
        return this.getClass().getName();
    }

    @Override
    public boolean supports(AuthenticationToken authenticationToken) {
        return false;
    }

    @Override
    public AuthenticationInfo getAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String userName = String.valueOf(authenticationToken.getPrincipal());
        BlogUser user = blogUserExtMapper.getUserByName(userName);
        String passWord = user.getUserPassword();
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(userName ,passWord ,this.getName());
        return info;
    }
}
