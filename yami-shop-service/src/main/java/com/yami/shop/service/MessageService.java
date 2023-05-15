

package com.yami.shop.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yami.shop.bean.model.Message;


public interface MessageService extends IService<Message> {

	void deleteByIds(Long[] ids);

}
