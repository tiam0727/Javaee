package com.jj.map_;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author: xj
 * @description:
 * @dateTime: 2024/3/18 21:53
 **/
public class TreeMap_ {
    public static void main(String[] args) {

//        TreeMap treeMap = new TreeMap();
        TreeMap treeMap = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).length()-((String)o2).length();
            }
        });
        treeMap.put("jack",1);
        treeMap.put("aa",2);
        treeMap.put("lucy",3);
        treeMap.put("tpc",4);
        treeMap.put("tpc",5);//加入不了，不是替换
        /**
         * 1. 构造器，把传入的实现了Comparator接口的匿名内部类，传给给 TreeMap 的 comparator
         * 2. 调用 put 方法
         * 2.1 第一次添加, 把 k-v 封装到 Entry 对象，放入 root
         * Entry<K,V> t = root;
         * if (t == null) {
         *      compare(key, key); // type (and possibly null) check
         *      root = new Entry<>(key, value, null);
         *      size = 1;
         *      modCount++;
         *      return null;
         * }
         * 2.2 以后添加
         * Comparator<? super K> cpr = comparator;
         * if (cpr != null) {
         *      do { //遍历所有的 key , 给当前 key 找到适当位置
         *          parent = t;
         *          cmp = cpr.compare(key, t.key);//动态绑定到我们的匿名内部类的 compare
         *          if (cmp < 0)
         *             t = t.left;
         *          else if (cmp > 0)
         *             t = t.right;
         *          else //如果遍历过程中，发现准备添加 Key 和当前已有的 Key 相等，就不添加
         *             return t.setValue(value);
         *      } while (t != null);
         * }
         */
    }
}
