

package com.yami.shop.bean.vo;

import lombok.Data;

@Data
public class UserVO {

    /**
     * 用户id
     */
    private String userId;

    /**
     * 用户昵称
     */
    private String nickName;

    private String userMobile;

    /**
     * 用户头像
     */
    private String pic;
}
