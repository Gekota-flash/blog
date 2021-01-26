package com.zyq.blog.facde.service.system;

import com.zyq.blog.facde.request.system.BlogUserReq;
import com.zyq.blog.utils.ResultModel;

/**
 * @author zyq
 * @data 2021年1月24日 11:58:58
 */
public interface BlogUserService {

    /**
     * 注册 2021年1月24日 11:59:33
     * @param req
     * @return
     */
    ResultModel register(BlogUserReq req);

    /**
     * 登录 2021年1月24日 18:35:21
     * @param req
     * @return
     */
    ResultModel login(BlogUserReq req);

}
