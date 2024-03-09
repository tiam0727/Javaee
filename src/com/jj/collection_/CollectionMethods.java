package com.jj.collection_;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author: xj
 * @description: Collection常用方法
 * @dateTime: 2024/3/9 22:41
 **/
public class CollectionMethods {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("小龙女");
        list.add(100);//List.add(new Integer(100))
        list.add(true);
        System.out.println("list=" + list);
        //remove:删除指定元素
//        list.remove(0);//删除第一个元素
//        System.out.println("list=" + list);
//        list.remove(new Integer(100));//删除指定元素，需要传入对象，若是直接传入int数会被识别为索引值
//        System.out.println("list=" + list);
        //contains 查找某个元素是否存在
        if (list.contains("小龙女")) {
            System.out.println("存在小龙女");
        } else {
            System.out.println("不存在小龙女");
        }

        //size返回元素个数
        System.out.println("有" + list.size() + "个元素");

        //isEmpty 检查是否为空
        System.out.println("是否为空？ " + list.isEmpty());

        //clear 清空
        list.clear();
        System.out.println(list);

        //addAll 添加多个元素
        ArrayList list1 = new ArrayList();
        list1.add("taa");
        list1.add(20);
        list1.add("asdas");
        list.addAll(list1);
        System.out.println(list);

        //containsAll;  list1里的元素都存在
        if (list.containsAll(list1)) {
            System.out.println("list1里的元素都存在");
        } else{
            System.out.println("list1里的元素并不都存在");
        }

        //removeAll，删除多个元素
        list.add("abab");
        list.removeAll(list1);
        System.out.println(list);
//        list.iterator()

    }
}
