

package com.yami.shop.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yami.shop.bean.model.Area;

import java.util.List;
import java.util.Map;


public interface AreaService extends IService<Area> {

    /**
     * 通过pid 查找地址接口
     *
     * @param pid 父id
     * @return
     */
    List<Area> listByPid(Long pid);

    /**
     * 通过pid 清除地址缓存
     *
     * @param pid
     */
    void removeAreaCacheByParentId(Long pid);

}
