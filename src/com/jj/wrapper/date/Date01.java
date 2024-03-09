package com.jj.wrapper.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: xj
 * @description: 第一代日期类
 * @dateTime: 2024/3/9 16:35
 **/
public class Date01 {
    public static void main(String[] args) throws ParseException {
        Date d1 = new Date();
        //1. 获取当前时间
        //2. 这里的date时在java.util下的
        //3. 默认输出的日期格式时国外的方式，因此通常需要对格式进行转换 使用SimpleDateFormat
        //1. 创建SimpleDateFormat对象，可以指定相应的格式
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E");
        System.out.println("当前时间="+d1);
        String format = simpleDateFormat.format(d1);
        System.out.println("当前时间="+format);
        Date d2 = new Date(System.currentTimeMillis());
        //通过指定毫秒数得到时间
        System.out.println("当前时间="+d2);
        //1. 可以把一个格式化的String转化成对应的Date
        //2. 得到date，仍然在输出时按照默认的格式，如果希望指定格式输出，需要转换
        //3. 输入的字符串需要和SDF的格式相适应，否则会抛出一个转换异常ParseException
        String s="2024-03-09 16:57:44 星期六";
        Date date = simpleDateFormat.parse(s);
        System.out.println("时间为："+date);

    }
}
