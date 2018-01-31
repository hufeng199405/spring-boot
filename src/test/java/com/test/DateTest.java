package com.test;

import org.testng.annotations.Test;

import java.util.Date;

/**
 * 类备注：
 *
 * @author Administrator
 * @version 1.0
 * @date 2018-01-31 9:53
 * @desc
 * @since 1.8
 */
public class DateTest {

    @Test
    public void sqlDateTest(){

        long time = System.currentTimeMillis();

        java.sql.Date date = new java.sql.Date(time);

        Date utilDate = date;

        System.out.println(time);
        System.out.print(utilDate.getTime());
    }
}
