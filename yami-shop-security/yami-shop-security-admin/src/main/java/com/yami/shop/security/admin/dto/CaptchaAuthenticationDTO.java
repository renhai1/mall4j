package com.yami.shop.security.admin.dto;

import com.yami.shop.security.common.dto.AuthenticationDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@Data
public class CaptchaAuthenticationDTO extends AuthenticationDTO {

    @ApiModelProperty(value = "验证码", required = true)
    private String captchaVerification;
}
