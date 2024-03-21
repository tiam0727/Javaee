package com.jj.threaduse;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author: xj
 * @description: 售票
 * @dateTime: 2024/3/21 17:18
 **/
public class SellTicket {
    public static void main(String[] args) {
        T t1 = new T();
        Thread thread = new Thread(t1);
        Thread thread2 = new Thread(t1);
        Thread thread3 = new Thread(t1);
        thread.start();
        thread2.start();
        thread3.start();
    }
}

class T implements Runnable {
    public volatile static AtomicInteger ticket = new AtomicInteger(100);

    @Override
    public void run() {
        while (ticket.get() > 0) {
            try {
                Thread.sleep(0);
                ticket.decrementAndGet();//此处会出现数据不同步问题
                System.out.println("窗口" + Thread.currentThread().getName() + "售出一张票，还剩" + ticket + "张票");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
