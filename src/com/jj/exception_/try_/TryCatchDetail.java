package com.jj.exception_.try_;

/**
 * @author: 徐杰
 * @description: try-catch细节
 * @dateTime: 2024/3/5 16:27
 **/
public class TryCatchDetail {
    public static void main(String[] args) {
        //ctrl+alt+t
        //有异常走catch
        //没有就不走catch
        //无论有没有异常都需要走finally代码块
        try {
//            String str="土狗吃答辩";
            String str="123";
            int i = Integer.parseInt(str);
            System.out.println("是数字："+i);
        } catch (NumberFormatException e) {
            System.out.println("异常信息"+e.getMessage());
        }finally {
            System.out.println("finally代码块继续执行");
        }
        System.out.println("程序继续");
    }
}
