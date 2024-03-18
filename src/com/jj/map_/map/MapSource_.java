package com.jj.map_.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author: xj
 * @description: Map源码
 * @dateTime: 2024/3/11 21:35
 **/
public class MapSource_ {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("n1","sss");
        hashMap.put("n2","aaa");
        /**
         * 1. k-v 最后是 HashMap$Node node= newNode(hash,key,value,null);
         * 2. k-v 为了方便程序员的遍历，还会创建EntrySet集合(一个set集合)，该集合存放的元素类型是Entry，而一个Entry对象就有k，v
         *      EntrySet<Entry<K,V>> 即 transient Set<Map.Entry<K,V>> entrySet;
         * 3. entrySet 中，定义的类型是Map.Entry,但是实际上存放的还是HashMap$Node(因为Node实现了Entry接口)
         *      static class Node<K,V> implements Map.Entry<K,V>
         * 4. 当把HashMap$Node 对象存放到entrySet就方便了我们遍历，因为Map.Entry提供了重要方法
         * K getKey();V getValue();
         */
        Set set = hashMap.entrySet();
        System.out.println("set的类型"+set.getClass());
        for (Object o : set) {
            System.out.println(o.getClass());
            //为了从HashMap$Node中取出k-v
            //1. 先做一个向下转型
            Map.Entry entry = (Map.Entry) o;
            System.out.println(entry.getKey()+" ||| "+entry.getValue());

        }
        Set set1 = hashMap.keySet();
        System.out.println(set1.getClass());

    }
}
