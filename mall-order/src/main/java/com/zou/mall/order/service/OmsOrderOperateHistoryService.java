package com.zou.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zou.common.utils.PageUtils;
import com.zou.mall.order.entity.OmsOrderOperateHistoryEntity;

import java.util.Map;

/**
 * 订单操作历史记录
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-09-08 17:17:42
 */
public interface OmsOrderOperateHistoryService extends IService<OmsOrderOperateHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

