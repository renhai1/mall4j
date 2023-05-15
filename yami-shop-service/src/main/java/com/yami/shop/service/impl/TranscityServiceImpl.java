

package com.yami.shop.service.impl;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yami.shop.bean.model.Transcity;
import com.yami.shop.dao.TranscityMapper;
import com.yami.shop.service.TranscityService;


@Service
public class TranscityServiceImpl extends ServiceImpl<TranscityMapper, Transcity> implements TranscityService {

    @Autowired
    private TranscityMapper transcityMapper;

}
