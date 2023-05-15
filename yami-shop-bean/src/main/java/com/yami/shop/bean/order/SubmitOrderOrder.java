

package com.yami.shop.bean.order;

/**
 * 提交订单事件先后顺序
 * @author LGH
 */
public interface SubmitOrderOrder {

    /**
     * 没有任何活动时的顺序
     */
    int DEFAULT = 0;

    /**
     * 优惠券，排在DEFAULT后面
     */
    int DISCOUNT = 100;

    /**
     * 优惠券，排在DEFAULT后面
     */
    int COUPON = 200;
}
