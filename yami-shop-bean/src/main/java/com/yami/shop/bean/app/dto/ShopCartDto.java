

package com.yami.shop.bean.app.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class ShopCartDto implements Serializable {

	@ApiModelProperty(value = "店铺ID", required = true)
	private Long shopId;

	@ApiModelProperty(value = "店铺名称", required = true)
	private String shopName;

	@ApiModelProperty(value = "购物车商品", required = true)
	private List<ShopCartItemDiscountDto> shopCartItemDiscounts;


}
