
package com.yami.shop.service;

import com.yami.shop.bean.app.param.PayParam;
import com.yami.shop.bean.pay.PayInfoDto;

import java.util.List;


public interface PayService {


    PayInfoDto pay(String userId, PayParam payParam);

    List<String> paySuccess(String payNo, String bizPayNo);

}
