package com.atguigu.gulimall.member.feign;

import com.atguigu.gulimall.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
/*
* 这是一个声明式的远程调用
* */
@FeignClient("gulimall-coupon")
public interface CouponFeignService {
    /*
     * feign 测试调用，获取会员的优惠券
     */
    @RequestMapping("/coupon/coupon/member/list")
    public R memberCoupons();
}
