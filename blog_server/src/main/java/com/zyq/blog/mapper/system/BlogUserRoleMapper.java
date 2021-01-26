package com.zyq.blog.mapper.system;

import com.zyq.blog.model.system.BlogUserRole;
import com.zyq.blog.model.system.BlogUserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogUserRoleMapper {
    long countByExample(BlogUserRoleExample example);

    int deleteByExample(BlogUserRoleExample example);

    int deleteByPrimaryKey(Long userRoleId);

    int insert(BlogUserRole record);

    int insertSelective(BlogUserRole record);

    List<BlogUserRole> selectByExample(BlogUserRoleExample example);

    BlogUserRole selectByPrimaryKey(Long userRoleId);

    int updateByExampleSelective(@Param("record") BlogUserRole record, @Param("example") BlogUserRoleExample example);

    int updateByExample(@Param("record") BlogUserRole record, @Param("example") BlogUserRoleExample example);

    int updateByPrimaryKeySelective(BlogUserRole record);

    int updateByPrimaryKey(BlogUserRole record);
}