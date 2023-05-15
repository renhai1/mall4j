

package com.yami.shop.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yami.shop.bean.model.ProdPropValue;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface ProdPropValueMapper extends BaseMapper<ProdPropValue> {

	void insertPropValues(@Param("propId") Long propId, @Param("prodPropValues") List<ProdPropValue> prodPropValues);

	void deleteByPropId(@Param("propId") Long propId);
}