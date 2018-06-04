package com.driving.service.impl;



import com.driving.dao.GroundDao;
import com.driving.model.Ground;
import com.driving.service.GroundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by pxq on 2017/11/25.
 * ground 的service层的实现
 */
@Service
public class GroundServiceImpl implements GroundService {

    @Autowired
    private GroundDao groundDao;

    /**
     * 查询所有Account
     * @return
     */

    @Override
    public List<Ground> findAllGround() {
        return groundDao.findAllGrouond();
    }
}
