package com.jj.socket_.upload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author: xj
 * @description: 文件上传的服务端
 * @dateTime: 2024/3/23 16:53
 **/
public class TCPFileUploadServer {
    public static void main(String[] args) throws IOException {
        //1. 服务端在本机监听8888端口
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
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        byte[] bytes = StreamUtils.streamToByteArray(bufferedInputStream);
        //得到bytes数组，写入指定路径，就得到一个文件
        String destFilePath="src\\q.png";
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(destFilePath));
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.close();

        OutputStream outputStream = socket.getOutputStream();

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("收到图片哈哈");
        bufferedWriter.flush();//把内容刷新到数据通道
        socket.shutdownOutput();//写入结束标记
        bufferedWriter.close();//写完将相关的流关闭

        //关闭其他源
        outputStream.close();
        bufferedInputStream.close();
        socket.close();
        serverSocket.close();


    }
}
