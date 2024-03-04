package com.jj.enum_;

/**
 * @author: 徐杰
 * @description: 枚举类
 * @dateTime: 2024/3/4 20:42
 * @return
 **/
public class Enumeration02 {
    public static void main(String[] args) {
        System.out.println(Season.AUTUMN);
        System.out.println(Season.SPRING);
    }
}

//演示定义枚举实现
class Season {//类
    private String name;
    private String desc;//描述

    public final static Season SPRING = new Season("春天", "温暖");
    public final static Season SUMMER = new Season("夏天", "炎热");
    public final static Season AUTUMN = new Season("秋天", "凉爽");
    public final static Season WINTER = new Season("冬天", "寒冷");

    //1. 构造器私有化，目的 防止直接new
    //2. 删除set方法，方式属性被修改
    //3. 在season内部，直接创建几个固定的对象
    //4. 优化加上final 可以避免使用时强行加载类Season
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }

    public String getDesc() {
        return desc;
    }

    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }
}
