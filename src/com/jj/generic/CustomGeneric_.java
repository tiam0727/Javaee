package com.jj.generic;

/**
 * @author: xj
 * @description: 自定义泛型
 * @dateTime: 2024/3/19 15:53
 **/
public class CustomGeneric_ {
}

//1. Tiger后面是泛型，所以我们把Tiger就称为自定义泛型类
//2. T，R，M 泛型表示符，一般是单个大写字母
//3. 泛型标识符可以有多个
//4. 普通成员可以使用泛型（方法，属性）
//5. 使用泛型的数组，不能初始化
class Tiger1 <T,R,M>{
    String name;
    R r;
    T t;
    M m;

    //因为数组在new的时候，不能初始化，无法确定应当开辟的空间大小
//    T[] ts =new T[8];
    public Tiger1(String name, R r, T t, M m) {
        this.name = name;
        this.r = r;
        this.t = t;
        this.m = m;
    }

    public void m1(M n){}
    //因为静态是和类相关的，在类加载是，对象还没有创建
    //所以，如果静态方法和静态属性使用泛型，JVM就无法完成初始化
//    static R r2;
//    public static void m2(M n){}

}
