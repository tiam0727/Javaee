package object_;

import java.util.Arrays;

/**
 * @author: 徐杰
 * @description: 如何追溯源码
 * 方案一 使用forcei step into alt+shift+F7
 * 方案二 自己配置
 * Setting--》Build，Ex··· --->Debugger -->Stepping
 * 把Do not step into the class 中的 java.*,javax.*取消勾选
 * @dateTime: 2024/3/1 10:45
 * @return
 **/
public class debugWay {
    public static void main(String[] args) {
        int[] arr={2,1,3,4,-1};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
