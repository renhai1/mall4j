

package com.yami.shop.bean.app.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@ApiModel("收藏对象")
@Data
public class UserCollectionDto {

    @ApiModelProperty(value = "收藏id")
    private Long id;

    @ApiModelProperty(value = "商品名称")
    private String prodName;

    @ApiModelProperty(value = "收藏时间")
    private Date createTime;

}
