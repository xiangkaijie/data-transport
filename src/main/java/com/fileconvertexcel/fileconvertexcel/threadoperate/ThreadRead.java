package com.fileconvertexcel.fileconvertexcel.threadoperate;

import com.fileconvertexcel.fileconvertexcel.dataservice.sheetoneservice.SheetoneImport;
import com.fileconvertexcel.fileconvertexcel.dataservice.sheettwoservice.SheettwoImport;
import com.fileconvertexcel.fileconvertexcel.dataservice.sheetthreeservice.SheetthreeImport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class ThreadRead extends  Thread {

    private  int mode;
    @Autowired
    SheetoneImport sheetoneImport;
    @Autowired
    SheettwoImport sheettwoImport;
    @Autowired
    SheetthreeImport sheetthreeImport;

    public void setThread(int mode){

        this.mode = mode;
    }

    public void run(){
        System.out.println("当前线程是： " + Thread.currentThread().getName());
        switch (this.mode){
            case 1:
                System.out.println("数据表一开始导入数据库");
                sheetoneImport.importDatabase();
                break;
            case 2:
                System.out.println("数据表二开始导入数据库");
                sheettwoImport.importDatabase();
                break;
            case 3:
                System.out.println("数据表三开始导入数据库");
                sheetthreeImport.importDatabase();
                break;
        }
    }
}
