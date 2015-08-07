package com.bogle.tpl.rms.service;

import com.bogle.tpl.rms.domain.UserRole;

/**
 * Created by Administrator on 2015/6/12.
 */
public interface UserRoleService{

    int insert(UserRole record);

    int insertSelective(UserRole record);

    int deleteByPrimaryKey(Long id);



    UserRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserRole record);

    int updateByPrimaryKey(UserRole record);
}
