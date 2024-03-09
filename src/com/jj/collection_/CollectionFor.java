package com.jj.collection_;

import java.util.ArrayList;

/**
 * @author: xj
 * @description: 使用增强for循环来遍历
 * @dateTime: 2024/3/9 23:26
 **/
public class CollectionFor {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Book("三国演义","罗贯中",20));
        arrayList.add(new Book("红楼梦","曹雪芹",30));
        arrayList.add(new Book("西游记","吴承恩",20));
        arrayList.add(new Book("水浒传","施耐庵",20));
        //使用增强for，底层仍然是迭代器
        //增强for可以理解为简化版本的迭代器遍历
        //快捷键I或者在对象后加上 “.for”

        for (Object book : arrayList) {
            System.out.println(book);
        }
    }

}
