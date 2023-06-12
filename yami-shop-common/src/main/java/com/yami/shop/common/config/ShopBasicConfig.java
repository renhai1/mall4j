

package com.yami.shop.common.config;

import com.yami.shop.common.bean.ALiDaYu;
import com.yami.shop.common.bean.Qiniu;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


/**
 * 商城配置文件
 */
@Data
@Component
@PropertySource("classpath:shop.properties")
@ConfigurationProperties(prefix = "shop")
public class ShopBasicConfig {

	/**
	 * 七牛云的配置信息
	 */
	private Qiniu qiniu;

	/**
	 * 阿里大于短信平台
	 */
	private ALiDaYu aLiDaYu;

	/**
	 * 用于加解密token的密钥
	 */
	private String tokenAesKey;

}
