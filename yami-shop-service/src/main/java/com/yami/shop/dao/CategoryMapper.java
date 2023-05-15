

package com.yami.shop.dao;

import java.util.List;

import com.yami.shop.bean.model.Category;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface CategoryMapper extends BaseMapper<Category> {

	List<Category> listByParentId(Long parentId);

	List<Category> tableCategory(Long shopId);

	List<Category> listCategoryAndProdByShopId(Long shopId);
}