package com.atguigu.gulimall.product.service;

import com.atguigu.gulimall.product.entity.SkuSaleAttrValueEntity;
import com.atguigu.gulimall.common.utils.PageUtils;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gulimall.common.utils.PageUtils;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author WangXuesen
 * @email imwangxuesen@163.com
 * @date 2020-07-30 16:16:07
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

