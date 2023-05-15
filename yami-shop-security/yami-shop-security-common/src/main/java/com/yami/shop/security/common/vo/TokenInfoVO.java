
package com.yami.shop.security.common.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * token信息，该信息用户返回给前端，前端请求携带accessToken进行用户校验
 */
@Data
public class TokenInfoVO {

    @ApiModelProperty("accessToken")
    private String accessToken;

    @ApiModelProperty("refreshToken")
    private String refreshToken;

    @ApiModelProperty("在多少秒后过期")
    private Integer expiresIn;
}
