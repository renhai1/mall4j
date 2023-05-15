

package com.yami.shop.bean.order;

/**
 * 购物车事件先后顺序
 * @author LGH
 */
public interface ShopCartEventOrder {

    /**
     * 没有任何活动时的顺序
     */
    int DEFAULT = 0;

    /**
     * 满减活动的组装顺序，排在DEFAULT后面
     */
    int DISCOUNT = 100;
}
