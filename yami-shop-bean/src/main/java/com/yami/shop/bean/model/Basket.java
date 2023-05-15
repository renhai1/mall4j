
package com.yami.shop.bean.model;

import java.io.Serializable;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

@Data
@TableName("tz_basket")
public class Basket implements Serializable {
    /**
     * 主键
     */
    @TableId

    private Long basketId;

    /**
     * 店铺ID
     */

    private Long shopId;

    /**
     * 产品ID
     */

    private Long prodId;

    /**
     * SkuID
     */

    private Long skuId;

    /**
     * 用户ID
     */

    private String userId;

    /**
     * 购物车产品个数
     */

    private Integer basketCount;

    /**
     * 购物时间
     */

    private Date basketDate;

    /**
     * 满减活动ID
     */
    private Long discountId;

    /**
     * 分销推广人卡号
     */
    private String distributionCardNo;
}