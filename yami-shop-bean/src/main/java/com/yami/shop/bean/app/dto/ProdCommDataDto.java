

package com.yami.shop.bean.app.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@ApiModel("商品评论数据")
@Data
public class ProdCommDataDto {

    @ApiModelProperty(value = "好评率")
    private Double positiveRating;

    @ApiModelProperty(value = "评论数量")
    private Integer number;

    @ApiModelProperty(value = "好评数")
    private Integer praiseNumber;

    @ApiModelProperty(value = "中评数")
    private Integer secondaryNumber;

    @ApiModelProperty(value = "差评数")
    private Integer negativeNumber;

    @ApiModelProperty(value = "有图数")
    private Integer picNumber;

}
