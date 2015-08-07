package com.bogle.tpl.rms.service;

import com.bogle.tpl.rms.domain.Role;

import java.util.List;

/**
 * Created by Administrator on 2015/6/11.
 */
public interface RoleService{

    /**
     * 获取所有的角色资源信息
     * @return
     */
    List<Role> findAll();

}
