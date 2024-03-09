package com.jj.wrapper.system_;

import java.util.Arrays;

/**
 * @author: xj
 * @description: system类
 * @dateTime: 2024/3/9 15:35
 **/
public class System_ {
    public static void main(String[] args) {
//        //exit 退出当前程序
//        System.out.println("ok");
//        System.exit(0);
//        //1. exit(0)表示退出的状态时正常退出
//        System.out.println("ok");
        int[] src={1,2,3};
        int[] dest = new int[3];//状态[0,0,0]
        /**
         * 1. 主要是五个参数的含义
         * 2.
         *      @param  src    the source array
         *      @param  srcPos  从原数组的哪个位置开始拷贝
         *      @param  dest    即把原数组的数据拷贝到哪个数组中
         *      @param  destPos 把原数组拷贝到目标数组的哪个位置（）索引
         *      @param  length  从原数组拷贝多少个数据到目标数组
         */
        System.arraycopy(src,0,dest,0,src.length);
        System.out.println(Arrays.toString(dest));

        //currentTimeMillions:返回当前时间距离1970-1-1的时间 毫秒级
        System.out.println(System.currentTimeMillis());
        System.gc();

    }
}
