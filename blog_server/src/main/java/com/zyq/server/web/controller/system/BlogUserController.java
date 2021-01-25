package com.zyq.server.web.controller.system;

import com.zyq.server.facde.request.system.BlogUserReq;
import com.zyq.server.facde.service.system.BlogUserService;
import com.zyq.server.utils.ResultModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class BlogUserController {

    @Autowired
    private BlogUserService blogUserService;

    @PostMapping("/register")
    @ResponseBody
    public ResultModel register(BlogUserReq req){
        return blogUserService.register(req);
    }

}
