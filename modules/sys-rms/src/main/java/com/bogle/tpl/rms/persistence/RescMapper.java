package com.bogle.tpl.rms.persistence;

import com.bogle.tpl.rms.domain.Resc;

public interface RescMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Resc record);

    int insertSelective(Resc record);

    Resc selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Resc record);

    int updateByPrimaryKey(Resc record);
}