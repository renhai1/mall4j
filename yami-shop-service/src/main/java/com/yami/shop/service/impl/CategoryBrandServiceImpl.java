

package com.yami.shop.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yami.shop.bean.model.CategoryBrand;
import com.yami.shop.dao.CategoryBrandMapper;
import com.yami.shop.service.CategoryBrandService;


@Service
public class CategoryBrandServiceImpl extends ServiceImpl<CategoryBrandMapper, CategoryBrand> implements CategoryBrandService {

    @Autowired
    private CategoryBrandMapper categoryBrandMapper;

}
