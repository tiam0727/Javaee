package com.jj.utils.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author: xj
 * @description: 工具类
 * @dateTime: 2024/3/18 22:07
 **/
public class Collections_ {
    public static void main(String[] args) {
//        Collections collections = new Collections();构造方法私有
        ArrayList arrayList = new ArrayList();
        arrayList.add("a");
        arrayList.add("bb");
        arrayList.add("ccc");
        arrayList.add("dddd");
        arrayList.add("eeeee");
        //reverse 反转集合中的元素顺序
        Collections.reverse(arrayList);
        System.out.println(arrayList);

        //shuffle,对集合随机排序
        for (int i = 0; i < 5; i++) {
            Collections.shuffle(arrayList);
            System.out.println("list: " + arrayList);
        }

        //sort 根据元素自然排序
        Collections.sort(arrayList);
        System.out.println("自然排序后:  " + arrayList);

        //指定排序顺序
        Collections.sort(arrayList, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o2).length() - ((String) o1).length();
            }
        });
        System.out.println(arrayList);

        //swap交换指定位置的元素
        Collections.swap(arrayList, 1, 2);
        System.out.println("交换位置" + arrayList);

        //max根据元素的自然排序，返回给定集合的最大元素
        System.out.println("自然排序下最大的元素为：" + Collections.max(arrayList));
        //比如，我们要返回的长度最大的元素
        Object max = Collections.max(arrayList, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o2).length() - ((String) o1).length();
            }
        });
        System.out.println("长度最大的是" + max);

        //min 参考max

        //frequency 出现的频率
        int frequency = Collections.frequency(arrayList, "a");
        System.out.println(frequency);

        //copy 拷贝
        ArrayList dest = new ArrayList();
        //为了完成一个完整的拷贝，需要献给dest赋值，大小和arraylist一样
        for (int i = 0; i < arrayList.size(); i++) {
            dest.add("");
        }
        Collections.copy(dest, arrayList);
        System.out.println("dest" + dest);

        Collections.replaceAll(arrayList,"bb","aa");
        System.out.println(arrayList);
    }
}
