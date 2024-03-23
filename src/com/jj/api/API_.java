package com.jj.api;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author: xj
 * @description: 编写代码，获取计算机的主机名和 IP 地址相关 API
 * @dateTime: 2024/3/23 14:27
 **/
public class API_ {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress localHost = InetAddress.getLocalHost();
        //1. 获取本机InetAddress对象
        System.out.println(localHost);//LAPTOP-V21BQB2J/192.168.30.1
        //2. 根据指定的主机名，获取对象
        InetAddress host1 = InetAddress.getByName("LAPTOP-V21BQB2J");
        System.out.println("host1= " + host1);
        //3. 根据域名获取本地 的InetAddress对象，比如百度
        InetAddress host = InetAddress.getByName("www.baidu.com");
        System.out.println("host=" + host);

        //4. 通过 InetAddress对象获取对应的地址(IP地址)
        String IP = host.getHostAddress();
        System.out.println("host的IP对应+ " + IP);

        //5. 通过InetAddress对象获取对应的主机名或者域名
        String hostName = host.getHostName();
        System.out.println("host对应的主机名或者域名为：" + hostName);
    }
}
