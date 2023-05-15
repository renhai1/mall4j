package com.yami.shop.security.api.adapter;

import com.yami.shop.security.common.adapter.DefaultAuthConfigAdapter;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;


@Component
public class ResourceServerAdapter extends DefaultAuthConfigAdapter {

    @Override
    public List<String> pathPatterns() {
        return Collections.singletonList("/p/*");
    }
}
