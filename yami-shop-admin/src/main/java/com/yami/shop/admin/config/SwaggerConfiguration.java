
package com.yami.shop.admin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.context.annotation.Profile;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger文档，只有在测试环境才会使用
 *
 * @author renhai
 * @date 2023/5/3
 */
//@Profile("dev")
@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("基础版")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.yami.shop.admin"))
                .paths(PathSelectors.any())
                .build();
    }

    @Bean
    public ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("在线智慧商城管理系统接口文档")
                .description("在线智慧商城接口文档Swagger版")
                .termsOfServiceUrl("https://github.com/renhai1/mall4j")
                .contact(new Contact("sherry", "https://github.com/renhai1/mall4j", ""))
                .version("1.0")
                .build();
    }
}