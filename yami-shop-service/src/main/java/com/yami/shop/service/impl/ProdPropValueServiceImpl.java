

package com.yami.shop.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yami.shop.bean.model.ProdPropValue;
import com.yami.shop.dao.ProdPropValueMapper;
import com.yami.shop.service.ProdPropValueService;


@Service
public class ProdPropValueServiceImpl extends ServiceImpl<ProdPropValueMapper, ProdPropValue> implements ProdPropValueService {

    @Autowired
    private ProdPropValueMapper prodPropValueMapper;

}
