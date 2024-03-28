package com.jj.socket_.homework;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author: xj
 * @description:
 * @dateTime: 2024/3/28 17:26
 **/
public class HomeWork01Server {
    public static void main(String[] args) throws IOException {

        //思路
        //1. 在本机 的 9999 端口监听, 等待连接
        // 细节: 要求在本机没有其它服务在监听 9999
        // 细节：这个 ServerSocket 可以通过 accept() 返回多个 Socket[多个客户端连接服务器的并发]
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端，在 9999 端口监听，等待连接..");
        //2. 当没有客户端连接 9999 端口时，程序会 阻塞, 等待连接
        // 如果有客户端连接，则会返回 Socket 对象，程序继续
        Socket socket = serverSocket.accept();
//        System.out.println("服务端 socket =" + socket.getClass());
        InputStream inputStream = socket.getInputStream();
        //TODO 使用转换流将获取到的字节流转换成字符流
        // 4. IO 读取, 使用字符流, 使用 InputStreamReader 将 inputStream 转成字符流
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        //需要使用readLine的方式读取，底层是使用write.newLine()//换行符作为结束标志
        String question = bufferedReader.readLine();

        String answer = "";
        if ("name".equals(question)) {
            answer = "tugou";
        } else if ("hobby".equals(question)) {
            answer = "eat";
        }else {
            answer="你说啥呢";
        }

//        System.out.println(s);

        //使用字符输出流的方式
        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write(answer);
        bufferedWriter.newLine();//插入一个换行，表示输入结束
        bufferedWriter.flush();//将内容刷入到socket数据通道

        //关闭外层流和socket
        bufferedWriter.close();
        bufferedReader.close();
        socket.close();
        serverSocket.close();


    }
}
