package com.jj.collection_.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author: xj
 * @description:
 * @dateTime: 2024/3/18 22:52
 **/
public class HomeWork02 {

    private static HashMap<String, Integer> m;

    /**
     * 编程题Homework03.java 5min
     * 按要求完成下列任务
     * 1)使用HashMap类实例化一个Map类型的对象m,键(String)和值(int)分别用于存储员工的姓名和工资，存入数据如下：  jack—650元；tom—1200元；
     * smith——2900元；
     * 2)将jack的工资更改为2600元
     * 3)为所有员工工资加薪100元；
     * 4)遍历集合中所有的员工
     * 5)遍历集合中所有的工资
     */
    public static void main(String[] args) {
        HashMap<String, Integer> m = new HashMap<>();
        m.put("jack",650);
        m.put("tom",1200);
        m.put("smith",290);
        m.put("jack",2600);
        Set<String> strings = m.keySet();
        for (String string : strings) {
            m.put(string,m.get(string)+100);
        }

        //使用迭代器
        Set<Map.Entry<String, Integer>> entries =
                m.entrySet();

        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+" "+value);
        }
    }
}
