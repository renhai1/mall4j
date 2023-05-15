
package com.yami.shop.bean.model;

import java.io.Serializable;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

@Data
@TableName("tz_prod_img")
public class ProdImg implements Serializable {
    /**
     * 图片ID
     */
    @TableId

    private Long imgId;

    /**
     * 产品ID
     */

    private Long prodId;

    /**
     * skuID(商品通用图片 skuid为0)
     */

    private Long skuId;

    /**
     * 文件路径
     */

    private String imgPath;

    /**
     * 状态
     */
    private Byte status;

    /**
     * 顺序
     */
    private Integer seq;

}