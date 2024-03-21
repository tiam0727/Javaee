package com.jj.threaduse;

/**
 * @author: xj
 * @description: 通过实现接口 Runnable 来开发线程
 * @dateTime: 2024/3/21 16:32
 **/
public class Thread02 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        //dog.start(); 这里不能调用 start
        //创建了 Thread 对象，把 dog 对象(实现 Runnable),放入 Thread
        Thread thread = new Thread(dog);
        thread.start();
        Tiger tiger = new Tiger();//实现了 Runnable
         ThreadProxy threadProxy = new ThreadProxy(tiger);
         threadProxy.start();
    }
}

class Animal {
}

class Tiger extends Animal implements Runnable {
    @Override
    public void run() {
        System.out.println("老虎叫......");
    }
}

//线程代理类，模拟一个极简的Thread类
class ThreadProxy implements Runnable {//你可以把ThreadProxy类当作Thread
    private Runnable target = null;

    public ThreadProxy(Runnable target) {
        this.target = target;
    }

    @Override
    public void run() {
        if (target != null) {
            target.run();//动态绑定（运行类型 Tiger）
        }

    }

    public void start() {
        run();
    }
}

class Dog extends Animal implements Runnable {//通过实现 Runnable 接口，开发线程
    int count = 0;


    @Override
    public void run() {
        while (true) {
            System.out.println("小狗汪汪叫..hi " + (++count) + Thread.currentThread().getName());
//休眠 1 秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count == 10) {
                break;
            }
        }

    }
}