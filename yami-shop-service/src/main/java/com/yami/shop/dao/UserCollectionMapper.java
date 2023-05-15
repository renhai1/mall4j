

package com.yami.shop.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yami.shop.bean.app.dto.UserCollectionDto;
import com.yami.shop.bean.model.UserCollection;
import org.apache.commons.lang3.StringUtils;

/**
 * 用户收藏表
 */
public interface UserCollectionMapper extends BaseMapper<UserCollection> {
   IPage<UserCollectionDto> getUserCollectionDtoPageByUserId(Page page, String userId);

}
