package com.test;

import java.util.Date;

/**
 * 类备注：
 *
 * @author Administrator
 * @version 1.0
 * @date 2018-01-30 17:25
 * @desc
 * @since 1.8
 */
public class Car {

    private Integer id;

    private String name;

    private String color;

    private Date buyTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getBuyTime() {
        return buyTime;
    }

    public void setBuyTime(Date buyTime) {
        this.buyTime = buyTime;
    }
}
