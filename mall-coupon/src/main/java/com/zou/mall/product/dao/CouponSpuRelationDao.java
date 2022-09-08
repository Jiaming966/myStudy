package com.zou.mall.product.dao;

import com.zou.mall.product.entity.CouponSpuRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-09-08 17:33:30
 */
@Mapper
public interface CouponSpuRelationDao extends BaseMapper<CouponSpuRelationEntity> {
	
}