

package com.yami.shop.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yami.shop.bean.app.dto.ProdCommDataDto;
import com.yami.shop.bean.app.dto.ProdCommDto;
import com.yami.shop.bean.model.ProdComm;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

public interface ProdCommMapper extends BaseMapper<ProdComm> {
    ProdCommDataDto getProdCommDataByProdId(@Param("prodId") Long prodId);

    IPage<ProdCommDto> getProdCommDtoPageByProdId(@Param("page") Page page, @Param("prodId") Long prodId, @Param("evaluate") Integer evaluate);

    IPage<ProdCommDto> getProdCommDtoPageByUserId(Page page, @Param("userId") String userId);

    IPage<ProdComm> getProdCommPage(Page page, @Param("prodComm") ProdComm prodComm);
}
