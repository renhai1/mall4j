

package com.yami.shop.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.yami.shop.bean.app.dto.BasketItemDto;
import com.yami.shop.bean.app.dto.OrderItemDto;
import com.yami.shop.bean.app.param.ShopCartParam;
import org.apache.ibatis.annotations.Param;

import com.yami.shop.bean.app.dto.ShopCartItemDto;
import com.yami.shop.bean.model.Basket;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface BasketMapper extends BaseMapper<Basket> {

    List<ShopCartItemDto> getShopCartItems(@Param("userId") String userId);

    void deleteShopCartItemsByBasketIds(@Param("userId") String userId, @Param("basketIds") List<Long> basketIds);

    void deleteAllShopCartItems(@Param("userId") String userId);
    
    List<ShopCartItemDto> getShopCartExpiryItems(@Param("userId") String userId);

    void cleanExpiryProdList(@Param("userId") String userId);
    
    List<ShopCartItemDto> shopCartItemDtoList(@Param("basketIdList")List<Long> basketIdList);

    void updateDiscountItemId(@Param("userId")String userId, @Param("basketIdShopCartParamMap") Map<Long, ShopCartParam> basketIdShopCartParamMap);

    List<String> listUserIdByProdId(@Param("prodId")Long prodId);
    
}
