package com.zyq.blog.facde.service.system;

import java.util.List;

/**
 * @author zyq
 * @data 2021年1月25日 22:08:24
 */
public interface BlogRoleService {

    /**
     * 根据用户名获取角色 2021年1月25日 22:12:30
     * @param userName
     * @return
     */
    List<String> getRoles(String userName);

}
