package com.jj.wrapper.stringbuffer_;

/**
 * @author: xj
 * @description:
 * @dateTime: 2024/3/8 10:46
 **/
public class StringBuffer02 {
    public static void main(String[] args) {
        //构造器
        //创建一个大小为16的cahr[ ] 数组 用于存放字符串
        StringBuffer stringBuffer = new StringBuffer();

        //2 通过构造器指定char[] 的大小
        StringBuffer stringBuffer1 = new StringBuffer(100);
        //3 通过给一个String 创建StringBuffer
        String s="abc";
        StringBuffer stringBuffer2 = new StringBuffer(s);
    }
}
