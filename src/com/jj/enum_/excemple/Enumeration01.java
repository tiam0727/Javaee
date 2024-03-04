package com.jj.enum_.excemple;

/**
 * @author: 徐杰
 * @description: 演示枚举的由来
 * @dateTime: 2024/3/4 20:34
 * @return
 **/
public class Enumeration01 {
    public static void main(String[] args) {
        //使用
        Season spring = new Season("春天", "温暖");
        Season summer = new Season("夏天", "炎热");
        Season autumn = new Season("秋天", "凉爽");
        Season winter = new Season("冬天", "寒冷");
        //因为对于季节，他的对象（具体值），是固定的几个值，不会有更多
        //这样设计不能体现季节是固定的四个对象所以说，这种设计不好 =====> 枚举类
        Season other = new Season("h天", "****");
    }
}
class Season {
    private String name;
    private String desc;//描述

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }
}
