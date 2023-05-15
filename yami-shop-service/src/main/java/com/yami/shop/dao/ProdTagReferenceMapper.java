

package com.yami.shop.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yami.shop.bean.model.ProdTag;
import com.yami.shop.bean.model.ProdTagReference;
import com.yami.shop.bean.model.Sku;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 分组标签引用
 */
public interface ProdTagReferenceMapper extends BaseMapper<ProdTagReference> {
    void insertBatch(@Param("shopId") Long shopId, @Param("prodId") Long prodId, @Param("tagList") List<Long> tagList);

    List<Long> listTagIdByProdId(@Param("prodId") Long prodId);

}
