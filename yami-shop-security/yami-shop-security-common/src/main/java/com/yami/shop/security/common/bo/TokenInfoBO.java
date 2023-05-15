
package com.yami.shop.security.common.bo;


import lombok.Data;

/**
 * token信息，该信息存在redis中
 */
@Data
public class TokenInfoBO {

    /**
     * 保存在token信息里面的用户信息
     */
    private UserInfoInTokenBO userInfoInToken;

    private String accessToken;

    private String refreshToken;

    /**
     * 在多少秒后过期
     */
    private Integer expiresIn;

}
