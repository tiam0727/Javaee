package com.jj.collection_.set;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author: xj
 * @description: TreeSet内容
 * @dateTime: 2024/3/18 21:26
 **/
public class TreeSet_ {
    public static void main(String[] args) {
        //1. 当我们使用无参构造器，创建 TreeSet 时，仍然是无序的
//        TreeSet treeSet = new TreeSet();
        //2. 希望添加的元素，按照字符串大小来排序
        //3. 使用 TreeSet 提供的一个构造器，可以传入一个比较器(匿名内部类)
        // 并指定排序规则
        //4. 简单看看源码
        TreeSet treeSet = new TreeSet(new Comparator() {
            /**
             *
             * @param o1 the first object to be compared.
             * @param o2 the second object to be compared.
             *
             * 1. 构造器把传入的比较器对象，赋给了 TreeSet 的底层的 TreeMap 的属性 this.comparator
             * public TreeMap(Comparator<? super K> comparator) {
             * this.comparator = comparator;
             * }
             * 2. 在 调用 treeSet.add("tom"), 在底层会执行到
             * if (cpr != null) {//cpr 就是我们的匿名内部类(对象)
             * do {
             * parent = t;
             * //动态绑定到我们的匿名内部类(对象)compare
             * cmp = cpr.compare(key, t.key);
             * if (cmp < 0)
             * t = t.left;
             * else if (cmp > 0)
             * t = t.right;
             * else //如果相等，即返回 0,这个 Key 就没有加入
             * return t.setValue(value);
             * } while (t != null);
             * }
             *
             */
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof String && o2 instanceof String)
                return (((String) o1).compareTo((String) o2));
                else return 0;
            }
        });
        //添加数据
        treeSet.add("jack");
        treeSet.add("aa");
        treeSet.add("lucy");
        treeSet.add("tpc");
        System.out.println(treeSet);

    }
}
