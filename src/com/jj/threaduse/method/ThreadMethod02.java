package com.jj.threaduse.method;

/**
 * @author: xj
 * @description: 常用方法第二组
 * @dateTime: 2024/3/21 19:10
 **/
public class ThreadMethod02 {
    public static void main(String[] args) throws InterruptedException {
        //测试join的使用
        T1 t1 = new T1();
        t1.start();
        //说明
        //1. 让t1插到主线程的前面，这样main就会等待t1执行完毕，再执行主线程
        //2. 如果没有join那么会交替执行。
//        t1.join();
        for (int i = 0; i < 20; i++) {
            Thread.sleep(50);
            System.out.println("涂鹏程傻卵" + (i+1));
        }
    }
}

class T1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(60);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("JoinThread............"+i);
        }
    }
}