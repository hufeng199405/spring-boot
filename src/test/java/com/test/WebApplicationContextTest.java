package com.test;

import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletContext;

/**
 * 类备注：
 *
 * @author Administrator
 * @version 1.0
 * @date 2018-01-31 19:57
 * @desc
 * @since 1.8
 */
public class WebApplicationContextTest {

    public void webApplicationTest(ServletContext servletContext){

        WebApplicationContext context = (WebApplicationContext)servletContext.getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
    }
}
