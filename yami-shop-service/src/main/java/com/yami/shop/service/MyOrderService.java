

package com.yami.shop.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yami.shop.bean.app.dto.MyOrderDto;
import com.yami.shop.bean.model.Order;

/**
 * 我的订单
 */
public interface MyOrderService extends IService<Order> {

	/**
	 * 通过用户id和订单状态分页获取订单信息
	 * @param page   分页参数
	 * @param userId 用户id
	 * @param status 订单状态
	 * @return
	 */
	IPage<MyOrderDto> pageMyOrderByUserIdAndStatus(Page<MyOrderDto> page, String userId, Integer status);
}
