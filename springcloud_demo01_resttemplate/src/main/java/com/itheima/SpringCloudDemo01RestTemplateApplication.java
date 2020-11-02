package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/***
 * @ClassName SpringCloudDemo01RestTemplateApplication
 * @Description 启动类，并在启动类中创建RestTemplate对象
 * @version 1.0.0
 * @author ayuan
 * @createTime 2020/11/02 10:57:00
 */

@SpringBootApplication
public class SpringCloudDemo01RestTemplateApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudDemo01RestTemplateApplication.class,args);
    }

    /***
     * @title restTemplate
     * @description 获取RestTemplate对象，并交给Spring容器
     * @param
     * @return org.springframework.web.client.RestTemplate
     * @author ayuan
     * @updateTime 2020/11/2 10:59
     */
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
