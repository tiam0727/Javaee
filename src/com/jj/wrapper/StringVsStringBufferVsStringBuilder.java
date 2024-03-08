package com.jj.wrapper;

/**
 * @author: xj
 * @description: String、StringBuffer 和 StringBuilder 的效率测试
 * @dateTime: 2024/3/8 11:42
 **/
public class StringVsStringBufferVsStringBuilder {
    public static void main(String[] args) {
        long startTime = 0L;
        long endTime = 0L;
        StringBuffer buffer = new StringBuffer("");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 80000; i++) {//StringBuffer 拼接 20000 次
            buffer.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer 的执行时间：" + (endTime - startTime));

        StringBuilder builder = new StringBuilder("");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 80000; i++) {//StringBuilder 拼接 20000 次
            builder.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder 的执行时间：" + (endTime - startTime));

        String text = "";
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 80000; i++) {//String 拼接 20000
            text = text + i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("String 的执行时间：" + (endTime - startTime));
    }
}
