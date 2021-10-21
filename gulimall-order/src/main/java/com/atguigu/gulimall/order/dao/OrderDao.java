package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author fff
 * @email fff@gmail.com
 * @date 2021-10-21 14:21:14
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
