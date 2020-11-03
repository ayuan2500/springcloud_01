package com.itheima.service.Impl;

import com.itheima.dao.UserDao;
import com.itheima.pojo.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/***
 * @ClassName UserServcieImpl
 * @Description service实现类
 * @version 1.0.0
 * @author ayuan
 * @createTime 2020/11/02 12:05:00
 */
@Service
public class UserServcieImpl implements UserService {

    //从spring容器获取UserDao对象
    @Autowired
    private UserDao userDao;

    /***
     * @title findById
     * @description 根据用户id获取用户数据
     * @param id 用户id
     * @return com.com.itheima.pojo.User
     * @author ayuan
     * @updateTime 2020/11/2 12:09
     */
    @Override
    public User findById(Integer id) {
        return userDao.findById(id).get();
    }
}
