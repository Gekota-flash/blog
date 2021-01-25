package com.zyq.server.mapper.system;

import com.zyq.server.model.system.BlogPermission;
import com.zyq.server.model.system.BlogPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogPermissionMapper {
    long countByExample(BlogPermissionExample example);

    int deleteByExample(BlogPermissionExample example);

    int deleteByPrimaryKey(Long permissionId);

    int insert(BlogPermission record);

    int insertSelective(BlogPermission record);

    List<BlogPermission> selectByExample(BlogPermissionExample example);

    BlogPermission selectByPrimaryKey(Long permissionId);

    int updateByExampleSelective(@Param("record") BlogPermission record, @Param("example") BlogPermissionExample example);

    int updateByExample(@Param("record") BlogPermission record, @Param("example") BlogPermissionExample example);

    int updateByPrimaryKeySelective(BlogPermission record);

    int updateByPrimaryKey(BlogPermission record);
}