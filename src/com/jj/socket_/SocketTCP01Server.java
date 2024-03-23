package com.jj.socket_;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author: xj
 * @description: 服务端
 * @dateTime: 2024/3/23 15:04
 **/
public class SocketTCP01Server {

    public static void main(String[] args) throws IOException {
        /*
          思路
          1. 在本机的9999端口监听，等待连接
          2. 当没有客户端连接9999端口时，程序会阻塞，等待连接
          3. 通过socket.getInputStream() 读取客户端写入到数据通道的数据
         */
        //细节：要求在本机没有其他服务在监听9999
        //ServerSocket可以对应多个socket。即调用一次accept方法就会返回一个socket对象
        ServerSocket serverSocket = new ServerSocket(9999);
        //如果有客户端连接，则会返回一个Socket对象，程序继续
//        System.out.println("服务端的线程状态（ac前） = "+Thread.currentThread().getState());
        Socket accept = serverSocket.accept();
//        System.out.println("服务端的线程状态 （ac后）= "+Thread.currentThread().getState());

        System.out.println("服务端 socket = " + accept.getClass());

        InputStream inputStream = accept.getInputStream();
        byte[] buf = new byte[1024];
        int readLen = 0;
        while ((readLen = inputStream.read(buf) )!= -1) {
            System.out.print(new String(buf,0,readLen));//根据实际读取的长度显示内容
        }
//        System.out.println("服务端的线程状态 = "+Thread.currentThread().getState());
        //关闭流和socket
        inputStream.close();
        accept.close();
        serverSocket.close();


    }
}
