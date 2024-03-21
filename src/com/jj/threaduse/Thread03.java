package com.jj.threaduse;

/**
 * @author: xj
 * @description: main 线程启动两个子线程
 * @dateTime: 2024/3/21 16:46
 **/
public class Thread03 {
    /**
     * 请编写一个程序，创建两个线程，一个线程每隔1秒输出“hello,world”,输出10次，退出，一个线程每隔1秒输出“hi”,输出5次退出
     */

    public static void main(String[] args) {

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (i++ < 10) {
                    System.out.println("hello,world");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (i++ < 5) {
                    System.out.println("hi");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        thread1.start();
        thread2.start();
    }
}
