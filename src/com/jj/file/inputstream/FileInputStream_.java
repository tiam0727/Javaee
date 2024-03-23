package com.jj.file.inputstream;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author: xj
 * @description: 演示 FileInputStream 的使用(字节输入流 文件--> 程序)
 * @dateTime: 2024/3/21 21:38
 **/
public class FileInputStream_ {
    public static void main(String[] args) {

    }

    /**
     * 演示读取文件...
     * 单个字节的读取，效率比较低
     * @throws IOException
     */
    @Test
    public void readFile01() throws IOException {
        String filePath = "e:\\news2.txt";
        int readData = 0;
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(filePath);
            //如果返回-1说明读取文件结束
            while ((readData = fileInputStream.read()) != -1) {
                System.out.print ((char) readData);//转成char显示
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            fileInputStream.close();
        }
    }

    /**
     * 使用byte[]
     * @throws IOException
     */
    @Test
    public void readFile02() throws IOException {
        String filePath = "e:\\news2.txt";
        int readData = 0;
        //字节数组
        byte[] buf=new byte[8];//一次读取八个字节
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(filePath);
            //如果返回-1说明读取文件结束
            //如果读取正常，返回实际读取的字节数
            while ((readData = fileInputStream.read(buf)) != -1) {
                System.out.print (new String(buf,0,readData));//转成char显示
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            fileInputStream.close();
        }
    }
}
