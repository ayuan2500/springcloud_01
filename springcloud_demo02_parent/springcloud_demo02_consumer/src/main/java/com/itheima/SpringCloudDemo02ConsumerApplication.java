package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/***
 * @ClassName SpringCloudDemo02ConsumerApplicaion
 * @Description 描述
 * @version 1.0.0
 * @author ayuan
 * @createTime 2020/11/02 14:43:00
 */
@SpringBootApplication
public class SpringCloudDemo02ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudDemo02ConsumerApplication.class,args);
    }

    /***
     * @title restTemplate
     * @description 获取RestTemplate对象并交给spring容器
     * @param
     * @return org.springframework.web.client.RestTemplate
     * @author ayuan
     * @updateTime 2020/11/2 14:45
     */
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
