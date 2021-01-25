package com.zyq.server.serviceimpl.system;

import com.zyq.server.exception.BlogException;
import com.zyq.server.exception.ErrorCodeConst;
import com.zyq.server.facde.request.system.BlogUserReq;
import com.zyq.server.facde.service.system.BlogUserService;
import com.zyq.server.mapper.system.BlogUserMapper;
import com.zyq.server.model.system.BlogUser;
import com.zyq.server.model.system.BlogUserExample;
import com.zyq.server.utils.ResultModel;
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
