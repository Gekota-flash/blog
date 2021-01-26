package com.zyq.blog.serviceimpl.system;

import com.zyq.blog.facde.service.system.BlogPermissionService;
import com.zyq.blog.mapper.system.extmapper.BlogPermissionExtMapper;
import com.zyq.blog.model.system.BlogPermission;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class BlogPermissionServiceImpl implements BlogPermissionService {

    @Autowired
    private BlogPermissionExtMapper blogPermissionExtMapper;

    @Override
    public List<String> getPermissions(List<String> roleList) {
        List<BlogPermission> permissions = blogPermissionExtMapper.getPermissions(roleList);
        List<String> permissionList = new ArrayList<>();
        for (BlogPermission p : permissions) {
            permissionList.add(p.getPermissionName());
        }
        return permissionList;
    }
}
