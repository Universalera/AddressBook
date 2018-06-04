package com.driving.controller;

import com.driving.model.Ground;
import com.driving.service.GroundService;
import com.driving.status.ListObject;
import com.driving.status.StatusHouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by pxq on 2017/11/25.
 * ground 的Controller
 */
@RestController
public class GroundController {

    @Autowired
    private GroundService groundService;

    /**
     * 查询所有的Ground
     * @return
     */
    @RequestMapping(value = "/getAllGround")
    public ListObject getAllGround(){
        List<Ground> groundList=groundService.findAllGround();
        ListObject list = new ListObject();
        list.setData(groundList);
        if(groundList!=null){
//            list.setCode("200");
//            list.setStatus("success");
            list.setStatusObject(StatusHouse.COMMON_STATUS_OK);
            list.setMessage("成功");
        }
        return list;
    }


}
