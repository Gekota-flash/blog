package com.zyq.blog.serviceimpl.system;

import com.zyq.blog.exception.BlogException;
import com.zyq.blog.exception.ErrorCodeConst;
import com.zyq.blog.facde.request.system.BlogUserReq;
import com.zyq.blog.facde.service.system.BlogUserService;
import com.zyq.blog.mapper.system.BlogUserMapper;
import com.zyq.blog.model.system.BlogUser;
import com.zyq.blog.model.system.BlogUserExample;
import com.zyq.blog.utils.ResultModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
@Slf4j
public class BlogUserServiceImpl implements BlogUserService {

    @Autowired
    private BlogUserMapper blogUserMapper;

    @Override
    public ResultModel register(BlogUserReq req) {
        validUser(req);
        BlogUserExample blogUserExample = new BlogUserExample();
        BlogUserExample.Criteria criteria = blogUserExample.createCriteria();
        List<BlogUser> blogUsers = blogUserMapper.selectByExample(blogUserExample);
        ResultModel model = new ResultModel();
        return model;
    }

    @Override
    public ResultModel login(BlogUserReq req) {
//        if (StringUtils)
        return null;
    }

    public void validUser(BlogUserReq req) {
        if (StringUtils.isEmpty(req.getUserName())) {
            throw new BlogException(ErrorCodeConst.EXIST_USER_NAME);
        }
    }

}
