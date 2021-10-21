package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author fff
 * @email fff@gmail.com
 * @date 2021-10-20 14:44:25
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
