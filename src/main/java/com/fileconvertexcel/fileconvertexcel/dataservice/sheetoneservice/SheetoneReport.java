package com.fileconvertexcel.fileconvertexcel.dataservice.sheetoneservice;

import com.fileconvertexcel.fileconvertexcel.dataservice.DataReport;
import com.fileconvertexcel.fileconvertexcel.sheetinfo.SheetOne;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class SheetoneReport implements DataReport {

    @Autowired
    public SheetOnejpa sheetonejpa;
    //从配置文件中读取文件路径
    @Value("${sheetone.filepath}")
    private  String filepath;
    //存储上一次的数据库信息；
    private List<SheetOne> oldSheetinfo = new ArrayList<SheetOne>();
    public void reportToExcel(){

        List<SheetOne> listsheet = sheetonejpa.findAll();
        //此处对oldSheetinfo进行判断，如果没有更新或者为空，表明写线程连续写入或者比读线程先抢占到资源，则让写线程处于sleep状态,时间为5秒；
        if(listsheet.equals(this.oldSheetinfo ) || this.oldSheetinfo.isEmpty()){
            try {
                Thread.currentThread().sleep(5000);
                listsheet = sheetonejpa.findAll();
                if( this.oldSheetinfo.isEmpty() ){
                    //如果为空指针，说明为空数据，则使用add()方法填充
                    for (SheetOne sheetOne : listsheet){
                        (this.oldSheetinfo).add(sheetOne);
                    }
                }else{
                    //如果不为空，则说明是写线程连续写入，则要更新数据；
                    for(int i = 0 ; i<listsheet.size() ; i++){
                        //将对象进行赋值；
                        this.oldSheetinfo.get(i).setEqual( listsheet.get(i));
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
        //创建第一行；
        HSSFRow row = sheet.createRow(0);
        //可以通过poi 直接设计单元格的属性（如设计单元格为文本类型，单元格长度、高度等）
        row.createCell(0).setCellValue("成交编号");
        row.createCell(1).setCellValue("交易方式");
        row.createCell(2).setCellValue("本方");
        row.createCell(3).setCellValue("本方交易员");
        row.createCell(4).setCellValue("对手方");
        row.createCell(5).setCellValue("对手方主机构");
        row.createCell(6).setCellValue("对手方交易员");
        row.createCell(7).setCellValue("交易方向");
        row.createCell(8).setCellValue("回购利率(%)");
        row.createCell(9).setCellValue("债券代码");
        row.createCell(10).setCellValue("债券名称");
        row.createCell(11).setCellValue("折算比例(%)");
        row.createCell(12).setCellValue("券面总额合计(万元)");
        row.createCell(13).setCellValue("交易金额(元)");
        row.createCell(14).setCellValue("回购期限(天)");
        row.createCell(15).setCellValue("应计利息(元)");
        row.createCell(16).setCellValue("首次结算日");
        row.createCell(17).setCellValue("到期结算日");
        row.createCell(18).setCellValue("实际占款天数");
        row.createCell(19).setCellValue("到期结算金额(元)");
        row.createCell(20).setCellValue("交易品种");
        row.createCell(21).setCellValue("首次结算方式");
        row.createCell(22).setCellValue("到期结算方式");
        row.createCell(23).setCellValue("清算类型");
        row.createCell(24).setCellValue("净额清算状态");
        row.createCell(25).setCellValue("状态");
        row.createCell(26).setCellValue("成交时间");
        row.createCell(27).setCellValue("补充条款");
        row.createCell(28).setCellValue("成交序列号");
        row.createCell(29).setCellValue("资金账户户名");
        row.createCell(30).setCellValue("资金开户行");
        row.createCell(31).setCellValue("资金账号");
        row.createCell(32).setCellValue("支付系统行号");
        row.createCell(33).setCellValue("托管账户户名");
        row.createCell(34).setCellValue("托管机构");
        row.createCell(35).setCellValue("托管账号");

        //通过循环遍历，将之传入；
        for(int i = 0;i < listsheet.size();i++){
            row = sheet.createRow(i + 1);
            //一共是36列；
            row.createCell(0).setCellValue(listsheet.get(i).getVcRealno());
            row.createCell(1).setCellValue(listsheet.get(i).getVcTradeType());
            row.createCell(2).setCellValue(listsheet.get(i).getVcOwn());
            row.createCell(3).setCellValue(listsheet.get(i).getVcOwntrader());
            row.createCell(4).setCellValue(listsheet.get(i).getVcRival());
            row.createCell(5).setCellValue(listsheet.get(i).getVcRivalOrg());
            row.createCell(6).setCellValue(listsheet.get(i).getVcRivalTrader());
            row.createCell(7).setCellValue(listsheet.get(i).getVcTradeDirec());
            row.createCell(8).setCellValue(listsheet.get(i).getEnReporate());
            row.createCell(9).setCellValue(listsheet.get(i).getVcStockCode());
            row.createCell(10).setCellValue(listsheet.get(i).getVcStockName());
            row.createCell(11).setCellValue(listsheet.get(i).getEnConversionRatio());
            row.createCell(12).setCellValue(listsheet.get(i).getEnFacevalue());
            row.createCell(13).setCellValue(listsheet.get(i).getEnTradeBalance());
            row.createCell(14).setCellValue(listsheet.get(i).getlHgDays());
            row.createCell(15).setCellValue(listsheet.get(i).getEnFirstInterest());
            //首期结算日和到期结算日的字符串需要处理；
            String strlf = "";
            strlf = strlf + listsheet.get(i).getlFirstSettledate();
            strlf = strlf.substring(0,4) + "-" + strlf.substring(4,6) + "-" + strlf.substring(6,8);
            String strle = "";
            strle = strle + listsheet.get(i).getlExpireSettledate();
            strle = strle.substring(0,4) + "-" + strle.substring(4,6) + "-" + strle.substring(6,8);
            row.createCell(16).setCellValue(strlf);
            row.createCell(17).setCellValue(strle);
            row.createCell(18).setCellValue(listsheet.get(i).getlActualDays());
            row.createCell(19).setCellValue(listsheet.get(i).getEnExpireSettlebalance());
            row.createCell(20).setCellValue(listsheet.get(i).getVcTradeCode());
            row.createCell(21).setCellValue(listsheet.get(i).getVcFirstSettletype());
            row.createCell(22).setCellValue(listsheet.get(i).getVcExpireSettletype());
            row.createCell(23).setCellValue(listsheet.get(i).getVcLiquidtype());
            row.createCell(24).setCellValue(listsheet.get(i).getVcNetLiquidStatus());
            row.createCell(25).setCellValue(listsheet.get(i).getVcStatus());
            row.createCell(26).setCellValue(listsheet.get(i).getVcRealdealTime());
            row.createCell(27).setCellValue(listsheet.get(i).getVcAdditionalInfo());
            row.createCell(28).setCellValue(listsheet.get(i).getVcRealseq());
            row.createCell(29).setCellValue(listsheet.get(i).getVcCashaccountName());
            row.createCell(30).setCellValue(listsheet.get(i).getVcCashaccountBank());
            row.createCell(31).setCellValue(listsheet.get(i).getVcCashaccount());
            row.createCell(32).setCellValue(listsheet.get(i).getVcPaymentNo());
            row.createCell(33).setCellValue(listsheet.get(i).getVcDepositAccountName());
            row.createCell(34).setCellValue(listsheet.get(i).getVcDeposit());
            row.createCell(35).setCellValue(listsheet.get(i).getVcDepositAccount());
        }

        OutputStream os = null;
        try {
            Date now = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//可以方便地修改日期格式
            String time = dateFormat.format( now ).replaceAll("[[\\s-:punct:]]","");
            time = time.replaceAll("/" , "");
            String filename =this.filepath + "/version" + time + ".xls";
            os = new FileOutputStream( filename);
            try {
                wb.write( os );
                //将新的版本数据转移给旧版本；
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }finally {
            try {
                os.close();
                System.out.println("数据表一导出完成");

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
