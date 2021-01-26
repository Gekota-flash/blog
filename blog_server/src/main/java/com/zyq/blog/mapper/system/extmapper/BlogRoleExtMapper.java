package com.zyq.blog.mapper.system.extmapper;

import com.zyq.blog.mapper.system.BlogRoleMapper;
import com.zyq.blog.model.system.BlogRole;

import java.util.List;

public interface BlogRoleExtMapper extends BlogRoleMapper {

    List<BlogRole> getRoles(String userName);

}
