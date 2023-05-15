
package com.yami.shop.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yami.shop.bean.dto.HotSearchDto;
import com.yami.shop.bean.model.HotSearch;
import com.yami.shop.dao.HotSearchMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface HotSearchService extends IService<HotSearch> {

    List<HotSearchDto> getHotSearchDtoByshopId(Long shopId);

    void removeHotSearchDtoCacheByshopId(Long shopId);
}
