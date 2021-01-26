package com.zyq.blog.facde.service.system;

import java.util.List;

/**
 * @author zyq
 * @data 2021年1月25日 22:08:36
 */
public interface BlogPermissionService {

    /**
     * 根据角色获取权限 2021年1月26日 21:47:16
     * @param roleList
     * @return
     */
    List<String> getPermissions(List<String> roleList);

}
