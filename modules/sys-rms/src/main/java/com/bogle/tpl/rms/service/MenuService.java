package com.bogle.tpl.rms.service;

import com.bogle.tpl.rms.domain.Menu;
import com.bogle.tpl.rms.domain.Resc;

import java.util.List;

/**
 * Created by Administrator on 2015/7/28.
 */
public interface MenuService {

    /**
     * 根据资源查询菜单
     * @param rescs
     * @return
     */
    List<Menu> selectByRescs(List<Resc> rescs);
}
