package com.zou.mall.product.dao;

import com.zou.mall.product.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-09-08 17:35:52
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
