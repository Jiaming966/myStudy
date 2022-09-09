package com.zou.mall.coupon.dao;

import com.zou.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-09-08 17:33:30
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
