package com.jj.file;

import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * @author: xj
 * @description: 文件夹
 * @dateTime: 2024/3/21 21:21
 **/
public class Directory_ {
    public static void main(String[] args) {

    }
    @Test
    public void m1(){
        String filePath="e:\\news1.txt";
        File file = new File(filePath);
        if (file.exists()){
            if(file.delete()){
                System.out.println(filePath+"删除成功");
            }else {
                System.out.println("删除失败");
            }
        }else{
            System.out.println("该文件不存在 ");
        }
    }
    //在Java中目录也被当做是文件
    @Test
    public void m2(){
        String filePath="d:\\demo2";
        File file = new File(filePath);
        if (file.exists()){
            if(file.delete()){
                System.out.println(filePath+"删除成功");
            }else {
                System.out.println("删除失败");
            }
        }else{
            System.out.println("该目录不存在 ");
        }
    }
    @Test
    public void m3(){
        String directoryPath="d:\\demo\\a\\b\\c";
        File file = new File(directoryPath);
        if (file.exists()){
//            if(file.delete()){
//                System.out.println(directoryPath+"删除成功");
//            }else {
//                System.out.println("删除失败");
//            }
        }else{
            System.out.println("该目录不存在 ");
            if (file.mkdirs()) {
                System.out.println("该目录创建成功");
            }else {
                System.out.println("该目录创建失败");
            }
        }

    }


}
