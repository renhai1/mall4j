

package com.yami.shop.dao;

import com.yami.shop.bean.model.Message;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface MessageMapper extends BaseMapper<Message> {

	void deleteByIds(Long[] ids);
}