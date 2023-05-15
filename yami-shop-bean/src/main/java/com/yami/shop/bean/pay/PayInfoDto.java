

package com.yami.shop.bean.pay;

import lombok.Data;

/**
 * 支付信息
 * @author LGH
 */
@Data
public class PayInfoDto {

    /**
     * 支付信息，如商品名称
     */
    private String body;

    /**
     * 支付单号
     */
    private String payNo;

    /**
     * 付款金额
     */
    private Double payAmount;
}
