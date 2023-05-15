

package com.yami.shop.bean.model;

import java.io.Serializable;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

@Data
@TableName("tz_login_hist")
public class LoginHist implements Serializable {
    /**
     * ID
     */
    @TableId

    private Long id;

    /**
     * 地区
     */
    private String area;

    /**
     * 国家
     */
    private String country;

    /**
     * 用户id
     */

    private String userId;

    /**
     * IP
     */
    private String ip;

    /**
     * 时间
     */

    private Date loginTime;

}