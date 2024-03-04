package com.jj.enum_;

/**
 * @author: 徐杰
 * @description: 演示使用enum关键字
 * @dateTime: 2024/3/4 20:51
 * @return
 **/
public class Enumeration03 {
    public static void main(String[] args) {
        System.out.println(Season2.AUTUMN);
    }
}
enum Season2{
    SPRING("春天","温暖"),SUMMER("夏天", "炎热"),AUTUMN("秋天","凉爽");
    private String name;
    private String desc;//描述
    //如果使用关键字enum实现枚举类
    //1. 使用关键字代替class
    //2.public final static Season SPRING = new Season("春天", "温暖");直接使用SPRING("春天","温暖")
    //3. 如果有多个常量 ，使用,隔开即可

    @Override
    public String toString() {
        return "Season2{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
    //4. 如果使用enum实现枚举 需要将定义的常量对象写在最前面

    Season2(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }
}
