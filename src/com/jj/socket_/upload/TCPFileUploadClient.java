package com.jj.socket_.upload;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author: xj
 * @description: 文件上传的客户端
 * @dateTime: 2024/3/23 16:53
 **/
public class TCPFileUploadClient {
    public static void main(String[] args) throws IOException {


        //客户端连接服务器
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        //读取磁盘上的文件输入流中
        String filePath = "C:\\Users\\xujie\\Desktop\\狗.png";
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath));
        //bytes 就是文件的内容
        byte[] bytes = StreamUtils.streamToByteArray(bis);
        //获取输出流，将文件写入到输出流中，发送到服务端
        OutputStream outputStream = socket.getOutputStream();
//        outputStream.write(bytes);

        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        bufferedOutputStream.write(bytes);
        System.out.println("正在发送图片.....");
        socket.shutdownOutput();//设置写入的结束标记
        //关闭流

        InputStream inputStream = socket.getInputStream();
//        bytes = new byte[1024];
//        int readLen = 0;
//        while ((readLen = inputStream.read(bytes)) != -1) {
//            System.out.print(new String(bytes, 0, readLen));
//        }
        String s = StreamUtils.streamToString(inputStream);
        System.out.println(s);

        inputStream.close();
        bufferedOutputStream.close();
        bis.close();
        socket.close();

    }
}
