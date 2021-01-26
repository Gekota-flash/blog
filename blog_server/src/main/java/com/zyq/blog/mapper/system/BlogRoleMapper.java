package com.zyq.blog.mapper.system;

import com.zyq.blog.model.system.BlogRole;
import com.zyq.blog.model.system.BlogRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogRoleMapper {
    long countByExample(BlogRoleExample example);

    int deleteByExample(BlogRoleExample example);

    int deleteByPrimaryKey(Long roleId);

    int insert(BlogRole record);

    int insertSelective(BlogRole record);

    List<BlogRole> selectByExample(BlogRoleExample example);

    BlogRole selectByPrimaryKey(Long roleId);

    int updateByExampleSelective(@Param("record") BlogRole record, @Param("example") BlogRoleExample example);

    int updateByExample(@Param("record") BlogRole record, @Param("example") BlogRoleExample example);

    int updateByPrimaryKeySelective(BlogRole record);

    int updateByPrimaryKey(BlogRole record);
}