
package com.yami.shop.dao;

import com.yami.shop.bean.dto.HotSearchDto;
import com.yami.shop.bean.model.HotSearch;

import org.apache.ibatis.annotations.Param;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

public interface HotSearchMapper extends BaseMapper<HotSearch> {
    List<HotSearchDto> getHotSearchDtoByShopId(Long shopId);
}