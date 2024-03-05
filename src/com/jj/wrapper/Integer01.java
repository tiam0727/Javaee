package com.jj.wrapper;

/**
 * @author: xj
 * @description:
 * @dateTime: 2024/3/5 19:23
 **/
public class Integer01 {
    public static void main(String[] args) {
        int n1 = 100;
        //手动装箱
        Integer integer1 = Integer.valueOf(n1);
        //手动拆箱
        int i = integer1.intValue();
        //jdk5以后 就可以实现自动装箱和自动拆箱
        Integer integer2 = n1;
        int n2 = integer2;//底层使用的就是integer2.intValue
    }
}
