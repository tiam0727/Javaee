package com.jj;

import org.junit.jupiter.api.Test;

/**
 * @author: xj
 * @description: 单元测试框架
 * @dateTime: 2024/3/19 19:27
 **/
public class JUnit_ {
    public static void main(String[] args) {
        //传统方式
        //new JUnit_().m1();
        //new JUnit_().m2();

    }
    @Test
    public void m1(){
        System.out.println("m1方法被调用");
    }
    @Test
    public void m2(){
        System.out.println("m2方法被调用");
    }
}

