

package com.yami.shop.common.filter;

import com.yami.shop.common.xss.XssWrapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 一些简单的安全过滤：
 * xss
 */
@Component
public class XssFilter implements Filter {
    Logger logger = LoggerFactory.getLogger(getClass().getName());
    
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException{
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;

        
        logger.info("uri:{}",req.getRequestURI());
        // xss 过滤
		chain.doFilter(new XssWrapper(req), resp);
    }

    @Override
    public void destroy() {

    }
}
