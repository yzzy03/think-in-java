package com.axatp.test.thead;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by zhangzhongxia on 2017/12/24.
 */
public class CachedThreadPool {

    public static void main(String[] args){
        ExecutorService es = Executors.newCachedThreadPool();
        for(int i=0;i<5;i++){
            es.execute(new Counter(10));
            es.shutdown();
        }
    }
}
