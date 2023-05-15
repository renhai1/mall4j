

package com.yami.shop.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

/**
 * MapperFacade 用于dto ->entity的转换
 * @author lgh
 */
@Configuration
public class OrikaConfig {

	@Bean
	public MapperFactory mapperFactory() {
		return new DefaultMapperFactory.Builder().build();
	}
	
	@Bean
	public MapperFacade mapperFacade() {
		return mapperFactory().getMapperFacade();
	} 
}
