package com.zou.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zou.common.utils.PageUtils;
import com.zou.mall.coupon.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-09-08 17:33:30
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

