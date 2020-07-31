package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author WangXuesen
 * @email imwangxuesen@163.com
 * @date 2020-07-30 16:16:06
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
