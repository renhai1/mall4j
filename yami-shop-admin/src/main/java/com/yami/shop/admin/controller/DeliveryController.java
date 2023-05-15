

package com.yami.shop.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yami.shop.bean.model.Delivery;
import com.yami.shop.service.DeliveryService;

/**
 * 快递信息分页检索
 *
 * @author renhai
 * @date 2023/5/3
 */
@RestController
@RequestMapping("/admin/delivery")
public class DeliveryController {

    @Autowired
    private DeliveryService deliveryService;

    /**
     * 分页获取
     */
    @GetMapping("/list")
    public ResponseEntity<List<Delivery>> page() {

        List<Delivery> list = deliveryService.list();
        return ResponseEntity.ok(list);
    }

}
