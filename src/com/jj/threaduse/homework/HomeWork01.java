package com.jj.threaduse.homework;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

/**
 * @author: xj
 * @description: 练习
 * @dateTime: 2024/3/21 20:23
 **/
public class HomeWork01 {
    public static void main(String[] args) throws InterruptedException {
        A a = new A();
        B b = new B(a);
        b.start();
        a.start();
//        Thread.sleep(100);
//        a.setLoop(false);
    }

}

class A extends Thread {
    private static boolean loop = true;

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    @Override
    public void run() {
        while (loop){
            try {
                System.out.println((int)(Math.random()*100+1));
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class B extends Thread{
    A a;

    public B(A a) {
        this.a = a;
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入Q以停止");
        if ("Q".equals(scanner.next())){
            a.setLoop(false);
        }
    }
}


