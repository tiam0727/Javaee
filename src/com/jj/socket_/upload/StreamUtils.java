package com.jj.socket_.upload;

import java.io.*;

/**
 * @author: xj
 * @description: 演示将输入流转换为byte[]
 * @dateTime: 2024/3/23 17:26
 **/
public class StreamUtils {
    /**
     * 功能 将输入流转换成byte[],即可以将文件的内容读入到byte[]
     * @param inputStream
     * @throws IOException
     */
    public static byte[] streamToByteArray(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();//创建输出流对象
        byte[] bytes = new byte[1024];//字节对象
        int len;
        while((len=inputStream.read(bytes))!=-1){//循环读取
            byteArrayOutputStream.write(bytes,0,len);//将读取的内容写入byteArrayOutputStream
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        return byteArray;
    }

    public static String streamToString(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder stringBuilder = new StringBuilder();
        String line;

        while ((line=bufferedReader.readLine())!=null){
            stringBuilder.append(line);
        }
        return stringBuilder.toString();
    }
}
