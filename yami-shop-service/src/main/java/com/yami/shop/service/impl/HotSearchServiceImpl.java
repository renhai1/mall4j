

package com.yami.shop.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yami.shop.bean.dto.HotSearchDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.yami.shop.bean.model.HotSearch;
import com.yami.shop.dao.HotSearchMapper;

import com.yami.shop.service.HotSearchService;

import java.util.List;


@Service
public class HotSearchServiceImpl extends ServiceImpl<HotSearchMapper, HotSearch> implements HotSearchService {

    @Autowired
    private HotSearchMapper hotSearchMapper;

    @Override
    @Cacheable(cacheNames = "HotSearchDto", key = "#shopId")
    public List<HotSearchDto> getHotSearchDtoByshopId(Long shopId) {
        return hotSearchMapper.getHotSearchDtoByShopId(shopId);
    }

    @Override
    @CacheEvict(cacheNames = "HotSearchDto", key = "#shopId")
    public void removeHotSearchDtoCacheByshopId(Long shopId) {

    }
}
