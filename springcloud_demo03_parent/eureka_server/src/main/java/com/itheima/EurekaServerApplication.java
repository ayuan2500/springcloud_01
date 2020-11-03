package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/***
 * @ClassName EurekaServerApplication
 * @Description 启动类，并开启Eureka服务
 * @version 1.0.0
 * @author ayuan
 * @createTime 2020/11/02 16:45:00
 */
@SpringBootApplication
@EnableEurekaServer //开启Eureka服务
public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class,args);
    }
}
