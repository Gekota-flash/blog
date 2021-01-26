package com.zyq.blog.mapper.system;

import com.zyq.blog.model.system.BlogUser;
import com.zyq.blog.model.system.BlogUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogUserMapper {
    long countByExample(BlogUserExample example);

    int deleteByExample(BlogUserExample example);

    int deleteByPrimaryKey(Long userId);

    int insert(BlogUser record);

    int insertSelective(BlogUser record);

    List<BlogUser> selectByExample(BlogUserExample example);

    BlogUser selectByPrimaryKey(Long userId);

    int updateByExampleSelective(@Param("record") BlogUser record, @Param("example") BlogUserExample example);

    int updateByExample(@Param("record") BlogUser record, @Param("example") BlogUserExample example);

    int updateByPrimaryKeySelective(BlogUser record);

    int updateByPrimaryKey(BlogUser record);
}