package com.jj.generic;

/**
 * @author: xj
 * @description: 自定义泛型接口
 * @dateTime: 2024/3/19 16:09
 **/
public class CustomInterfaceGeneric {
    public static void main(String[] args) {

    }
}

/**
 * 1. 接口中，静态成员也不能使用泛型
 * 2. 泛型接口的类型, 在继承接口或者实现接口时确定
 * 3. 没有指定类型，默认为 Object
 */
interface IC<R, T> {
    int n = 10;
    //不可以这样使用
//    R r;
    //普通方法中，可以使用接口泛型
    R get(T t);
    void h1(R r);

    //在JDK8中，可以在接口中使用默认方法，需要关键字default
    default R method(){
        return null;
    }

}

//在继承接口 指定泛型接口的类型
interface IA extends IC<String,Double>{

}
//当我们去实现IA接口睡觉时，因为IA在继承接口 IC时指定了泛型，
//在实现方法的时候，使用String替换了R，使用Double替换了 T
class AA implements IA{
    @Override
    public String get(Double aDouble) {
        return null;
    }

    @Override
    public void h1(String s) {

    }
}
class BB implements IC<Integer,Float>{
    @Override
    public Integer get(Float aFloat) {
        return null;
    }

    @Override
    public void h1(Integer integer) {

    }
}
//没有指定类型默认为Obbject
class CC implements IC{
    @Override
    public Object get(Object o) {

        return null;
    }

    @Override
    public void h1(Object o) {

    }
}