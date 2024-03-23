package com.jj.socket_;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author: xj
 * @description: 服务端
 * @dateTime: 2024/3/23 15:46
 **/
@SuppressWarnings("all")
public class SocketTCP02Server {
    public static void main(String[] args) throws IOException {
        //细节：要求在本机没有其他服务在监听9999
        //ServerSocket可以对应多个socket。即调用一次accept方法就会返回一个socket对象
        ServerSocket serverSocket = new ServerSocket(9999);
        //如果有客户端连接，则会返回一个Socket对象，程序继续
//        System.out.println("服务端的线程状态（ac前） = "+Thread.currentThread().getState());
        Socket socket = serverSocket.accept();
//        System.out.println("服务端的线程状态 （ac后）= "+Thread.currentThread().getState());

        System.out.println("服务端 socket = " + socket.getClass());

        InputStream inputStream = socket.getInputStream();
        byte[] buf = new byte[1024];
        int readLen = 0;
        while ((readLen = inputStream.read(buf) )!= -1) {
            System.out.print(new String(buf,0,readLen));//根据实际读取的长度显示内容
        }
//        System.out.println("服务端的线程状态 = "+Thread.currentThread().getState());

        //IO读取
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello client".getBytes());
        socket.shutdownOutput();

        //关闭流和socket
        inputStream.close();
        outputStream.close();
        socket.close();
        serverSocket.close();
    }
}
