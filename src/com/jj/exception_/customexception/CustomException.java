package com.jj.exception_.customexception;

/**
 * @author: xj
 * @description: 自定义异常
 * @dateTime: 2024/3/5 17:25
 **/

public class CustomException {
    public static void main(String[] args) {
//        int age = 80;
        int age = 121;
        if (!(age >= 18 && age <= 120)) {
            throw new AgeException("年龄需要在18到120之间");
        }
        System.out.println("你的年龄正确");
    }
}
//自定义一个异常

/**
 * 一般情况下我们自定义异常是继承RuntimeException
 * 即定义为运行时异常，好处是，我们可以使用默认的处理机制，方便！！！
 */
class AgeException extends RuntimeException {
    public AgeException(String message) {
        super(message);
    }
}
