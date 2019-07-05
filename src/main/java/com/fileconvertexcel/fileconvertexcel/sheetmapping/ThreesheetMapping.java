package com.fileconvertexcel.fileconvertexcel.sheetmapping;

import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class ThreesheetMapping {
    private Map<Integer , String> listMap ;
    public  void setThreeMap(){
        listMap = new LinkedHashMap<Integer, String>();
        listMap.put(0 , "vcRealno" ); //成交编号
        listMap.put(1 , "vcOwn" ); //本方
        listMap.put(2 , "vcOwntrader" ); //本方交易员
        listMap.put(3 , "vcRival" ); //对手方
        listMap.put(4 , "vcRivalOrg" ); //对手方主机构
        listMap.put(5 , "vcRivalTrader" ); //对手方交易员
        listMap.put(6 , "vcTradeDirec" ); //交易方向
        listMap.put(7 , "vcStockCode" ); //债券代码
        listMap.put(8 , "vcStockName" ); //债券名称
        listMap.put(9 , "enReporate" ); //回购利率
        listMap.put(10 , "enFirstNetprice" ); //首期净价
        listMap.put(11 , "enExpireNetprice" ); //到期净价
        listMap.put(12 , "enFirstProfitratio" ); //首次收益率
        listMap.put(13 , "enExpireProfitratio" ); //到期收益率
        listMap.put(14 , "enFacevalue" ); //券面总额===>票名总额
        listMap.put(15 , "lHgDays" ); //回购期限
        listMap.put(16 , "enFirstInterest" ); //首次应计利息
        listMap.put(17 , "enFirstFullprice" ); //首次全价
        listMap.put(18 , "enExpireInterest" ); //到期应计利息
        listMap.put(19 , "enExpireFullprice" ); //到期全价
        listMap.put(20 , "lFirstSettledate" ); //首次结算日
        listMap.put(21 , "lExpireSettledate" ); //到期结算日
        listMap.put(22 , "enFirseSettlebalance" ); //首次结算金额
        listMap.put(23 , "enExpireSettlebalance" ); //到期结算金额
        listMap.put(24 , "lActualDays" ); //实际占款天数
        listMap.put(25 , "vcTradeCode" ); //交易品种
        listMap.put(26 , "vcFirstSettletype" ); //首次结算方式
        listMap.put(27 , "vcExpireSettletype" ); //到期结算方式
        listMap.put(28 , "vcLiquidtype" ); //清算类型
        listMap.put(29 , "vcNetLiquidStatus" ); //净额清算状态
        listMap.put(30 , "vcStatus" ); //状态
        listMap.put(31 , "vcRealdealTime" ); //成交时间
        listMap.put(32 , "vcAdditionalInfo" ); //补充条款
        listMap.put(33 , "vcUpdateTime" ); //更新日
        listMap.put(34 , "vcRealseq" ); //成交序列号
        listMap.put(35 , "vcCashaccountName" ); //资金账户户名
        listMap.put(36 , "vcCashaccountBank" ); //资金开户行
        listMap.put(37 , "vcCashaccount" ); //资金账号
        listMap.put(38 , "vcPaymentNo" ); //支付系统行号
        listMap.put(39 , "vcDepositAccountName" ); //托管账户户名
        listMap.put(40 , "vcDeposit" ); //托管机构
        listMap.put(41 , "vcDepositAccount" ); //托管账号
    }
    public Map<Integer , String> getThreeMap(){
        return this.listMap;
    }
}
