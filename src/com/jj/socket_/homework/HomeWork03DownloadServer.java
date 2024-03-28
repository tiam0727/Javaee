package com.jj.socket_.homework;

import com.jj.socket_.upload.StreamUtils;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author: xj
 * @description:
 * @dateTime: 2024/3/28 17:51
 **/
public class HomeWork03DownloadServer {
    public static void main(String[] args) throws IOException {
        //1. 服务端在本机监听8888端口，读取需要发送的文件名字
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("服务端等待连接.....");
        //2. 等待连接
        Socket socket = serverSocket.accept();

        //通过socket得到一个输入流
        /*
        InputStream：通过源码可以看到，如果用read()方法读取一个文件，每读取一个字节就要访问一次硬盘，这种读取的方式效率是很低的。即便使用read(byte b[])方法一次读取多个字节，每次读取多个字节就要访问一次硬盘。当读取的文件较大时，也会频繁的对磁盘操作。
        BufferedInputStream：也就是说，Buffered类初始化时会创建一个较大的byte数组，一次性从底层输入流中读取多个字节来填充byte数组，当程序读取一个或多个字节时，可直接从byte数组中获取，当内存中的byte读取完后，会再次用底层输入流填充缓冲区数组。这种从直接内存中读取数据的方式要比每次都访问磁盘的效率高很多。
        总结:
        1. InputStream每次read，都需要从硬件读取文件一个或者若干个字节。
        2. BufferedInputStream会提前读取默认大小字节到内部缓冲区，每次read都直接从内存读取一个或若干个字节。
         */
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int readLen;
        String fileName = "";
        System.out.println("服务端已经连接 ");
        // 使用while循环是考虑将来客户端发送的数据较大的情况，目前可以不使用
        while ((readLen = inputStream.read(bytes)) != -1) {
            System.out.println("正在读取文件名");
            fileName += new String(bytes, 0, readLen);//根据实际读取的长度显示内容
        }


        System.out.println("用户想下载 " + fileName.length());
        //如果下载的是Todd Li - 小宇 ,我们就返回该文件否则一律返回沈以诚 - 形容
        //创建文件输入流
        String filePath = "";

        if ("Todd Li - 小宇".equals(fileName)) {
            filePath = "E:\\CloudMusic\\Todd Li - 小宇.mp3";
        } else {
            filePath = "E:\\CloudMusic\\沈以诚 - 形容.mp3";
        }
        BufferedInputStream bufferedInputStream =
                new BufferedInputStream(new FileInputStream(filePath));
        //使用工具类将输入缓冲流转换为字节数组
        bytes = StreamUtils.streamToByteArray(bufferedInputStream);
        //将转换后的字节数组写入到数据通道，返回给客户端
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
        bufferedOutputStream.write(bytes);
        //加上结束标志
        socket.shutdownOutput();


        //关闭其他源
        bufferedOutputStream.close();
        bufferedInputStream.close();
        socket.close();
        serverSocket.close();


    }
}
