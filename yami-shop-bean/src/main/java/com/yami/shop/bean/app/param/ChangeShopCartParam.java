

package com.yami.shop.bean.app.param;

import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ChangeShopCartParam {

    @ApiModelProperty(value = "购物车ID", required = true)
    private Long basketId;

    @NotNull(message = "商品ID不能为空")
    @ApiModelProperty(value = "商品ID", required = true)
    private Long prodId;

    @NotNull(message = "skuId不能为空")
    @ApiModelProperty(value = "skuId", required = true)
    private Long skuId;

    @NotNull(message = "店铺ID不能为空")
    @ApiModelProperty(value = "店铺ID", required = true)
    private Long shopId;

    @NotNull(message = "商品个数不能为空")
    @ApiModelProperty(value = "商品个数", required = true)
    private Integer count;

    @ApiModelProperty(value = "分销推广人卡号")
    private String distributionCardNo;
}
