

package com.yami.shop.bean.event;

import com.yami.shop.bean.app.dto.ShopCartItemDto;
import com.yami.shop.bean.app.dto.ShopCartOrderDto;
import com.yami.shop.bean.app.dto.ShopCartOrderMergerDto;
import com.yami.shop.bean.app.param.OrderParam;
import com.yami.shop.bean.model.Order;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * 提交订单时的事件
 * @author LGH
 */
@Data
@AllArgsConstructor
public class SubmitOrderEvent {
    /**
     * 完整的订单信息
     */
    private final ShopCartOrderMergerDto mergerOrder;

    private List<Order> orders;

}
