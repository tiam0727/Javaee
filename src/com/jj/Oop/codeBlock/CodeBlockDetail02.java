package com.jj.Oop.codeBlock;

public class CodeBlockDetail02 {
    public static void main(String[] args) {
        A a = new A();// (1) A 静态代码块 01 (2) getN1 被调用...(3)A 普通代码块 01(4)getN2 被调用...(5)A() 构造器被调用
    }
}

class A {
    { //普通代码块

        System.out.println("A 普通代码块 01");
    }

    private int n2 = getN2();//普通属性的初始化

    static { //静态代码块
        System.out.println("A 静态代码块 01");
    }

    //静态属性的初始化
    private static int n1 = getN1();

    public static int getN1() {
        System.out.println("getN1 被调用...");
        return 100;
    }

    public int getN2() { //普通方法/非静态方法
        System.out.println("getN2 被调用...");
        return 200;
    }

    //无参构造器
    public A() {
        System.out.println("A() 构造器被调用");
    }
}