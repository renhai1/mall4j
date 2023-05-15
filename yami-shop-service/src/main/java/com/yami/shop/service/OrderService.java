

package com.yami.shop.service;

import java.util.Date;
import java.util.List;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yami.shop.bean.app.dto.OrderCountData;
import com.yami.shop.bean.app.dto.ShopCartOrderMergerDto;
import com.yami.shop.bean.model.Order;
import com.yami.shop.bean.param.OrderParam;

import cn.hutool.core.date.DateTime;

public interface OrderService extends IService<Order> {


    Order getOrderByOrderNumber(String orderNumber);

    ShopCartOrderMergerDto putConfirmOrderCache(String userId ,ShopCartOrderMergerDto shopCartOrderMergerDto);

    ShopCartOrderMergerDto getConfirmOrderCache(String userId);

    void removeConfirmOrderCache(String userId);

    List<Order> submit(String userId, ShopCartOrderMergerDto mergerOrder);

    void delivery(Order order);

    List<Order> listOrderAndOrderItems(Integer orderStatus, DateTime lessThanUpdateTime);

    void cancelOrders(List<Order> orders);

    void confirmOrder(List<Order> orders);

    List<Order> listOrdersDetialByOrder(Order order, Date startTime, Date endTime);

    IPage<Order> pageOrdersDetialByOrderParam(Page<Order> page, OrderParam orderParam);

    void deleteOrders(List<Order> orders);

    OrderCountData getOrderCount(String userId);
}
