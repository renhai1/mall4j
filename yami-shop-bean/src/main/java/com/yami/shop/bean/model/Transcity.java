
package com.yami.shop.bean.model;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("tz_transcity")
public class Transcity implements Serializable {
    @TableId

    private Long transcityId;

    /**
     * 运费项id
     */

    private Long transfeeId;

    /**
     * 城市id
     */

    private Long cityId;

    /**
     * 城市名称
     */
    @TableField(exist=false)
    private String areaName;
}