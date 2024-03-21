package com.jj.threaduse.homework;

/**
 * @author: xj
 * @description: 练习
 * @dateTime: 2024/3/21 20:38
 **/
public class HomeWork02 {
    public static void main(String[] args) {
        Card card = new Card();
        new Thread(card).start();
//        System.out.println(Thread.currentThread().getName());
        new Thread(card).start();

    }
}

class Card implements Runnable {
    private double money = 10000;
    private static boolean loop = true;

    public static void setLoop(boolean loop) {
        Card.loop = loop;
    }

    synchronized public void getMoney(double m) {
        if (money < m) {
            setLoop(false);
            System.out.println("余额不足");
            return;
        }
        money -= m;
        System.out.println(Thread.currentThread().getName() + "取出来" + 1000 + "元");
    }

    @Override
    public void run() {
//        System.out.println(Thread.currentThread().getName());

        while (loop) {
            try {
//                System.out.println(Thread.currentThread().getName());
                getMoney(1000);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}