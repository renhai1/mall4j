

package com.yami.shop.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yami.shop.bean.model.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper extends BaseMapper<User> {

	User getUserByUserMail(@Param("userMail") String userMail);

	User selectOneByUserName(@Param("userName") String userName);
}
