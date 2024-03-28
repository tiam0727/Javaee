package com.jj.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author: xj
 * @description: UDP 接收端
 * @dateTime: 2024/3/23 23:34
 **/
public class UDPReceiverA {
    public static void main(String[] args) throws IOException {
        //1. 创建一个DatagramSocket对象，准备在9999接收数据
        DatagramSocket socket = new DatagramSocket(9999);
        //2. 构建一个DatagramPacket对象，准备接收数据
        //UDP协议一个数据包的大小的最大为64k
        byte[] bytes = new byte[64 * 1024];
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);
        //3. 调用接受方法，将网络传输的DatagramPacket对象填充到packet对象
        socket.receive(datagramPacket);
        //  如果没有数据包发送到9999端口，就会阻塞等待，如果确有就支持接收
        //4. 可以把packet进行拆包，取出数据，并显示
        // 获取实际的数据长度
        int length = datagramPacket.getLength();
        //获取数据
        byte[] data = datagramPacket.getData();
        String s = new String(data,0, length);
        System.out.println(s);

        //回复消息给b
        data = "ok".getBytes();

        //说明：封装的DatagramPacket对象 data内容字节数组，data.lenth（） 主机（IP），端口
        DatagramPacket packet = new DatagramPacket
                (data, data.length, InetAddress.getByName("192.168.30.1"), 9998);
        socket.send(packet);

    }
}
