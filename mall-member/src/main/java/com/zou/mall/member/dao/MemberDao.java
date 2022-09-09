package com.zou.mall.member.dao;

import com.zou.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-09-08 17:35:07
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
