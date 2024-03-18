package com.jj.collection_.map_.hashtable_;

import java.util.Properties;

/**
 * @author: xj
 * @description: properties
 * @dateTime: 2024/3/18 21:20
 **/
public class Properties_ {
    public static void main(String[] args) {
        //1. Properties 继承 Hashtable
        //2. 可以通过 k-v 存放数据，当然 key 和 value 不能为 null
        Properties properties = new Properties();
        properties.put("John", 1);
        properties.put("Jack", 2);
        properties.put("Tom", 3);
        properties.put("Shelley", 4);
        properties.put("lic", 5);
        System.out.println(properties);
        //通过 k 获取对应值
        System.out.println(properties.get("lic"));//88
        //删除
        properties.remove("lic");
        System.out.println("properties=" + properties);
        //修改
        properties.put("john", "约翰");
        System.out.println("properties=" + properties);
    }
}
