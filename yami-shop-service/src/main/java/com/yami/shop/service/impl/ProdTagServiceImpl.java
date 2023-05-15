

package com.yami.shop.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yami.shop.bean.model.ProdTag;
import com.yami.shop.dao.ProdTagMapper;
import com.yami.shop.service.ProdTagService;
import lombok.AllArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品分组标签
 */
@Service
@AllArgsConstructor
public class ProdTagServiceImpl extends ServiceImpl<ProdTagMapper, ProdTag> implements ProdTagService {

    private ProdTagMapper prodTagMapper;

    @Override
    @Cacheable(cacheNames = "prodTag", key = "'prodTag'")
    public List<ProdTag> listProdTag() {
        return prodTagMapper.selectList(new LambdaQueryWrapper<ProdTag>()
                .eq(ProdTag::getStatus, 1)
                .orderByDesc(ProdTag::getSeq));
    }

    @Override
    @CacheEvict(cacheNames = "prodTag", key = "'prodTag'")
    public void removeProdTag() {
    }
}
