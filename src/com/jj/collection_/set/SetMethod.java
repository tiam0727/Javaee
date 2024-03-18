package com.jj.collection_.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author: xj
 * @description: set方法
 * @dateTime: 2024/3/10 12:10
 **/
public class SetMethod {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("john");
        set.add(" ");
        set.add("lucy");
        set.add("john");
        set.add(" ");
        System.out.println(set);
        //结果： [ , john, lucy]
        /**
         * 1. 以Set接口的实现类HashSet为例
         * 2. set接口对象，不能存放重复的数据，可以添加null但同样只能添加一个
         * 3. set接口对象存放数据是无序，（即添加的顺序和取出的顺序不一致）
         * 4. 注意: 取出的顺序是固定的，虽然不是添加的顺序，但是是固定的不会因为重启而改变顺序
         */

        //遍历
        /**
         * 1. 使用迭代器
         * 2. 使用增强for
         */
        System.out.println("=====使用迭代器====");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println("obj=" + obj);
        }
        set.remove(null);
        //方式 2: 增强 for
        System.out.println("=====增强 for====");
        for (Object o : set) {
            System.out.println("o=" + o);
        }
        //set 接口对象，不能通过索引来获取
    }
}
