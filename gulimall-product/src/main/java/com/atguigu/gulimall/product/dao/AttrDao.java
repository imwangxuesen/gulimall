package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author WangXuesen
 * @email imwangxuesen@163.com
 * @date 2020-07-30 16:16:07
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
