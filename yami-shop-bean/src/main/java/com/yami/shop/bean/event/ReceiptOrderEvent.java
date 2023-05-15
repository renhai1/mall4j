

package com.yami.shop.bean.event;

import com.yami.shop.bean.model.Order;
import lombok.AllArgsConstructor;
import lombok.Data;


/**
 * 确认收货的事件
 * @author
 */
@Data
@AllArgsConstructor
public class ReceiptOrderEvent {

    private Order order;
}
