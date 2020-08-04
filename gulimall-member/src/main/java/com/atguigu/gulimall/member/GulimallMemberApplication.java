package com.atguigu.gulimall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/*
* 1，想要远程调用别的服务
* 1）、引入open-feign
* 2）、编写一个接口，告诉SpringCloud我们要调用远程服务
* 3）、在接口中声明调用哪个服务的那个请求（详情见com.atguigu.gulimall.member.feign下的接口例子）
* 4）、开启远程调用功能,GulimallMemberApplication （主类、入口）
* 声明@EnableFeignClients(basePackages = "com.atguigu.gulimall.member.feign")
* 参数路径意思为:远程调用的接口都在此路径下
* */

@MapperScan("com.atguigu.gulimall.member.dao")
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.atguigu.gulimall.member.feign")
public class GulimallMemberApplication {
    public static void main(String[] args) {
        SpringApplication.run(GulimallMemberApplication.class,args);
    }
}
