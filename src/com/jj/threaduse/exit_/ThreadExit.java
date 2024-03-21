package com.jj.threaduse.exit_;

/**
 * @author: xj
 * @description: 线程终止
 * @dateTime: 2024/3/21 18:27
 **/
public class ThreadExit {
    public static void main(String[] args) {
        AThread aThread = new AThread();
        new Thread(aThread).start();
        for (int i = 1; i < 60; i++) {
            try {
                Thread.sleep(50);//让main线程休眠
            } catch (Exception e) {
                e.printStackTrace();
            }
//            Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
            System.out.println("main 线程运行中"+i);
            if (i == 40) {
                aThread.setLoop(false);
            }
        }
    }
}

class AThread implements Runnable {
    boolean loop = true;

    @Override
    public void run() {
        while (loop) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("AThread运行中");
        }
    }

    //提供公共方法用于修改loop

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}
