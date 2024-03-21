package com.jj.threaduse;


/**
 * @author: xj
 * @description: 演示通过继承Thread类创建线程
 * @dateTime: 2024/3/21 16:00
 **/
public class Thread01 {
    public static void main(String[] args) throws InterruptedException {
        //创建Cat对象，可以当作线程使用
        Cat cat = new Cat();

        //public synchronized void start() {
        //
        //        if (threadStatus != 0)
        //            throw new IllegalThreadStateException();
        //        group.add(this);
        //
        //        boolean started = false;
        //        try {
        //            start0();
        //            started = true;
        //        } finally {
        //            try {
        //                if (!started) {
        //                    group.threadStartFailed(this);
        //                }
        //            } catch (Throwable ignore) {
        //                /* do nothing. If start0 threw a Throwable then
        //                  it will be passed up the call stack */
        //            }
        //        }
        //    }

        /**
         * start0() 是本地方法，是 JVM 调用, 底层是 c/c++实现
         * 真正实现多线程的效果， 是 start0(), 而不是 run
         * private native void start0();
         */
        cat.start();;//启动线程-> 最终会执行 cat 的 run 方法
        //cat.run();//run 方法就是一个普通的方法, 没有真正的启动一个线程，就会把 run 方法执行完毕，才向下执行
        //说明: 当 main 线程启动一个子线程 Thread-0, 主线程不会阻塞, 会继续执行
        //这时 主线程和子线程是交替执行
        System.out.println("主线程继续执行" + Thread.currentThread().getName());//名字 main
        for(int i = 0; i < 60; i++) {
            System.out.println("主线程 i=" + i);
            //让主线程休眠
            Thread.sleep(1000);
        }

        //1. 当一个类继承了 Thread 类， 该类就可以当做线程使用
        //2. 我们会重写 run 方法，写上自己的业务代码
        //3. run Thread 类 实现了 Runnable 接口的 run 方法
        /*
        @Override
        public void run() {
            if (target != null) {
                 target.run();
             }
        }
        */
    }
}

class Cat extends Thread {
    int time = 1;

    @Override
    public void run() {
        //java中实现真正的多线程时start中的start0()方法，run方法只是一个普通的方法
        while (true) {
            //休息1秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("mmmm"+"cat线程继续执行" + Thread.currentThread().getName());

            if (time++ == 80) {
                break;
            }
        }
    }
}