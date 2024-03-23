package com.jj.socket_;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author: xj
 * @description: 客户端，发送 "hello, server" 给服务端
 * @dateTime: 2024/3/23 15:54
 **/
@SuppressWarnings("all")

public class SocketTCP02Client {
    public static void main(String[] args) throws IOException {
        //连接本机的9999端口，如果成功，返回一个socket对象
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端 socket 返回= " + socket.getClass());
//        System.out.println("客户端的线程状态 = " + Thread.currentThread().getState());
        //连接上后生成socket，通过socket.getOutputStream()，获取与之相关的输出流对象
        OutputStream outputStream = socket.getOutputStream();
        //通过输出流写入数据到数据通道
        outputStream.write("hello server".getBytes());
        socket.shutdownOutput();
        //等待server socket的响应
        //获取socket相关的输入流
        InputStream inputStream = socket.getInputStream();
        byte[] buf = new byte[1024];
        int readLine = 0;
        while ((readLine = inputStream.read(buf)) != -1) {
            System.out.println(new String(buf, 0, readLine));
        }


        //关闭流的对象和socket，必须关闭
        inputStream.close();
        outputStream.close();
        socket.close();
        System.out.println("客户端 socket 已关闭");
    }
}
