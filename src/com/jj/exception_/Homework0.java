package com.jj.exception_;

import java.util.InputMismatchException;

/**
 * @author: xj
 * @description: 作业
 * @dateTime: 2024/3/5 17:42
 **/
public class Homework0 {
    public static void main(String[] args) {


        try {
            if (args.length != 2) {
                throw new ArrayIndexOutOfBoundsException("参数个数不对");
            }
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            System.out.println(cal(n1,n2));
        } catch (ArithmeticException e) {
            System.out.println("除数为0");
        }  catch (NumberFormatException e) {
            System.out.println("数据格式错误");
        }
    }

    private static int cal(int n1, int n2) throws RuntimeException {
        return n1 / n2;
    }
}
