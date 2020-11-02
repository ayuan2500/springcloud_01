package com.itheima.controller;

import com.itheima.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/***
 * @ClassName UserController
 * @Description User控制层
 * @version 1.0.0
 * @author ayuan
 * @createTime 2020/11/02 14:46:00
 */
@RestController
@RequestMapping("/consumer")
public class UserController {
    //获取RestTemplate对象
    @Autowired
    private RestTemplate restTemplate;

    /***
     * @title queryById
     * @description 根据用户id通过restTemplate获取数据
     * @param id 用户id
     * @return com.itheima.pojo.User
     * @author ayuan
     * @updateTime 2020/11/2 14:50
     */
    @GetMapping(value = "/{id}")
    public User queryById(@PathVariable(value = "id")Integer id){
        String url = "http://localhost:18081/user/find/" + id;
        return restTemplate.getForObject(url,User.class);
    }
}
