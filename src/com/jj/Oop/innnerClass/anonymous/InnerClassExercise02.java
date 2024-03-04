package com.jj.Oop.innnerClass.anonymous;

/**
 * @author: 徐杰
 * @description: 匿名内部类练习
 * @dateTime: 2024/3/4 15:32
 * @return
 **/
public class InnerClassExercise02 {

    public static void main(String[] args) {
        /**
         * 1. 有一个铃声接口Bell，里面有一个方法ring（）
         * 2. 有一个手机类CellPhone ，具有闹钟功能alarmClick，参数是Bell类型
         * 测试手机类的闹钟功能，通过匿名内部类作为参数，打印土狗起床，再传入另一个匿名内部类打印，土狗上课
         *
         */
        CellPhone cellPhone = new CellPhone();
        //1. 传递的是一个实现了Bell接口的匿名内部类
        //2. 重写了ring方法
        //3. 相当于alarmClick的形参接收了这匿名内部类
        cellPhone.alarmClick(new Bell() {
            @Override
            public void ring() {
                System.out.println("土狗起床");
            }
        });
        cellPhone.alarmClick(new Bell() {
            @Override
            public void ring() {
                System.out.println("土狗上课");
            }
        });
    }
}

interface Bell {
    void ring();
}

class CellPhone {
    public void alarmClick(Bell bell) {

        bell.ring();
    }
}
