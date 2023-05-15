
package com.yami.shop.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yami.shop.bean.model.ProdTagReference;
import com.yami.shop.dao.ProdTagReferenceMapper;
import com.yami.shop.service.ProdTagReferenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 分组标签引用
 *
 */
@Service
public class ProdTagReferenceServiceImpl extends ServiceImpl<ProdTagReferenceMapper, ProdTagReference> implements ProdTagReferenceService {

    @Autowired
    private ProdTagReferenceMapper prodTagReferenceMapper;

    @Override
    public List<Long> listTagIdByProdId(Long prodId) {
        return prodTagReferenceMapper.listTagIdByProdId(prodId);
    }
}
