package com.jj.socket_;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author: xj
 * @description: 客户端
 * @dateTime: 2024/3/23 16:27
 **/
public class SocketTCP03Client {
    public static void main(String[] args) throws IOException {
        InetAddress localHost = InetAddress.getLocalHost();

        Socket socket = new Socket(localHost, 9999);

        OutputStream outputStream = socket.getOutputStream();

        //使用转换流将字节流转换为字符流
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        bufferedWriter.write("hello server 字符流");
        bufferedWriter.newLine();//插入一个换行符，表示写入的内容结束，注意，要求对方使用readLine()!!!
        bufferedWriter.flush();//必须要有flush操作，不然数据没办法进入到socket;

        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        String s = bufferedReader.readLine();
        System.out.println(s);

        //关闭外层流和socket
        bufferedReader.close();
        bufferedWriter.close();
        socket.close();



    }
}
