package com.test;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.context.support.ServletContextResource;
import org.testng.annotations.Test;

/**
 * 类备注：
 *
 * @author Administrator
 * @version 1.0
 * @date 2018-01-29 22:45
 * @desc
 * @since 1.8
 */

public class ClassPathTest {

    @Test
    public void servletTest() throws Exception{

        Resource resource = new ClassPathResource("test.txt");

        EncodedResource encodedResource = new EncodedResource(resource, "utf-8");

        String value = FileCopyUtils.copyToString(encodedResource.getReader());

        System.out.println(value);
    }
}
