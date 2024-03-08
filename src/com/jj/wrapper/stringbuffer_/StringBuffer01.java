package com.jj.wrapper.stringbuffer_;

/**
 * @author: xj
 * @description:
 * @dateTime: 2024/3/8 10:36
 **/
public class StringBuffer01 {
    public static void main(String[] args) {
        //1. StringBuffer的直接父类是AbstractStringBuilder
        //2. StringBuffer实现了串行化接口
        //3. 在父类中AbstractStringBuilder 有属性 char[] value，不是final
        //该value数组存放字符串内容，存放在在堆中
        //4. StringBuffer是final类，不能被继承
        //5. 因为 StringBuffer 字符内容是存在 char[] value, 所有在变化(增加/删除)
        // 不用每次都更换地址(即不是每次创建新对象)， 所以效率高于 String
        StringBuffer stringBuffer = new StringBuffer();
    }
}
