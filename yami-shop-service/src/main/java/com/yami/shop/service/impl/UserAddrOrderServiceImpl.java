

package com.yami.shop.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yami.shop.dao.UserAddrOrderMapper;
import org.springframework.stereotype.Service;

import com.yami.shop.bean.model.UserAddrOrder;
import com.yami.shop.service.UserAddrOrderService;

@Service
public class UserAddrOrderServiceImpl extends ServiceImpl<UserAddrOrderMapper, UserAddrOrder> implements UserAddrOrderService{

}
