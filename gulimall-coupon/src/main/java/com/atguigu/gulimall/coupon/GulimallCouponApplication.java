package com.atguigu.gulimall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/*
* 1,如何使用nacos作为配置中心统一管理配置
* 1）、引入nacos依赖 spring-cloud-starter-alibaba-nacos-config
* 2）、创建一个bootstrap.properties 在其中配置：
*   spring.application.name=gulimall-coupon
    spring.cloud.nacos.config.server-addr=127.0.0.1:8848
*   名字和ip根据实际情况来，ip为nacos服务器的地址
* 3）、需要给配置中心添加一个叫数据集（Data Id） gulimall-coupon.properties。默认规则：应用名.properties
* 4）、给应用名.properties添加任何配置
* 5）、动态获取配置 参考CouponController中的 @RefreshScope（动态获取并刷新配置） 和 @Value("${配置项的名字})
*     如果配置中心和当前应用的配置文件中都配置了相同的项，优先使用配置中心的配置。
* */

@MapperScan("com.atguigu.gulimall.coupon.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class GulimallCouponApplication {
    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class,args);
    }
}
