package com.bogle.tpl.rms.service.impl;

import com.bogle.tpl.rms.service.RoleService;
import com.bogle.tpl.rms.domain.Role;
import com.bogle.tpl.rms.persistence.RoleMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2015/6/11.
 */
@Service("roleService")
public class RoleServiceImpl implements RoleService {

    @Resource
    private RoleMapper roleMapper;

    @Override
    public List<Role> findAll() {
        return roleMapper.findAll();
    }
}
