package com.jj.threaduse.method;

/**
 * @author: xj
 * @description: 线程常用方法
 * @dateTime: 2024/3/21 18:39
 **/
public class ThreadMethod01 {
    public static void main(String[] args) {
        T t = new T();
        t.setName("tpc");
        t.setPriority(Thread.MIN_PRIORITY);
        t.start();
        for (int i = 0; i < 5; i++) {//主线程打印，中断子线程的休眠
            System.out.println("hi"+i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("主线程的优先级 "+Thread.currentThread().getPriority());//主线程的优先级 5
        t.interrupt();//
    }
}

class T extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " 吃大便");
        }

        try {
            System.out.println(Thread.currentThread().getName() + " 休眠中-----");
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            System.out.println("被中断");
        }

    }
}