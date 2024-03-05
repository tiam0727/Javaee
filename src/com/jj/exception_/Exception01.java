package com.jj.exception_;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author: 徐杰
 * @description: 编译时异常举例
 * @dateTime: 2024/3/5 16:08
 * @return
 **/
public class Exception01 {
    public static void main(String[] args) {
        try {
            FileInputStream fis;
            fis = new FileInputStream("d:\\aa.jpg");
            int len;
            while ((len = fis.read()) != -1) {
                System.out.println(len);
            }
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
