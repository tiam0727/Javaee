package main_;

public class Main01 {
    //静态的变量/属性
    private static String name = "韩顺平教育";
    //非静态的变量/属性
    private int n1 = 10000;

    //静态方法
    public static void hi() {
        System.out.println("Main01 的 hi 方法");

    }

    //非静态方法
    public void cry() {
        System.out.println("Main01 的 cry 方法");
    }

    public static void main(String[] args) {
//可以直接使用 name
//1. 静态方法 main 可以访问本类的静态成员
        System.out.println("name=" + name);
        hi();
//2. 静态方法 main 不可以访问本类的非静态成员
//System.out.println("n1=" + n1);//错误
//cry();
//3. 静态方法 main 要访问本类的非静态成员，需要先创建对象 , 再调用即可
        Main01 main01 = new Main01();
        System.out.println(main01.n1);//ok
        main01.cry();
    }
}