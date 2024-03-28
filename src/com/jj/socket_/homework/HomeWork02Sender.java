package com.jj.socket_.homework;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * @author: xj
 * @description:
 * @dateTime: 2024/3/28 17:41
 **/
public class HomeWork02Sender {
    public static void main(String[] args) throws IOException {
        //创建DatagramSocket对象，准备发送和接受数据在9998端口

        DatagramSocket socket = new DatagramSocket(9998);
        //2. 将发送的数据封装到DatagramPacket
        System.out.println("请输入问题:\t");
        Scanner scanner = new Scanner(System.in);
        String question = scanner.next();
        byte[] bytes = question.getBytes();

        //说明：封装的DatagramPacket对象 data内容字节数组，data.lenth（） 主机（IP），端口
        DatagramPacket datagramPacket = new DatagramPacket
                (bytes, bytes.length, InetAddress.getByName("192.168.30.1"),8888);
        socket.send(datagramPacket);


        //接收A端回复的信息
        //2. 构建一个DatagramPacket对象，准备接收数据
        //UDP协议一个数据包的大小的最大为64k
        bytes = new byte[64 * 1024];
        datagramPacket = new DatagramPacket(bytes, bytes.length);
        //3. 调用接受方法，将网络传输的DatagramPacket对象填充到packet对象
        socket.receive(datagramPacket);
        //  如果没有数据包发送到9998端口，就会阻塞等待，如果确有就支持接收
        //4. 可以把packet进行拆包，取出数据，并显示
        // 获取实际的数据长度
        int length = datagramPacket.getLength();
        //获取数据
        byte[] data = datagramPacket.getData();
        String s = new String(data, 0,length);
        System.out.println(s);


        //关闭资源
        socket.close();
        System.out.println("B端退出");
    }
}
