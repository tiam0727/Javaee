package com.jj.socket_.homework;

import com.jj.socket_.upload.StreamUtils;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author: xj
 * @description:
 * @dateTime: 2024/3/28 17:51
 **/
public class HomeWork03DownloadClient {
    /**
     * 客户端发出文件名字，服务端返回对应文件，如果没有就返回默认
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        //输入文件名
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入文件名：");
        String name = scanner.nextLine();

        //客户端连接服务器
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write(name.getBytes());
        System.out.println("正在发送文件名....."+name);
        socket.shutdownOutput();//设置写入的结束标记

        //接收服务端返回的文件流
        BufferedInputStream bufferedInputStream =
                new BufferedInputStream(socket.getInputStream());
        byte[] bytes = StreamUtils.streamToByteArray(bufferedInputStream);
        String filePath = "E:\\" + name + ".mp3";
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(filePath));
        bufferedOutputStream.write(bytes);


        //关闭流
        bufferedInputStream.close();
        bufferedOutputStream.close();
        outputStream.close();
        socket.close();

    }
}
