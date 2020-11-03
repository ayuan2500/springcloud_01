package com.itheima.dao;

import com.itheima.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

/***
 * @ClassName UserDao
 * @Description dao接口，继承JpaRepository接口
 * @version 1.0.0
 * @author ayuan
 * @createTime 2020/11/02 12:04:00
 */
public interface UserDao extends JpaRepository<User,Integer> {
}
