

package com.yami.shop.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yami.shop.bean.enums.SmsType;
import com.yami.shop.bean.model.SmsLog;

import java.util.Map;


public interface SmsLogService extends IService<SmsLog> {

	void sendSms(SmsType smsType, String userId, String mobile, Map<String, String> params);
}
