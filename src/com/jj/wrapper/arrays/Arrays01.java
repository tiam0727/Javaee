package com.jj.wrapper.arrays;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author: xj
 * @description: arrays常用方法
 * @dateTime: 2024/3/8 14:51
 **/
public class Arrays01 {
    public static void main(String[] args) {
        Integer[] integers = {1, 20, -10};
        //遍历数组
//        for (Integer integer : integers) {
//            System.out.println(integer);
//        }
        //直接使用Arrays.toString()方法,显示数组
//        System.out.println(Arrays.toString(integers));

        //演示sort方法的使用
        Integer[] arr = {1, -1, 7, 0, 89};
        //1. 可以直接使用冒泡排序也可以使用Arrays提供的sort方法进行排序
        //2. 因为数组是引用类型，所以通过sort排序后，会直接影响到实参arr

//        Arrays.sort(arr);
        //3. sort方法是重载的，可以传入一个接口Comparator实现定制排序
        /**
         * 调用定制排序时，传入两个参数（1）排序的数组arr
         * 实现comparator接口的匿名内部类，要求实现compare方法
         *  源码分析
         * (1) Arrays.sort(arr, new Comparator()
         * (2) 最终到 TimSort 类的 private static <T> void binarySort(T[] a, int lo, int hi, int start, Comparator<? super T> c)()
         * (3) 执行到 binarySort 方法的代码, 会根据动态绑定机制 c.compare()执行我们传入的
         * 匿名内部类的 compare ()
         * while (left < right) {
         * int mid = (left + right) >>> 1;
         * if (c.compare(pivot, a[mid]) < 0)
         * right = mid;
         * else
         * left = mid + 1;
         * }
         * (4) new Comparator() {
         *  @Override
         *  public int compare(Object o1, Object o2) {
         *  Integer i1 = (Integer) o1;
         *  Integer i2 = (Integer) o2;
         *  return i2 - i1;
         *  }
         *  }
         * (5) public int compare(Object o1, Object o2) 返回的值>0 还是 <0
         *  会影响整个排序结果, 这就充分体现了 接口编程+动态绑定+匿名内部类的综合使用
         *  将来的底层框架和源码的使用方式，会非常常见
         */
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        System.out.println(Arrays.toString(arr));

    }
}
