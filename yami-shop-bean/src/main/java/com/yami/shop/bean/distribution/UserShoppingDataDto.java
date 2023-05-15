

package com.yami.shop.bean.distribution;

import lombok.Data;


/**
 * 用户购物数据
 */
@Data
public class UserShoppingDataDto {

    /**
     * 用户消费笔数
     */
    private Double expenseNumber;

    /**
     * 用户消费金额
     */
    private Double sumOfConsumption;
}
