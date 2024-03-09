package com.jj.wrapper.bigIntegerAndBigDecimal;

import java.math.BigDecimal;

/**
 * @author: xj
 * @description: 高精度浮点数
 * @dateTime: 2024/3/9 16:04
 **/
public class BigDecimal_ {
    public static void main(String[] args) {
        double d = 19.666666666d;
//        double d1 = 19.6666666666666666666666666666666666666666666666666666666666666666666d;
        BigDecimal bigDecimal = new BigDecimal("19.6666666666666666666666666666666666666666666666666666666666666666666");
        BigDecimal bigDecimal1 = new BigDecimal("1.1");
        System.out.println(bigDecimal);

        //1. 在对bigDecimal进行加减乘除时，需要使用相应的方法，不能使用+-*/
        //2. 可以创建一个要操作的bigDecimal然后进行相应的操作
        System.out.println(bigDecimal.add(bigDecimal1));
        System.out.println(bigDecimal.subtract(bigDecimal1));
        System.out.println(bigDecimal.multiply(bigDecimal1));
//        System.out.println(bigDecimal.divide(bigDecimal1);//可能出现异常ArithmeticException 运算结果无限小数，可以通过指定精度解决
        //如果有无限循环小数，就会保留分子的精度
        System.out.println(bigDecimal.divide(bigDecimal1,BigDecimal.ROUND_CEILING));
    }
}
