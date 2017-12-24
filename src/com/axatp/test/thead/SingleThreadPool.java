package com.axatp.test.thead;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by zhangzhongxia on 2017/12/24.
 */
public class SingleThreadPool {

    public static void main(String[] args){
        ExecutorService es = Executors.newSingleThreadExecutor();
        for(int i=0;i<5;i++){
            es.execute(new Counter(15));
        }
        es.shutdown();
    }
}
