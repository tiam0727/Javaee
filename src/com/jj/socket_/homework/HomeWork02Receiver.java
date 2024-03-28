package com.jj.socket_.homework;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author: xj
 * @description:
 * @dateTime: 2024/3/28 17:41
 **/
public class HomeWork02Receiver {
    public static void main(String[] args) throws IOException {
        //1. 创建一个DatagramSocket对象，准备在9999接收数据
        DatagramSocket socket = new DatagramSocket(8888);
        //2. 构建一个DatagramPacket对象，准备接收数据
        //UDP协议一个数据包的大小的最大为64k
        byte[] bytes = new byte[64 * 1024];
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);
        //3. 调用接受方法，将网络传输的DatagramPacket对象填充到packet对象
        socket.receive(datagramPacket);
        System.out.println("接收端正在等待接收");
        //  如果没有数据包发送到9999端口，就会阻塞等待，如果确有就支持接收
        //4. 可以把packet进行拆包，取出数据，并显示
        // 获取实际的数据长度
        int length = datagramPacket.getLength();
        //获取数据
        byte[] data = datagramPacket.getData();
        String s = new String(data,0, length);
        String ans="";
        if("四大名著有哪些".equals(s)){
            ans="<<红楼梦>>\t<<西游记>>\t<<三国演义>>\t<<水浒传>>";
        }else {
            ans="你说啥";
        }

        //回复消息给b
        data = ans.getBytes();

        //说明：封装的DatagramPacket对象 data内容字节数组，data.lenth（） 主机（IP），端口
        DatagramPacket packet = new DatagramPacket
                (data, data.length, InetAddress.getByName("192.168.30.1"), 9998);
        socket.send(packet);

        //关闭资源
        socket.close();
        System.out.println("A端退出");

    }

}
