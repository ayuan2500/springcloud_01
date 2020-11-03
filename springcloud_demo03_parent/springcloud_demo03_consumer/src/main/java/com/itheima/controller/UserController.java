package com.itheima.controller;


import com.itheima.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.DispatcherServlet;

import java.util.List;

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
    //注入对象，用来发现当前注册中心中的服务对象
    @Autowired
    private DiscoveryClient discoveryClient;

    /***
     * @title queryById
     * @description 根据用户id通过restTemplate获取数据
     * @param id 用户id
     * @return com.com.itheima.pojo.User
     * @author ayuan
     * @updateTime 2020/11/2 14:50
     */
    @GetMapping(value = "/{id}")
    public User queryById(@PathVariable(value = "id")Integer id){
        /*String url = "http://localhost:18081/user/find/" + id;
        return restTemplate.getForObject(url,User.class);*/
        //获取指定的服务提供者实例
        List<ServiceInstance> instances = discoveryClient.getInstances("springcloud_demo03_producer");
        //获取第1个实例对象
        ServiceInstance serviceInstance = instances.get(0);
        //从实例对象获取服务主机和服务端口
        String instanceUrl = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/user/find/" + id;
        //根据用户id通过restTemplate获取数据
        return restTemplate.getForObject(instanceUrl,User.class);
    }
}
