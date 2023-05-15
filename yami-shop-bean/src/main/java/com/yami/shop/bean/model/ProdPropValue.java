

package com.yami.shop.bean.model;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

@Data
@TableName("tz_prod_prop_value")
public class ProdPropValue implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 6604406039354172708L;

	/**
     * 属性值ID
     */
    @TableId

    private Long valueId;

    /**
     * 属性值名称
     */

    private String propValue;

    /**
     * 属性ID
     */

    private Long propId;

}