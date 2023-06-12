

package com.yami.shop.quartz.service.impl;

import com.yami.shop.quartz.dao.ScheduleJobLogMapper;
import com.yami.shop.quartz.model.ScheduleJobLog;
import com.yami.shop.quartz.service.ScheduleJobLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 */
@Service("scheduleJobLogService")
public class ScheduleJobLogServiceImpl extends ServiceImpl<ScheduleJobLogMapper, ScheduleJobLog> implements ScheduleJobLogService {

	@Autowired
	private ScheduleJobLogMapper scheduleJobLogMapper;

}
