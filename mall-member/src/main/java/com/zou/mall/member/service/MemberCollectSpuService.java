package com.zou.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zou.common.utils.PageUtils;
import com.zou.mall.member.entity.MemberCollectSpuEntity;

import java.util.Map;

/**
 * 会员收藏的商品
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-09-08 17:35:07
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

