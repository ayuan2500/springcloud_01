package com.itheima.controller;

import com.itheima.pojo.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 * @ClassName UserController
 * @Description 描述
 * @version 1.0.0
 * @author ayuan
 * @createTime 2020/11/02 12:09:00
 */
@RestController
@RequestMapping("/user")
public class UserController {
    //从spring容器获取UserService对象
    @Autowired
    private UserService userService;

    /***
     * @title findById
     * @description 根据用户id获取用户数据
     * @param id 用户id
     * @return com.itheima.pojo.User
     * @author ayuan
     * @updateTime 2020/11/2 12:12
     */
    @GetMapping(value = "/find/{id}")
    public User findById(@PathVariable(value = "id")Integer id) {
        return userService.findById(id);
    }
}