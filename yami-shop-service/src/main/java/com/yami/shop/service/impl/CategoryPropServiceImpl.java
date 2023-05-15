

package com.yami.shop.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yami.shop.bean.model.CategoryProp;
import com.yami.shop.dao.CategoryPropMapper;
import com.yami.shop.service.CategoryPropService;

@Service
public class CategoryPropServiceImpl extends ServiceImpl<CategoryPropMapper, CategoryProp> implements CategoryPropService {

    @Autowired
    private CategoryPropMapper categoryPropMapper;

}
