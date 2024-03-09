package com.jj.wrapper.date;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @author: xj
 * @description: 第三代日期类
 * @dateTime: 2024/3/9 20:49
 **/
public class LocalDate_ {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();//LocalDate.new();//LocalTime.new();
        LocalDate localDate = LocalDate.now();//可以获取到年月日
        LocalTime localTime = LocalTime.now();//可以获取到时分秒
//        System.out.println(dateTime);
        int year = dateTime.getYear();
        System.out.println("year= " + year);
        /**
         * public enum Month implements TemporalAccessor, TemporalAdjuster {
         *  JANUARY,
         *  FEBRUARY,
         *  MARCH,
         *  APRIL,
         *  JUNE,
         *  JULY,
         *  AUGUST,
         *  SEPTEMBER,
         *  OCTOBER,
         *  NOVEMBER,
         *  DECEMBER;
         *  }
         *  Month是一个枚举类
         *  该方法返回的是一个枚举对象
         */
        Month month = dateTime.getMonth();
        System.out.println("month=" + month);
        //返回具体的整型月份
        int monthValue = dateTime.getMonthValue();
        System.out.println("monthValue=" + monthValue);
        int dayOfMonth = dateTime.getDayOfMonth();
        System.out.println("dayOfMonth="+dayOfMonth);
        System.out.println("Hour="+dateTime.getHour());
        System.out.println("Minute="+dateTime.getMinute());
        System.out.println("Second="+dateTime.getSecond());

        //2. 使用DateTimeFormatter格式化日期类
        //创建DateTimeFormatter对象
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        String format = dateTimeFormatter.format(dateTime);
        System.out.println("格式化的时间："+format);


        //3.Instant时间戳
        //通过调用静态方法now() 获取表示当前时间戳的对象
        Instant now = Instant.now();
        System.out.println(now);
        //通过Date的from方法将时间戳对象转化为Date对象
        Date date = Date.from(now);
        System.out.println(date);
        //通过Date的toInstant()方法将对象转化为Instant对象
        Instant instant = date.toInstant();
        System.out.println("instant和now是否相同？ "+instant.equals(now));

    }
}
