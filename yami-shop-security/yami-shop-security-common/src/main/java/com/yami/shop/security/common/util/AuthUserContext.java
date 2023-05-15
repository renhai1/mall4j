
package com.yami.shop.security.common.util;


import com.alibaba.ttl.TransmittableThreadLocal;
import com.yami.shop.security.common.bo.UserInfoInTokenBO;


public class AuthUserContext {

    private static final ThreadLocal<UserInfoInTokenBO> USER_INFO_IN_TOKEN_HOLDER = new TransmittableThreadLocal<>();

    public static UserInfoInTokenBO get() {
        return USER_INFO_IN_TOKEN_HOLDER.get();
    }

    public static void set(UserInfoInTokenBO userInfoInTokenBo) {
        USER_INFO_IN_TOKEN_HOLDER.set(userInfoInTokenBo);
    }

    public static void clean() {
        if (USER_INFO_IN_TOKEN_HOLDER.get() != null) {
            USER_INFO_IN_TOKEN_HOLDER.remove();
        }
    }
}
