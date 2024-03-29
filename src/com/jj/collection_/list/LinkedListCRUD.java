package com.jj.collection_.list;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author: xj
 * @description: LinkedList 的增删改查
 * @dateTime: 2024/3/10 11:29
 **/
public class LinkedListCRUD {
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println("linkedList=" + linkedList);
        //演示一个删除结点的
        linkedList.remove(); // 这里默认删除的是第一个结点
        //linkedList.remove(2);
        System.out.println("linkedList=" + linkedList);
        //修改某个结点对象
        linkedList.set(1, 999);
        System.out.println("linkedList=" + linkedList);
        //得到某个结点对象
        //get(1) 是得到双向链表的第二个对象
        Object o = linkedList.get(1);
        System.out.println(o);//999
        //因为 LinkedList 是 实现了 List 接口, 遍历方式
        System.out.println("===LinkeList 遍历迭代器====");
        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println("next=" + next);
        }
        System.out.println("===LinkeList 遍历增强 for====");
        for (Object o1 : linkedList) {
            System.out.println("o1=" + o1);
        }
        System.out.println("===LinkeList 遍历普通 for====");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
        //源码阅读.
        /*
        根据索引取出对象是需要遍历链表，优化：会根据索引值决定是从后向前或是从前向后遍历
        Node<E> node(int index) {
        // assert isElementIndex(index);

        if (index < (size >> 1)) {
            Node<E> x = first;
            for (int i = 0; i < index; i++)
                x = x.next;
            return x;
        } else {
            Node<E> x = last;
            for (int i = size - 1; i > index; i--)
                x = x.prev;
            return x;
        }
    }
         */
        /* 1. LinkedList linkedList = new LinkedList();
        public LinkedList() {
        }
        2. 这时 linkeList 的属性 first = null last = null
        3. 执行 添加
        public boolean add (E e){
            linkLast(e);
            return true;
        }
        4. 将新的结点，加入到双向链表的最后
        void linkLast (E e){
            final Node<E> l = last;
            final Node<E> newNode = new Node<>(l, e, null);
            last = newNode;
            if (l == null)
                first = newNode;
            else
                l.next = newNode;
            size++;
            modCount++;
        }
        */
        /*
        读源码 linkedList.remove(); // 这里默认删除的是第一个结点
        1. 执行 removeFirst
        public E remove() {
        return removeFirst();
        }
        2. 执行
        public E removeFirst() {
        final Node<E> f = first;
        if (f == null)
        throw new NoSuchElementException();
        return unlinkFirst(f);
        }
        3. 执行 unlinkFirst, 将 f 指向的双向链表的第一个结点拿掉
        private E unlinkFirst(Node<E> f) {
        // assert f == first && f != null;
        final E element = f.item;
        final Node<E> next = f.next;
        f.item = null;
        f.next = null; // help GC
        first = next;
        if (next == null)
        last = null;
        else
        next.prev = null;
        size--;
        modCount++;
        return element;
        }
         */
    }
}
