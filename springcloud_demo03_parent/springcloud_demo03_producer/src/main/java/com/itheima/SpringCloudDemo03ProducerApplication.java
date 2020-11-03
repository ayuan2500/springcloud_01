package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/***
 * @ClassName SpringCloudDemo02ProducerApplication
 * @Description 描述
 * @version 1.0.0
 * @author ayuan
 * @createTime 2020/11/02 12:15:00
 */
@SpringBootApplication
@EnableDiscoveryClient  //开启Eureka客户端发现功能
public class SpringCloudDemo03ProducerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudDemo03ProducerApplication.class,args);
    }
}
