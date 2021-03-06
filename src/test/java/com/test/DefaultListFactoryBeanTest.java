package com.test;

import com.blogger.user.domain.User;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.web.servlet.resource.ResourceResolver;
import org.testng.annotations.Test;

/**
 * 类备注：
 *
 * @author Administrator
 * @version 1.0
 * @date 2018-01-30 17:24
 * @desc
 * @since 1.8
 */
public class DefaultListFactoryBeanTest {

    @Test
    public void defaultListTest() throws Exception{

        // 读取xml文件资源
        ResourcePatternResolver loader = new PathMatchingResourcePatternResolver();

        Resource[] resources = loader.getResources("classpath*:*.xml");

        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

        // 创建一个bean reader
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);

        // 使用reader读取resource资源
        for (Resource resource : resources) {

            reader.loadBeanDefinitions(resources);
        }

        User user = factory.getBean("user", User.class);

        System.out.println(user.getUserName());
    }
}
