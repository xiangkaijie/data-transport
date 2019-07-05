package com.fileconvertexcel.fileconvertexcel.threadoperate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class MainThread {

    @Autowired
    private ThreadRead threadRead;
    @Autowired
    private  ThreadWrite threadWrite;
    private  int mode;
    private int version;
    public void setMainThread( int version , int mode ){
        this.version = version;
        this.mode = mode;
    }
    //此处可以设计成工厂设计模式；
    public void threadInit(){
        threadRead.setThread(this.mode);
        threadWrite.setThread(this.mode);
    }

    public void start(){
        //如果verson为1,则需要加载线程，如果不唯一则线程已存在，直接调用run，否则报重复加载线程错误；
        if(this.version == 1){
            threadRead.start();
        }
        else{
            threadRead.run();
        }
        if (this.version == 1){
            threadWrite.start();
        }
        else{
            threadWrite.run();
        }

    }

}
