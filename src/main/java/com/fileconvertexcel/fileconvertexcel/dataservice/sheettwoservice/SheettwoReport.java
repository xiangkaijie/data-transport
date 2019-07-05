package com.fileconvertexcel.fileconvertexcel.dataservice.sheettwoservice;

import com.fileconvertexcel.fileconvertexcel.dataservice.DataReport;
import com.fileconvertexcel.fileconvertexcel.sheetinfo.SheetTwo;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class SheettwoReport implements DataReport {

    @Autowired
    public SheetTwojpa sheetTwojpa;
    @Value("${sheettwo.filepath}")
    private  String filepath;
    //存储上一次的数据库信息；
    private List<SheetTwo> oldSheetinfo =  new ArrayList<SheetTwo>();
    public void reportToExcel(){
        SheetTwo sheetTwo = sheetTwojpa.getOne(1);

        List<SheetTwo> listsheet = sheetTwojpa.findAll();
        //此处对oldSheetinfo进行判断，如果没有更新或者为空，表明写线程连续写入或者比读线程先抢占到资源，则让写线程处于sleep状态,时间为5秒；

        if(listsheet.equals(this.oldSheetinfo ) || this.oldSheetinfo.isEmpty()){
            try {
                Thread.currentThread().sleep(5000);
                listsheet = sheetTwojpa.findAll();
                if( this.oldSheetinfo.isEmpty() ){
                    //如果为空指针，说明为空数据，则使用add()方法填充
                    for (SheetTwo SheetTwo : listsheet){
                        (this.oldSheetinfo).add(SheetTwo);
                    }
                }else{
                    //如果不为空，则说明是写线程连续写入，则要更新数据；
                    for(int i = 0 ; i<listsheet.size() ; i++){
                        //将对象进行赋值；
                        //this.oldSheetinfo.get(i).setEqual( listsheet.get(i));
                    }
                }

            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //创建一个表格；
        HSSFWorkbook wb = new HSSFWorkbook();
        //sheet对应一个工作页；
        HSSFSheet sheet = wb.createSheet("sheet1");
        HSSFRow row = sheet.createRow(0);
        //创建第一行；
        //可以通过poi 直接设计单元格的属性（如设计单元格为文本类型，单元格长度、高度等）
        row.createCell(0).setCellValue("成交编号");
        row.createCell(1).setCellValue("本方交易员");
        row.createCell(2).setCellValue("本方");
        row.createCell(3).setCellValue("对手方");
        row.createCell(4).setCellValue("对手方主机构");
        row.createCell(5).setCellValue("对手方交易员");
        row.createCell(6).setCellValue("交易方向");
        row.createCell(7).setCellValue("代码");
        row.createCell(8).setCellValue("名称");
        row.createCell(9).setCellValue("来源");
        row.createCell(10).setCellValue("每百元本金额（元）");
        row.createCell(11).setCellValue("净价（元）");
        row.createCell(12).setCellValue("到期收益率（%）");
        row.createCell(13).setCellValue("行权收益率（%）");
        row.createCell(14).setCellValue("本金额（元）");
        row.createCell(15).setCellValue("券面总额（万元）");
        row.createCell(16).setCellValue("交易金额（元）");
        row.createCell(17).setCellValue("结算日");
        row.createCell(18).setCellValue("应计利息（元）");
        row.createCell(19).setCellValue("全价（元）");
        row.createCell(20).setCellValue("应计利息总额（元）");
        row.createCell(21).setCellValue("结算金额（元）");
        row.createCell(22).setCellValue("结算方式");
        row.createCell(23).setCellValue("清算类型");
        row.createCell(24).setCellValue("净额清算状态");
        row.createCell(25).setCellValue("补充条款");
        row.createCell(26).setCellValue("成交状态");
        row.createCell(27).setCellValue("成交时间");
        row.createCell(28).setCellValue("交易方式");
        row.createCell(29).setCellValue("交易类型");
        row.createCell(30).setCellValue("成交序列号");
        row.createCell(31).setCellValue("债券类型");
        row.createCell(32).setCellValue("资金账户户名");
        row.createCell(33).setCellValue("资金开户行");
        row.createCell(34).setCellValue("资金账号");
        row.createCell(35).setCellValue("支付系统行号");
        row.createCell(36).setCellValue("托管账户户名");
        row.createCell(37).setCellValue("托管机构");
        row.createCell(38).setCellValue("托管账号");
        row.createCell(39).setCellValue("报价来源");
        row.createCell(40).setCellValue("标签");
        row.createCell(41).setCellValue("接入平台");

        //通过循环遍历，将之传入；
        for(int i = 0;i < listsheet.size();i++){
            row = sheet.createRow(i + 1);
            //一共是36列；
            row.createCell(0).setCellValue(listsheet.get(i).getVcRealno());
            row.createCell(1).setCellValue(listsheet.get(i).getVcOwntrader());
            row.createCell(2).setCellValue(listsheet.get(i).getVcOwn());
            row.createCell(3).setCellValue(listsheet.get(i).getVcRival());
            row.createCell(4).setCellValue(listsheet.get(i).getVcRivalOrg());
            row.createCell(5).setCellValue(listsheet.get(i).getVcRivalTrader());
            row.createCell(6).setCellValue(listsheet.get(i).getVcTradeDirec());
            row.createCell(7).setCellValue(listsheet.get(i).getVcStockCode());
            row.createCell(8).setCellValue(listsheet.get(i).getVcStockName());
            row.createCell(9).setCellValue(listsheet.get(i).getVcSource());
            if(listsheet.get(i).getEnCostunitBalance() == null){
                row.createCell(10).setCellValue("");
            }else{
                row.createCell(10).setCellValue(listsheet.get(i).getEnCostunitBalance());
            }
            row.createCell(11).setCellValue(listsheet.get(i).getEnFirstNetprice());
            row.createCell(12).setCellValue(listsheet.get(i).getEnExpireProfitratio());

            if(listsheet.get(i).getEnFirstProfitratio() == null){
                row.createCell(13).setCellValue("");
            }else{
                row.createCell(13).setCellValue(listsheet.get(i).getEnFirstProfitratio());
            }

            if(listsheet.get(i).getEnCostBalance() == null){
                row.createCell(14).setCellValue("");
            }else{
                row.createCell(14).setCellValue(listsheet.get(i).getEnCostBalance());
            }
            row.createCell(15).setCellValue(listsheet.get(i).getEnFacevalue());
            row.createCell(16).setCellValue(listsheet.get(i).getEnTradeBalance());

            //对结算日 字段 日期数据进行处理,将20190306 数据转成2019-03-06；
            String strlf = "";
            strlf = strlf + listsheet.get(i).getlSettleDate();
            strlf = strlf.substring(0,4) + "-" + strlf.substring(4,6) + "-" + strlf.substring(6,8);
            row.createCell(17).setCellValue(strlf);

            row.createCell(18).setCellValue(listsheet.get(i).getEnFirstInterest());
            row.createCell(19).setCellValue(listsheet.get(i).getEnFirstFullprice());
            row.createCell(20).setCellValue(listsheet.get(i).getEnExpireInterest());
            row.createCell(21).setCellValue(listsheet.get(i).getEnFirseSettlebalance());
            row.createCell(22).setCellValue(listsheet.get(i).getVcFirstSettletype());
            row.createCell(23).setCellValue(listsheet.get(i).getVcLiquidtype());
            row.createCell(24).setCellValue(listsheet.get(i).getVcNetLiquidStatus());
            row.createCell(25).setCellValue(listsheet.get(i).getVcAdditionalInfo());
            row.createCell(26).setCellValue(listsheet.get(i).getVcRealdealStatus());
            row.createCell(27).setCellValue(listsheet.get(i).getVcRealdealTime());
            row.createCell(28).setCellValue(listsheet.get(i).getVcTradeMode());
            row.createCell(29).setCellValue(listsheet.get(i).getVcTradeType());
            row.createCell(30).setCellValue(listsheet.get(i).getVcRealseq());
            row.createCell(31).setCellValue(listsheet.get(i).getVcBondType());
            row.createCell(32).setCellValue(listsheet.get(i).getVcCashaccountName());
            row.createCell(33).setCellValue(listsheet.get(i).getVcCashaccountBank());
            row.createCell(34).setCellValue(listsheet.get(i).getVcCashaccount());
            row.createCell(35).setCellValue(listsheet.get(i).getVcPaymentNo());
            row.createCell(36).setCellValue(listsheet.get(i).getVcDepositAccountName());
            row.createCell(37).setCellValue(listsheet.get(i).getVcDeposit());
            row.createCell(38).setCellValue(listsheet.get(i).getVcDepositAccount());
            row.createCell(39).setCellValue(listsheet.get(i).getVcQuotaSource());
            row.createCell(40).setCellValue(listsheet.get(i).getVcLabel());
            row.createCell(41).setCellValue(listsheet.get(i).getVcPlatform());
        }
        OutputStream os = null;
        try {
            Date now = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//可以方便地修改日期格式
            String time = dateFormat.format( now ).replaceAll("[[\\s-:punct:]]","");
            time = time.replaceAll("/" , "");
            String filename =this.filepath + "/version" + time + ".xls";
            os = new FileOutputStream( filename );
            try {
                wb.write( os );
                System.out.println("数据表二导出完成");

            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
