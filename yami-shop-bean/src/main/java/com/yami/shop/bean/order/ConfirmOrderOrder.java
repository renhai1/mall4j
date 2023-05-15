

package com.yami.shop.bean.order;

/**
 * 提交订单事件先后顺序
 * @author LGH
 */
public interface ConfirmOrderOrder {

    /**
     * 没有任何活动时的顺序
     */
    int DEFAULT = 0;

    /**
     * 满减，排在DEFAULT后面
     */
    int DISCOUNT = 100;

    /**
     * 优惠券，排在DISCOUNT后面
     */
    int COUPON = 200;

    /**
     * 分销，排在COUPON后面
     */
    int DISTRIBUTION = 300;
}
