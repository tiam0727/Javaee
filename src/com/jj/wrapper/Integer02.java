package com.jj.wrapper;

/**
 * @author: xj
 * @description:
 * @dateTime: 2024/3/5 19:44
 **/
public class Integer02 {
    public static void main(String[] args) {
        Integer n1 = 1;
        Integer n2 = 1;
        Integer n3 = 128;
        Integer n4 = 128;
        System.out.println("n1与n2是一个对象？" + (n2 == n1));
        System.out.println("n4与n3是一个对象？" + (n4 == n3));
        /**
         *
         *     static final Integer cache[];
         *
         *     public static Integer valueOf(int i) {
         *         if (i >= IntegerCache.low && i <= IntegerCache.high)
         *             return IntegerCache.cache[i + (-IntegerCache.low)];
         *         return new Integer(i);
         *     }
         *
         *     IntegerCache.low=-128
         *     IntegerCache.high=127
         *     缓存了-128到127直接的数据，类似于单例模式
         */
    }
}
