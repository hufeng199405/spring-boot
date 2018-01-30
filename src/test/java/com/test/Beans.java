package com.test;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

import java.util.Date;

/**
 * 类备注：
 *
 * @author Administrator
 * @version 1.0
 * @date 2018-01-31 0:21
 * @desc
 * @since 1.8
 */

@Configurable
public class Beans {

    // 声明一个bean的build方法
    @Bean(name = "car")
    public Car buildCar(){

        Car car = new Car();

        car.setId(1);
        car.setName("这是一个测试");
        car.setColor("红色");
        car.setBuyTime(new Date());

        return car;
    }
}
