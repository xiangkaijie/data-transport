package com.fileconvertexcel.fileconvertexcel.sheetmapping;

import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class TwosheetMapping {
    private Map<Integer , String> listMap ;
    public  void setTwoMap(){
        listMap = new LinkedHashMap<Integer, String>();
        listMap.put(0 , "vcRealno");//成交编号
        listMap.put(1 , "vcOwntrader");  //本方交易员
        listMap.put(2 , "vcOwn");  //本方
        listMap.put(3 , "vcRival");  //对手方
        listMap.put(4 , "vcRivalOrg");  //对手方主机构
        listMap.put(5 , "vcRivalTrader");  //对手方交易员
        listMap.put(6 , "vcTradeDirec");  //交易方向
        listMap.put(7 , "vcStockCode");  //债券代码
        listMap.put(8 , "vcStockName");  //债券名称
        listMap.put(9 , "vcSource");  //来源
        listMap.put(10 , "enCostunitBalance"); //每百元本金额
        listMap.put(11 , "enFirstNetprice"); //首期净价
        listMap.put(12 , "enExpireProfitratio"); //到期收益率
        listMap.put(13 , "enFirstProfitratio"); //行权收益率
        listMap.put(14 , "enCostBalance"); //本金额
        listMap.put(15 , "enFacevalue"); //券面总额
        listMap.put(16 , "enTradeBalance"); //交易金额
        listMap.put(17 , "lSettleDate"); //结算日
        listMap.put(18 , "enFirstInterest"); //应计利息
        listMap.put(19 , "enFirstFullprice"); //全价
        listMap.put(20 , "enExpireInterest"); //应计利息总额
        listMap.put(21 , "enFirseSettlebalance"); //结算金额
        listMap.put(22 , "vcFirstSettletype"); //结算方式
        listMap.put(23 , "vcLiquidtype"); //清算类型
        listMap.put(24 , "vcNetLiquidStatus"); //净额清算状态
        listMap.put(25 , "vcAdditionalInfo"); //补充条款
        listMap.put(26 , "vcRealdealStatus"); //成交状态
        listMap.put(27 , "vcRealdealTime"); //成交时间
        listMap.put(28 , "vcTradeMode"); //交易方式
        listMap.put(29 , "vcTradeType") ; //交易类型
        listMap.put(30 , "vcRealseq"); //成交序列号
        listMap.put(31 , "vcBondType"); //债券类型
        listMap.put(32 , "vcCashaccountName"); //资金账户户名
        listMap.put(33 , "vcCashaccountBank"); //资金开户行
        listMap.put(34 , "vcCashaccount"); //资金账号
        listMap.put(35 , "vcPaymentNo"); //支付系统行号
        listMap.put(36 , "vcDepositAccountName"); //托管账户户名
        listMap.put(37 , "vcDeposit"); //托管机构
        listMap.put(38 , "vcDepositAccount"); //托管账号
        listMap.put(39 , "vcQuotaSource"); //报价来源
        listMap.put(40 , "vcLabel"); //标签
        listMap.put(41 , "vcPlatform"); //接入平台
    }

    public Map<Integer , String> getTwoMap(){
        return this.listMap;
    }

}
