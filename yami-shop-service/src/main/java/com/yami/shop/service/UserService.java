

package com.yami.shop.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yami.shop.bean.model.User;
import com.yami.shop.bean.param.UserRegisterParam;


public interface UserService extends IService<User> {

    User getUserByUserId(String userId);

    void validate(UserRegisterParam userRegisterParam, String checkRegisterSmsFlag);
}
