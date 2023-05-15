

package com.yami.shop.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yami.shop.bean.app.dto.NoticeDto;
import com.yami.shop.bean.model.Notice;

/**
 * 公告管理
 */
public interface NoticeMapper extends BaseMapper<Notice> {

    Page<NoticeDto> pageNotice(Page<NoticeDto> page);
}
