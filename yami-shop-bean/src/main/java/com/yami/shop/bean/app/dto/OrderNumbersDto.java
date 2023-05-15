

package com.yami.shop.bean.app.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class OrderNumbersDto {

	@ApiModelProperty(value = "多个订单号拼接的字符串",required=true)
	private String orderNumbers;

	public OrderNumbersDto(String orderNumbers) {
		this.orderNumbers = orderNumbers;
	}
}
