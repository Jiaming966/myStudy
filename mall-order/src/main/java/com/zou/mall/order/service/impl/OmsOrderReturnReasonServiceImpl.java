package com.zou.mall.order.service.impl;

import com.zou.mall.order.dao.OmsOrderReturnReasonDao;
import com.zou.mall.order.entity.OmsOrderReturnReasonEntity;
import com.zou.mall.order.service.OmsOrderReturnReasonService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zou.common.utils.PageUtils;
import com.zou.common.utils.Query;


@Service("omsOrderReturnReasonService")
public class OmsOrderReturnReasonServiceImpl extends ServiceImpl<OmsOrderReturnReasonDao, OmsOrderReturnReasonEntity> implements OmsOrderReturnReasonService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OmsOrderReturnReasonEntity> page = this.page(
                new Query<OmsOrderReturnReasonEntity>().getPage(params),
                new QueryWrapper<OmsOrderReturnReasonEntity>()
        );

        return new PageUtils(page);
    }

}