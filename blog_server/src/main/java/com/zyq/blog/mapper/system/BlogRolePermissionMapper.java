package com.zyq.blog.mapper.system;

import com.zyq.blog.model.system.BlogRolePermission;
import com.zyq.blog.model.system.BlogRolePermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogRolePermissionMapper {
    long countByExample(BlogRolePermissionExample example);

    int deleteByExample(BlogRolePermissionExample example);

    int deleteByPrimaryKey(Long rolePermissionId);

    int insert(BlogRolePermission record);

    int insertSelective(BlogRolePermission record);

    List<BlogRolePermission> selectByExample(BlogRolePermissionExample example);

    BlogRolePermission selectByPrimaryKey(Long rolePermissionId);

    int updateByExampleSelective(@Param("record") BlogRolePermission record, @Param("example") BlogRolePermissionExample example);

    int updateByExample(@Param("record") BlogRolePermission record, @Param("example") BlogRolePermissionExample example);

    int updateByPrimaryKeySelective(BlogRolePermission record);

    int updateByPrimaryKey(BlogRolePermission record);
}