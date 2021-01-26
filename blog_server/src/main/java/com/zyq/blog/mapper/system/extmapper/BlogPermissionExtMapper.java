package com.zyq.blog.mapper.system.extmapper;

import com.zyq.blog.model.system.BlogPermission;

import java.util.List;

public interface BlogPermissionExtMapper {

    List<BlogPermission> getPermissions(List<String> roleList);

}
