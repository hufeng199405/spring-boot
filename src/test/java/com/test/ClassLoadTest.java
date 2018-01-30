package com.test;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * 类备注：
 *
 * @author Administrator
 * @version 1.0
 * @date 2018-01-29 17:11
 * @desc
 * @since 1.8
 */
public class ClassLoadTest {

    Logger logger = Logger.getLogger(this.getClass());

    @Test
    public void myTest(){

        // 获取类加载器
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

        try {

            // 加载Aa类
            Class cc1 = classLoader.loadClass("com.test.Aa");

            Class cc = Class.forName("com.test.Aa");

            // 获取当前的构造方法
            Constructor constructor = cc.getDeclaredConstructor();

            // 设置为可以访问
            constructor.setAccessible(true);

            // 通过类class实例化对象
            Aa aa = (Aa) constructor.newInstance();

            aa.sayAa();
        } catch (Exception e) {

            logger.error("加载类失败", e);
        }
    }
}
