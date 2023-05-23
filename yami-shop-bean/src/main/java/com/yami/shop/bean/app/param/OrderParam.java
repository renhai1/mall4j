

package com.yami.shop.bean.app.param;

import java.util.List;

import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "订单参数")
public class OrderParam {


    @ApiModelProperty(value = "购物车id 数组")
    private List<Long> basketIds;

    @ApiModelProperty(value = "立即购买时提交的商品项")
    private OrderItemParam orderItem;

    @ApiModelProperty(value = "地址ID，0为默认地址", required = true)
    @NotNull(message = "地址不能为空")
    private Long addrId;

    @ApiModelProperty(value = "用户是否改变了优惠券的选择，如果用户改变了优惠券的选择，则完全根据传入参数进行优惠券的选择")
    private Integer userChangeCoupon;

    @ApiModelProperty(value = "优惠券id数组")
    private List<Long> couponIds;


}
