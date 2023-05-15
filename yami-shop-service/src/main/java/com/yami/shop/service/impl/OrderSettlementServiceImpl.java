

package com.yami.shop.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yami.shop.bean.model.OrderSettlement;
import com.yami.shop.dao.OrderSettlementMapper;
import com.yami.shop.service.OrderSettlementService;


@Service
public class OrderSettlementServiceImpl extends ServiceImpl<OrderSettlementMapper, OrderSettlement> implements OrderSettlementService {

    @Autowired
    private OrderSettlementMapper orderSettlementMapper;

	@Override
	public void updateSettlementsByPayNo(String outTradeNo, String transactionId) {
		orderSettlementMapper.updateSettlementsByPayNo(outTradeNo, transactionId);
	}

}
