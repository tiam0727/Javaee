package com.jj.wrapper.stringbuilder_;

/**
 * @author: xj
 * @description: 快速入门StringBuilder
 * @dateTime: 2024/3/8 11:17
 **/
public class StringBuilder01 {
    public static void main(String[] args) {
        //1. StringBuilder 继承 AbstractStringBuilder类
        //2. 实现Serializable接口，说明StringBuilder可以串行化用于网络传输，可以保存到文件
        //3. 是final类不能被继承
        //4. 字符序列仍然存放在其父类AbstractStringBuilder的char[]value;
        // 因此字符序列是存放在堆中
        //StringBuilder的方法是线程不安全的，没有做互斥处理，即没有synchronized做线程同步。只能在单线程环境下操作
        StringBuilder stringBuilder = new StringBuilder();
    }

}
