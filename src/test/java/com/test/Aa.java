package com.test;

/**
 * 类备注：
 *
 * @author Administrator
 * @version 1.0
 * @date 2018-01-29 17:13
 * @desc
 * @since 1.8
 */
public class Aa {

    // 构造方法为private
    private Aa(){

        System.out.println("Aa构造器被调用");
    }

    private static String aa = "default";

    static {

        System.out.println("Aa静态块初始化");
        aa = "static";
    }

    public static void setaa() {

        System.out.println("Aa静态方法初始化");
        aa = "setStatic";
    }

    public void sayAa() {

        System.out.println("Aa的值为：" + aa);
    }
}
