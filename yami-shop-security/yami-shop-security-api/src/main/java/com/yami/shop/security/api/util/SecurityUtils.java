
package com.yami.shop.security.api.util;

import com.yami.shop.common.util.HttpContextUtils;
import com.yami.shop.security.api.model.YamiUser;
import com.yami.shop.security.common.bo.UserInfoInTokenBO;
import com.yami.shop.security.common.util.AuthUserContext;
import lombok.experimental.UtilityClass;

/**
 * @author LGH
 */
@UtilityClass
public class SecurityUtils {

    private static final String USER_REQUEST = "/p/";

    /**
     * 获取用户
     */
    public YamiUser getUser() {
        if (!HttpContextUtils.getHttpServletRequest().getRequestURI().startsWith(USER_REQUEST)) {
            // 用户相关的请求，应该以/p开头！！！
            throw new RuntimeException("yami.user.request.error");
        }
        UserInfoInTokenBO userInfoInTokenBO = AuthUserContext.get();

        YamiUser yamiUser = new YamiUser();
        yamiUser.setUserId(userInfoInTokenBO.getUserId());
        yamiUser.setBizUserId(userInfoInTokenBO.getBizUserId());
        yamiUser.setEnabled(userInfoInTokenBO.getEnabled());
        yamiUser.setShopId(userInfoInTokenBO.getShopId());
        yamiUser.setStationId(userInfoInTokenBO.getOtherId());
        return yamiUser;
    }
}
