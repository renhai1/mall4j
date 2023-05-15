

package com.yami.shop.quartz.event;

import com.yami.shop.quartz.model.ScheduleJob;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 定时任务事件
 */
@Getter
@AllArgsConstructor
public class ScheduleJobEvent {

	private final ScheduleJob scheduleJob;
}
