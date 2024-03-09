package com.jj.wrapper.bigIntegerAndBigDecimal;

import java.math.BigInteger;

/**
 * @author: xj
 * @description:
 * @dateTime: 2024/3/9 15:49
 **/
public class BigInteger_ {
    public static void main(String[] args) {
        //当我们编程中，需要使用很大的整数，long不够用
        //可以快速使用BigInteger的类来搞定
//        long l=23333333333333333333333333333333333333;//整数过大
        BigInteger bigInteger = new BigInteger("3333333333333333333333333333333333333");
        BigInteger bigInteger2 = new BigInteger("3333333333333333333333333333333333333");
        //1. 在对BigInteger进行加减乘除时，需要使用相应的方法，不能使用+-*/
        //2. 可以创建一个要操作的bigInteger然后进行相应的操作
        BigInteger add = bigInteger.add(bigInteger2);
        System.out.println("add "+add);
//        System.out.println(add.getClass());
        BigInteger subtract = bigInteger.subtract(bigInteger2);
        System.out.println("subtract "+subtract);//减

        BigInteger multiply = bigInteger.multiply(bigInteger2);//乘
        System.out.println("multiply "+multiply);

        BigInteger divide = bigInteger.divide(bigInteger2);
        System.out.println("divide "+divide);
    }
}
