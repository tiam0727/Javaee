package com.jj.collection_.set.linkedhashset;


import java.util.LinkedHashSet;
import java.util.Objects;

/**
 * @author: xj
 * @description: LinkedHashSet
 * @dateTime: 2024/3/11 18:07
 **/
public class LinkedHashSet_ {
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new Car("奥拓", 1000));//OK
        linkedHashSet.add(new Car("奥迪", 300000));//OK
        linkedHashSet.add(new Car("法拉利", 10000000));//OK
        linkedHashSet.add(new Car("奥迪", 300000));//加入不了
        linkedHashSet.add(new Car("保时捷", 70000000));//OK
        linkedHashSet.add(new Car("奥迪", 300000));//加入不了
        System.out.println("linkedHashSet=" + linkedHashSet);
        /**
         * linkedHashSet=[Car{name='奥拓', prize=1000},
         *                Car{name='奥迪', prize=300000},
         *                Car{name='法拉利', prize=10000000},
         *                Car{name='保时捷', prize=70000000}]
         * 1. 得到结论：无法加入重复值，会保留插入时的顺序
         * 2. LinkedHashSet 底层维护了一个LinkedHashMap(是HashMap的子类)
         * 3. 底层结构维护的是数组+双向链表
         * 4. 添加第一次是，直接将数组table扩容到16，存放的节点类型是LinkedHashMap$Entry
         * 5. 数组是 HashMap$Node[] 存放的元素/数据是
         */
    }
}
class Car{
    private String name;
    private int prize;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", prize=" + prize +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return prize == car.prize && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, prize);
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrize() {
        return prize;
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }

    public Car(String name, int prize) {
        this.name = name;
        this.prize = prize;
    }
}
