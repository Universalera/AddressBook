package com.driving.service;

import com.driving.model.Ground;

import java.util.List;

/**
 * Created by pxq on 2017/11/24.
 * ground 的service的接口
 */
public interface GroundService {

    /**
     * 查询所有Ground
     * @return
     */
    List<Ground> findAllGround();

}

