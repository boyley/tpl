package com.bogle.tpl.rms.persistence;

import com.bogle.tpl.rms.domain.Role;

import java.util.List;

public interface RoleMapper {
    int insert(Role record);

    int insertSelective(Role record);

    List<Role> findAll();
}