package com.fileconvertexcel.fileconvertexcel;

import com.fileconvertexcel.fileconvertexcel.threadoperate.MainThread;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class OntimeService {
    int version = 1;
    @Autowired
    MainThread mainThread1;
    @Autowired
    MainThread mainThread2;
    @Autowired
    MainThread mainThread3;
    @Scheduled(cron = "0/15 * * * * *")
    public  void runTask(){
        //指定定时任务，时间为30秒；
        System.out.println("定时任务开始工作");

        //表格一的定时任务
         mainThread1.setMainThread(this.version , 1);
         mainThread1.threadInit();
         mainThread1.start();


        mainThread2.setMainThread(this.version , 2);
        mainThread2.threadInit();
        mainThread2.start();


        mainThread3.setMainThread(this.version , 3);
        mainThread3.threadInit();
        mainThread3.start();

        this.version++;

    }

}
