package com.jj.thread;

import java.util.concurrent.Callable;

/**
 * @author: xj
 * @description:
 * @dateTime: 2024/3/20 10:57
 **/
public class MyCallable implements Callable {
    private String ss;

    public MyCallable(String s) {
        this.ss = s;
    }

    @Override
    public Object call() throws Exception {
        return ss;
    }
}
