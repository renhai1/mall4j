

package com.yami.shop.common.config;

import cn.hutool.crypto.symmetric.AES;
import com.yami.shop.common.bean.ALiDaYu;
import com.yami.shop.common.bean.Qiniu;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@AllArgsConstructor
public class ShopBeanConfig {

	private final ShopBasicConfig shopBasicConfig;

    @Bean
    public Qiniu qiniu() {
    	return shopBasicConfig.getQiniu();
    }

    @Bean
    public AES tokenAes() {
    	return new AES(shopBasicConfig.getTokenAesKey().getBytes());
    }

    @Bean
    public ALiDaYu aLiDaYu () {
    	return shopBasicConfig.getALiDaYu();
    }
}
