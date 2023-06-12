package com.yami.shop.security.admin.adapter;

import com.yami.shop.security.common.adapter.DefaultAuthConfigAdapter;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;


@Component
public class ResourceServerAdapter extends DefaultAuthConfigAdapter {
    public static final List<String> EXCLUDE_PATH = Arrays.asList(
            "/webjars/**",
            "/swagger/**",
            "/v2/api-docs",
            "/doc.html",
            "/swagger-ui.html",
            "/swagger-resources/**",
            "/captcha/**",
            "/adminLogin");

    @Override
    public List<String> excludePathPatterns() {
        return EXCLUDE_PATH;
    }
}
