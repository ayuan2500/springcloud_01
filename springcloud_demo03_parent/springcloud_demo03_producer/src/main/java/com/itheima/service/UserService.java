package com.itheima.service;

import com.itheima.pojo.User;


/***
 * @ClassName UserService
 * @Description Service接口
 * @version 1.0.0
 * @author ayuan
 * @createTime 2020/11/02 12:05:00
 */
public interface UserService {
    /***
     * @title findById
     * @description 根据用户id获取用户数据
     * @param id 用户id
     * @return com.com.itheima.pojo.User
     * @author ayuan
     * @updateTime 2020/11/2 12:06
     */
    User findById(Integer id);
}
