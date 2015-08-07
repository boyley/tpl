package com.bogle.tpl.rms.persistence;

import com.bogle.tpl.rms.domain.UserRole;

public interface UserRoleMapper {
    int insert(UserRole record);

    int insertSelective(UserRole record);
}