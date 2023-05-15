

package com.yami.shop.bean.model;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("tz_category_prop")
public class CategoryProp implements Serializable {
    @TableId

    private Long id;

    /**
     * 分类id
     */

    private Long categoryId;

    /**
     * 商品属性id即表tz_prod_prop中的prop_id
     */

    private Long propId;
}