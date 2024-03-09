package com.jj.wrapper.date;

import java.util.Calendar;

/**
 * @author: xj
 * @description: 第二代日期类
 * @dateTime: 2024/3/9 17:31
 **/
public class Calendar_ {
    public static void main(String[] args) {
        //1. Calender是一个抽象类，并且构造方法是私有的
        //2. 可以通过getInstance() 来获取实例
        //3. 提供大量的方法和字段提供给程序员
        //4. Calendar 没有专门的格式化方法，所以需要程序员自己组合显示
        //5. 如果我们需要按照24小时进制来获取时间 ， Calendar.HOUR=>Calendar.HOUR_OF_DAY)
        Calendar calendar = Calendar.getInstance();//创建日历对象//比较简单，自由
        System.out.println("calendar="+calendar);
        //2. 获取日历对象的某个日历字段
        System.out.println("年："+calendar.get(Calendar.YEAR));
        //这里为什么要加一，是因为Calendar返回月的时候，是按照0开始编号
        //注意加上括号提高运算优先级，否则会变成拼接字符串
        System.out.println("月："+(calendar.get(Calendar.MONTH)+1));
        System.out.println("日："+calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("小时："+calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("分钟："+calendar.get(Calendar.MINUTE));
        System.out.println("秒："+calendar.get(Calendar.SECOND));
        //Calendar 没有专门的格式化方法，所以需要程序员自己组合显示
        System.out.println(calendar.get(Calendar.YEAR)+"年"+(calendar.get(Calendar.MONTH)+1)
                +"月"+calendar.get(Calendar.DAY_OF_MONTH)+"日"+calendar.get(Calendar.HOUR_OF_DAY)+":"+calendar.get(Calendar.MINUTE)+":"+calendar.get(Calendar.SECOND));

    }
}
