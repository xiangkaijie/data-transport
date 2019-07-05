package com.fileconvertexcel.fileconvertexcel.sheetmapping;

import org.springframework.stereotype.Service;
import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class OnesheetMapping {
    private Map<Integer , String > listMap;
    public void setSheetOneMap(){
        listMap = new LinkedHashMap<Integer, String>();
        listMap.put( 0 , "vcRealno"); //成交编号
        listMap.put( 1 , "vcTradeType"); //交易方式
        listMap.put( 2 , "vcOwn"); //本方
        listMap.put( 3 , "vcOwntrader"); //本方交易员
        listMap.put( 4 , "vcRival"); //对手方
        listMap.put( 5 , "vcRivalOrg"); //对手方主机构
        listMap.put( 6 , "vcRivalTrader"); //对手方交易员
        listMap.put( 7 , "vcTradeDirec"); //交易方向
        listMap.put( 8 , "enReporate"); //回购利率 单位%
        listMap.put( 9 , "vcStockCode");//债券代码
        listMap.put( 10 , "vcStockName"); //债券名称
        listMap.put( 11 , "enConversionRatio"); //折算比例
        listMap.put( 12 , "enFacevalue");//票面总额(万元)
        listMap.put( 13 , "enTradeBalance");//交易金额
        listMap.put( 14 , "lHgDays");//回购天数
        listMap.put( 15 , "enFirstInterest");//应计利息(元) =====>暂且用首次应计利息代替；
        listMap.put( 16 , "lFirstSettledate"); //首期结算日
        listMap.put( 17 , "lExpireSettledate");//到期结算日
        listMap.put( 18 , "lActualDays");//实际占款天数
        listMap.put( 19 , "enExpireSettlebalance");//到期结算金额(元)
        listMap.put( 20 , "vcTradeCode");//交易品种
        listMap.put( 21 , "vcFirstSettletype");//首次结算方式
        listMap.put( 22 , "vcExpireSettletype");//到期结算方式
        listMap.put( 23 , "vcLiquidtype");//清算类型
        listMap.put( 24 , "vcNetLiquidStatus");//净额清算状态
        listMap.put( 25 , "vcStatus");//状态
        listMap.put( 26 , "vcRealdealTime");//成交时间
        listMap.put( 27 , "vcAdditionalInfo");//补充条款
        listMap.put( 28 , "vcRealseq");//成交序列号
        listMap.put( 29 , "vcCashaccountName");//资金账号户名
        listMap.put( 30 , "vcCashaccountBank");//资金开户行
        listMap.put( 31 , "vcCashaccount");//资金账号
        listMap.put( 32 , "vcPaymentNo");//支付系统行号
        listMap.put( 33 , "vcDepositAccountName");//托管账户户名
        listMap.put( 34 , "vcDeposit");//托管机构
        listMap.put( 35 , "vcDepositAccount");//托管账号
    }

    public Map<Integer , String> getOneMap(){
        return this.listMap;
    }
}
