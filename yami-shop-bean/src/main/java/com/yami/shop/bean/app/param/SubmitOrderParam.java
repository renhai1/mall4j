

package com.yami.shop.bean.app.param;

import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value= "提交订单参数")
public class SubmitOrderParam {
	@ApiModelProperty(value = "每个店铺提交的订单信息",required=true)
	private List<OrderShopParam> orderShopParam;
}
