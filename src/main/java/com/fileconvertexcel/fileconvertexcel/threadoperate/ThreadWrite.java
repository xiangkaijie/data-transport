package com.fileconvertexcel.fileconvertexcel.threadoperate;

import com.fileconvertexcel.fileconvertexcel.dataservice.sheetoneservice.SheetoneReport;
import com.fileconvertexcel.fileconvertexcel.dataservice.sheetthreeservice.SheetthreeReport;
import com.fileconvertexcel.fileconvertexcel.dataservice.sheettwoservice.SheettwoReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class ThreadWrite extends  Thread{
    @Autowired
    SheetoneReport sheetoneReport;
    @Autowired
    SheettwoReport sheettwoReport;
    @Autowired
    SheetthreeReport sheetthreeReport;
    private  int mode;
    public void setThread( int mode ){

        this.mode = mode;
    }

    public void run(){
        System.out.println("当前线程是： " + Thread.currentThread().getName());
        switch (this.mode){
            case 1:
                System.out.println("数据表一导出数据库");
                sheetoneReport.reportToExcel();
                break;
            case 2:
                System.out.println("在数据表二导出数据库");
                sheettwoReport.reportToExcel();
                break;
            case 3:
                System.out.println("在数据表三导出数据库");
                sheetthreeReport.reportToExcel();
                break;
        }
    }

}
