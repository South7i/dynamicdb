package com.south.controller;

import com.south.common.BaseController;
import com.south.service.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Mr.裴
 * @create 2019/9/29
 * @Description: 登录控制器
 **/
@RestController
public class OpenController extends BaseController {
    @Autowired
    private DbService dbService;

    @GetMapping("/open2")
    public Object login(){
        return  dbService.selectTwo(1);
    }

    @GetMapping("/open")
    public Object login1(){
        return dbService.selectUser(1);
    }
    
}
