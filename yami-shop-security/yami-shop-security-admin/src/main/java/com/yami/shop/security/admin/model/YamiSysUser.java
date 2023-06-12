
package com.yami.shop.security.admin.model;

import lombok.Data;

import java.util.Set;

@Data
public class YamiSysUser {

    /**
     * 用户ID
     */
    private Long userId;

    private boolean enabled;

    private Set<String> authorities;

    private String username;

    private Long shopId;
}
