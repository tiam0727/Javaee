package com.jj.enum_;

/**
 * @author: 徐杰
 * @description: 以Season为例演示Enum的常用方法
 * @dateTime: 2024/3/4 21:08
 * @return
 **/
public class EnumMethod {
    public static void main(String[] args) {
        Season2 autumn = Season2.AUTUMN;
        //输出常量名字
        System.out.println(autumn.name());
        //常量次序（按照编码时的次序从0开始 ）
        System.out.println(autumn.ordinal());
        //从反编译可以看出values方法，返回Season2[]
        Season2[] values = Season2.values();
        for (Season2 season2 : values) {//增强for循环，以次从values取出值赋给season2
            System.out.println(season2);

        }

        //将字符串转换成枚举对象，要求字符串必须为已有的常量名，否则报异常！
        //执行流程
        //1. 根据输入的AUTUMN到Season2枚举对象中去查找
        //2. 如果找到了，就返回，如果没有找到就报错
        Season2 season2 = Season2.valueOf("AUTUMN");
        System.out.println("autumn=" + season2);
        System.out.println(autumn == season2);

        //compareTo：比较两个枚举常量，比较的就是编号！
        //1. 就是把Season2.AUTUMN和Season2.SUMMER的编号进行比较
        /**
         * public final int compareTo(E o) {
         *         Enum<?> other = (Enum<?>)o;
         *         Enum<E> self = this;
         *         if (self.getClass() != other.getClass() && // optimization
         *             self.getDeclaringClass() != other.getDeclaringClass())
         *             throw new ClassCastException();
         *         return self.ordinal - other.ordinal;
         *     }
         */
        //3-2=1
        System.out.println(Season2.AUTUMN.compareTo(Season2.SUMMER));
    }
}
