package com.jj.throws_;

import java.io.FileInputStream;

/**
 * @author: 徐杰
 * @description: throws快速入门
 * @dateTime: 2024/3/5 16:59
 **/
public class Throws01 {
    public static void main(String[] args) {

    }
    public void f1() throws Exception{
        //创建了一个文件流对象
        /**
         * 这里是一个FileNotFoundException，编译异常
         * 1. 使用前面的try-catch-finally处理
         * 2. 使用throws,抛出异常，让调用f1方法的调用者处理
         * 2.1 throws后面的异常类型可以是方法中产生的异常类型，也可以是他的父类
         * 2.2 thows关键字后也可以是异常列表，即可以抛出多个异常 throws FileNotFoundException,NullPointException,...
         */
        FileInputStream fs = new FileInputStream("d://aa.txt");
    }
}
