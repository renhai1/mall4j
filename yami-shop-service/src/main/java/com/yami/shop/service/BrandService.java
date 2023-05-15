
package com.yami.shop.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yami.shop.bean.model.Brand;

import java.util.List;


public interface BrandService extends IService<Brand> {

	/**
	 * 根据品牌名称获取该品牌
	 * @param brandName
	 * @return
	 */
	Brand getByBrandName(String brandName);

	/**
	 * 删除品牌，同时删除品牌与分类之间的关联关系
	 * @param brandId
	 */
	void deleteByBrand(Long brandId);

	/**
	 * 根据分类id获取品牌列表
	 * @param categoryId 分类id
	 * @return
	 */
	List<Brand> listByCategoryId(Long categoryId);

}
