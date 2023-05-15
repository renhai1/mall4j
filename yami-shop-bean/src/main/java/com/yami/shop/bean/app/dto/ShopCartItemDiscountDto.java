

package com.yami.shop.bean.app.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class ShopCartItemDiscountDto implements Serializable {


    @ApiModelProperty(value = "已选满减项", required = true)
    private ChooseDiscountItemDto chooseDiscountItemDto;

    @ApiModelProperty(value = "商品列表")
    private List<ShopCartItemDto> shopCartItems;
}
