

package com.yami.shop.dao;

import com.yami.shop.bean.model.ShopDetail;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface ShopDetailMapper extends BaseMapper<ShopDetail> {

    Integer getIsDistributionByShopId(Long shopId);
}