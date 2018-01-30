package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.Test;

/**
 * 类备注：
 *
 * @author Administrator
 * @version 1.0
 * @date 2018-01-30 23:51
 * @desc
 * @since 1.8
 */

public class AnnotationConfigApplicationContexeTest {

    @Test
    public void annotationTest(){

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Beans.class);

        Car car = applicationContext.getBean("car", Car.class);

        System.out.println(car.getName());
    }
}
