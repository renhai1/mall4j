

package com.yami.shop.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yami.shop.bean.model.CategoryProp;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface CategoryPropMapper extends BaseMapper<CategoryProp> {

	void insertCategoryProp(@Param("categoryId") Long categoryId, @Param("propIds") List<Long> propIds);

	void deleteByCategoryId(Long categoryId);

	void deleteByPropId(Long propId);
}