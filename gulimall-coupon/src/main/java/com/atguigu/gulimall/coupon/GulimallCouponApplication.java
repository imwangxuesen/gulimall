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
*
*
*
* 2,细节
* 1),命名空间：配置隔离：
*   默认：public（保留空间）；默认新增的所有配置都在public空间。
*   1、开发，测试，生产: 利用命名空间来环境隔离。
*       注意：在bootstrap.properties；配置上，需要使用哪个命名空间下的配置，
*       spring.cloud.nacos.config.namespace=4b95c983-0cbf-4cc3-a939-73845a1e7fe3
*   2、每一个微服务之间互相隔离配置，每一个微服务都创建自己的命名空间，只加载在自己命名空间下的所有配置
* 2）、配置集： 所有的配置的集合
* 3）、配置集id：类似文件名，DataID
* 4）、配置分组：默认所有的配置集都属于:DEFAULT_GROUP; 我们可以自定义分组，比如双十一专用分组，如果说命名空间用来隔离微服务，
* 分组就可以拿来分场景配置
* */

@MapperScan("com.atguigu.gulimall.coupon.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class GulimallCouponApplication {
    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class,args);
    }
}
