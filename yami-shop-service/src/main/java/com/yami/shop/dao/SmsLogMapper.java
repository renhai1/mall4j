

package com.yami.shop.dao;

import org.apache.ibatis.annotations.Param;

import com.yami.shop.bean.model.SmsLog;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface SmsLogMapper extends BaseMapper<SmsLog> {

	void invalidSmsByMobileAndType(@Param("mobile") String mobile, @Param("type") Integer type);
}