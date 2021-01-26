package com.zyq.blog.serviceimpl.system;

import com.zyq.blog.facde.service.system.BlogRoleService;
import com.zyq.blog.mapper.system.BlogUserMapper;
import com.zyq.blog.mapper.system.BlogUserRoleMapper;
import com.zyq.blog.mapper.system.extmapper.BlogRoleExtMapper;
import com.zyq.blog.model.system.BlogRole;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class BlogRoleServiceImpl implements BlogRoleService {

    @Autowired
    private BlogUserMapper blogUserMapper;
    @Autowired
    private BlogRoleExtMapper blogRoleExtMapper;
    @Autowired
    private BlogUserRoleMapper blogUserRoleMapper;

    @Override
    public List<String> getRoles(String userName) {
        List<BlogRole> roles = blogRoleExtMapper.getRoles(userName);
        List<String> roleList = new ArrayList<>();
        for (BlogRole b : roles) {
            roleList.add(b.getRoleName());
        }
        return roleList;
    }

}
