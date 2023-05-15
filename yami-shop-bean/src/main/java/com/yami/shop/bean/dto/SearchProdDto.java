

package com.yami.shop.bean.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.yami.shop.common.serializer.json.ImgJsonSerializer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@Data
@ApiModel("搜索商品数据")
public class SearchProdDto {

    @ApiModelProperty(value = "商品id")
    private Long prodId;

    @ApiModelProperty(value = "商品照片")
    @JsonSerialize(using = ImgJsonSerializer.class)
    private String pic;

    @ApiModelProperty(value = "商品名字")
    private String prodName;

    @ApiModelProperty(value = "商品价格")
    private Double price;

    @ApiModelProperty(value = "商品评论数量")
    private Integer prodCommNumber;

    @ApiModelProperty(value = "好评率")
    private Double positiveRating;

    @ApiModelProperty(value = "好评数量")
    private Integer praiseNumber;

}
