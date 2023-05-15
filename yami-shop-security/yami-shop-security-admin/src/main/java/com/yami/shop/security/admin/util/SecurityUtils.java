
package com.yami.shop.security.admin.util;

import com.yami.shop.security.admin.model.YamiSysUser;
import com.yami.shop.security.common.bo.UserInfoInTokenBO;
import com.yami.shop.security.common.util.AuthUserContext;
import lombok.experimental.UtilityClass;

/**
 *
 * @author LGH
 */
@UtilityClass
public class SecurityUtils {
    /**
     * 获取用户
     */
    public YamiSysUser getSysUser() {
        UserInfoInTokenBO userInfoInTokenBO = AuthUserContext.get();

        YamiSysUser details = new YamiSysUser();
        details.setUserId(Long.valueOf(userInfoInTokenBO.getUserId()));
        details.setEnabled(userInfoInTokenBO.getEnabled());
        details.setUsername(userInfoInTokenBO.getNickName());
        details.setAuthorities(userInfoInTokenBO.getPerms());
        details.setShopId(userInfoInTokenBO.getShopId());
        return details;
    }
}

