package com.zou.mall.ware.dao;

import com.zou.mall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-09-08 17:35:52
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
