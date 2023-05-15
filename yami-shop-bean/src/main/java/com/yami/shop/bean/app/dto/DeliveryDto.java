

package com.yami.shop.bean.app.dto;

import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class DeliveryDto {

	@ApiModelProperty(value = "物流公司名称",required=true)
	private String companyName;
	
	@ApiModelProperty(value = "物流公司官网",required=true)
	private String companyHomeUrl;
	
	@ApiModelProperty(value = "物流订单号",required=true)
	private String dvyFlowId;
	
	@ApiModelProperty(value = "查询出的物流信息",required=true)
	private List<DeliveryInfoDto> data;

}
