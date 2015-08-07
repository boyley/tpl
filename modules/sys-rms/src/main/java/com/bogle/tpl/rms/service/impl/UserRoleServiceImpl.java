package com.bogle.tpl.rms.service.impl;

import com.bogle.tpl.rms.domain.UserRole;
import com.bogle.tpl.rms.persistence.UserRoleMapper;
import com.bogle.tpl.rms.service.UserRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2015/6/12.
 */
@Service("userRoleService")
public class UserRoleServiceImpl implements UserRoleService {

    @Resource
    private UserRoleMapper userRoleMapper;


    @Override
    public int insert(UserRole record) {
        return userRoleMapper.insert(record);
    }

    @Override
    public int updateByPrimaryKey(UserRole record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(UserRole record) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return 0;
    }

    @Override
    public int insertSelective(UserRole record) {
        return userRoleMapper.insertSelective(record);
    }

    @Override
    public UserRole selectByPrimaryKey(Long id) {
        return null;
    }
}