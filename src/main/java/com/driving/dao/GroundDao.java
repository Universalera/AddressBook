package com.driving.dao;

import com.driving.model.Ground;

import java.util.List;

/**
 * Created by pxq on 2017/11/24.
 * mapper映射，方法对应mapper.xml的id名
 */
public interface GroundDao {

    /**
     * 查询所有account
     * @return
     */
    List<Ground> findAllGrouond();
}
