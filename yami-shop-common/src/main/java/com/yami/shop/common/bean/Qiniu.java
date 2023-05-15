

package com.yami.shop.common.bean;

import com.yami.shop.common.enums.QiniuZone;
import lombok.Data;

/**
 * 七牛云存储配置信息
 * @author lgh
 */
@Data
public class Qiniu {

	private String accessKey;

	private String secretKey;

	private String bucket;

	private String resourcesUrl;

	private QiniuZone zone;
}
