package com.test;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.util.FileCopyUtils;
import org.testng.annotations.Test;

import java.io.InputStream;

/**
 * 类备注：通过资源加载器加载指定路径下的资源文件
 *
 * @author Administrator
 * @version 1.0
 * @date 2018-01-29 23:16
 * @desc
 * @since 1.8
 */

public class PatternResolverTest {

    @Test
    public void getResources() throws Exception{

        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();

        Resource[] resources = resolver.getResources("classpath*:**/*.properties");

        for (Resource resource:resources){

            EncodedResource encodedResource = new EncodedResource(resource,"UTF-8");

            String value = FileCopyUtils.copyToString(encodedResource.getReader());

            System.out.println(value);
        }
    }
}
