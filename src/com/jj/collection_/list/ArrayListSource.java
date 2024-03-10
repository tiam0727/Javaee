package com.jj.collection_.list;

import java.util.ArrayList;

/**
 * @author: xj
 * @description:
 * @dateTime: 2024/3/10 10:09
 **/
public class ArrayListSource {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        //使用for添加10个数据
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        for (int i = 10; i < 15; i++) {
            list.add(i);
        }
        list.add(100);
    }
}
