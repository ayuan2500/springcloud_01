package com.itheima.controller;

import com.itheima.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/***
 * @ClassName UserController
 * @Description User控制层
 * @version 1.0.0
 * @author ayuan
 * @createTime 2020年11月02日 10:36:00
 */
@RestController
@RequestMapping("/user")
public class UserController {
    /***
     * @title getUserList
     * @description 获取User对象的list集合
     * @param
     * @return java.util.List<com.itheima.pojo.User>
     * @author ayuan
     * @updateTime 2020/11/2 10:39
     */
    @RequestMapping("/list")
    public List<User> getUserList() {
        List<User> userList = new ArrayList<>();
        userList.add(new User("张三", 18, "zhangsan"));
        userList.add(new User("李四", 19, "lisi"));
        userList.add(new User("王五", 20, "wangwu"));
        return userList;
    }
}
