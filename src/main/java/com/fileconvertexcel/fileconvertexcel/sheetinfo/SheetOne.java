package com.fileconvertexcel.fileconvertexcel.sheetinfo;

import org.hibernate.annotations.Proxy;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table( name = "trealdeal_bondcollaterlisedrepointerface")
@Service
@Proxy(lazy = false)
public class SheetOne {
    //对应表中属性；
    @Id
    private  Integer id;  //该字段有自增属性；
    private  String  vcRealno; //成交编号
    private  String  vcTradeType; //交易方式
    private  String  vcOwn; //本方
    private  String  vcOwntrader; //本方交易员
    private  String  vcRival; //对手方
    private  String  vcRivalOrg; //对手方主机构
    private  String  vcRivalTrader; //对手方交易员
    private  String  vcTradeDirec; //交易方向
    private  String  vcStockCode; //债券代码
    private  String  vcStockName; //债券名称
    private  Double  enReporate; //回购利率 单位%
    private  Double  enConversionRatio; //折算比例
    private  Double  enFirstNetprice; //首期净价
    private  Double  enExpireNetprice; //到期净价
    private  Double  enFirstProfitratio; //首次收益率
    private  Double  enExpireProfitratio; //到期收益率
    private  Double  enFacevalue; //票面总额
    private  Double  enTradeBalance; //交易金额
    private  Integer lHgDays; //回购天数
    private  Double  enFirstInterest; //首次应计利息
    private  Double  enFirstFullprice; //首期全价
    private  Double  enExpireInterest; //到期应计利息
    private  Double  enExpireFullprice; //到期全价
    private  Integer lFirstSettledate; //首期结算日
    private  Integer lExpireSettledate; //到期结算日
    private  Double  enFirseSettlebalance; //首期结算金额
    private  Double  enExpireSettlebalance; //到期结算金额
    private  Integer lActualDays; //实际占款天数
    private  String  vcTradeCode; //交易品种
    private  String  vcFirstSettletype; //首次结算方式
    private  String  vcExpireSettletype; //到期结算方式
    private  String  vcLiquidtype; //清算类型
    private  String  vcNetLiquidStatus; //净额清算状态
    private  String  vcStatus; //状态
    private  String  vcRealdealTime; //成交时间
    private  String  vcAdditionalInfo; //补充条款
    private  String  vcUpdateTime; //更新日
    private  String  vcRealseq; //成交序列号
    private  String  vcCashaccountName; //资金账号户名
    private  String  vcCashaccountBank; //资金开户行
    private  String  vcCashaccount; //资金账号
    private  String  vcPaymentNo; //支付系统行号
    private  String  vcDepositAccountName; //托管账户户名
    private  String  vcDeposit; //托管机构
    private  String  vcDepositAccount; //托管账号
    private  Integer lMatchStatus; //该字段设置了默认值；

    //默认构造参数；
    public SheetOne(){}

    public void setId(int id){
        this.id = id;
    }

    //在此处可设置方法，对属性进行修改；可在此处设计相关算法堆属性进行更改
    public void ModifyL_hg_days( ){
        if(this.lHgDays % 2 !=0){
            this.lHgDays = this.lHgDays*3 +1;
        }
        else{
            this.lHgDays = this.lHgDays/2;
        }
    }


    public Integer getId() {
        return id;
    }

    public String getVcRealno() {
        return vcRealno;
    }

    public String getVcTradeType() {
        return vcTradeType;
    }

    public String getVcOwn() {
        return vcOwn;
    }

    public String getVcOwntrader() {
        return vcOwntrader;
    }

    public String getVcRival() {
        return vcRival;
    }

    public String getVcRivalOrg() {
        return vcRivalOrg;
    }

    public String getVcRivalTrader() {
        return vcRivalTrader;
    }

    public String getVcTradeDirec() {
        return vcTradeDirec;
    }

    public String getVcStockCode() {
        return vcStockCode;
    }

    public String getVcStockName() {
        return vcStockName;
    }

    public Double getEnReporate() {
        return enReporate;
    }

    public Double getEnConversionRatio() {
        return enConversionRatio;
    }

    public Double getEnFirstNetprice() {
        return enFirstNetprice;
    }

    public Double getEnExpireNetprice() {
        return enExpireNetprice;
    }

    public Double getEnFirstProfitratio() {
        return enFirstProfitratio;
    }

    public Double getEnExpireProfitratio() {
        return enExpireProfitratio;
    }

    public Double getEnFacevalue() {
        return enFacevalue;
    }

    public Double getEnTradeBalance() {
        return enTradeBalance;
    }

    public Integer getlHgDays() {
        return lHgDays;
    }

    public Double getEnFirstInterest() {
        return enFirstInterest;
    }

    public Double getEnFirstFullprice() {
        return enFirstFullprice;
    }

    public Double getEnExpireInterest() {
        return enExpireInterest;
    }

    public Double getEnExpireFullprice() {
        return enExpireFullprice;
    }

    public Integer getlFirstSettledate() {
        return lFirstSettledate;
    }

    public Integer getlExpireSettledate() {
        return lExpireSettledate;
    }

    public Double getEnFirseSettlebalance() {
        return enFirseSettlebalance;
    }

    public Double getEnExpireSettlebalance() {
        return enExpireSettlebalance;
    }

    public Integer getlActualDays() {
        return lActualDays;
    }

    public String getVcTradeCode() {
        return vcTradeCode;
    }

    public String getVcFirstSettletype() {
        return vcFirstSettletype;
    }

    public String getVcExpireSettletype() {
        return vcExpireSettletype;
    }

    public String getVcLiquidtype() {
        return vcLiquidtype;
    }

    public String getVcNetLiquidStatus() {
        return vcNetLiquidStatus;
    }

    public String getVcStatus() {
        return vcStatus;
    }

    public String getVcRealdealTime() {
        return vcRealdealTime;
    }

    public String getVcAdditionalInfo() {
        return vcAdditionalInfo;
    }

    public String getVcUpdataTime() {
        return vcUpdateTime;
    }

    public String getVcRealseq() {
        return vcRealseq;
    }

    public String getVcCashaccountName() {
        return vcCashaccountName;
    }

    public String getVcCashaccountBank() {
        return vcCashaccountBank;
    }

    public String getVcCashaccount() {
        return vcCashaccount;
    }

    public String getVcPaymentNo() {
        return vcPaymentNo;
    }

    public String getVcDepositAccountName() {
        return vcDepositAccountName;
    }

    public String getVcDeposit() {
        return vcDeposit;
    }

    public String getVcDepositAccount() {
        return vcDepositAccount;
    }

    public Integer getlMatchStatus() {
        return lMatchStatus;
    }

    public  void setlHgDays(){
        if( this.lHgDays %2 ==0){
            this.lHgDays = this.lHgDays/2;
        }else{
            this.lHgDays = this.lHgDays *3 + 1;
        }
    }

    @Override
    public String toString() {
        return "SheetOne{" +
                "id=" + id +
                ", vcRealno='" + vcRealno + '\'' +
                ", vcTradeType='" + vcTradeType + '\'' +
                ", vcOwn='" + vcOwn + '\'' +
                ", vcOwntrader='" + vcOwntrader + '\'' +
                ", vcRival='" + vcRival + '\'' +
                ", vcRivalOrg='" + vcRivalOrg + '\'' +
                ", vcRivalTrader='" + vcRivalTrader + '\'' +
                ", vcTradeDirec='" + vcTradeDirec + '\'' +
                ", vcStockCode='" + vcStockCode + '\'' +
                ", vcStockName='" + vcStockName + '\'' +
                ", enReporate=" + enReporate +
                ", enConversionRatio=" + enConversionRatio +
                ", enFirstNetprice=" + enFirstNetprice +
                ", enExpireNetprice=" + enExpireNetprice +
                ", enFirstProfitratio=" + enFirstProfitratio +
                ", enExpireProfitratio=" + enExpireProfitratio +
                ", enFacevalue=" + enFacevalue +
                ", enTradeBalance=" + enTradeBalance +
                ", lHgDays=" + lHgDays +
                ", enFirstInterest=" + enFirstInterest +
                ", enFirstFullprice=" + enFirstFullprice +
                ", enExpireInterest=" + enExpireInterest +
                ", enExpireFullprice=" + enExpireFullprice +
                ", lFirstSettledate=" + lFirstSettledate +
                ", lExpireSettledate=" + lExpireSettledate +
                ", enFirseSettlebalance=" + enFirseSettlebalance +
                ", enExpireSettlebalance=" + enExpireSettlebalance +
                ", lActualDays=" + lActualDays +
                ", vcTradeCode='" + vcTradeCode + '\'' +
                ", vcFirstSettletype='" + vcFirstSettletype + '\'' +
                ", vcExpireSettletype='" + vcExpireSettletype + '\'' +
                ", vcLiquidtype='" + vcLiquidtype + '\'' +
                ", vcNetLiquidStatus='" + vcNetLiquidStatus + '\'' +
                ", vcStatus='" + vcStatus + '\'' +
                ", vcRealdealTime='" + vcRealdealTime + '\'' +
                ", vcAdditionalInfo='" + vcAdditionalInfo + '\'' +
                ", vcUpdataTime='" + vcUpdateTime + '\'' +
                ", vcRealseq='" + vcRealseq + '\'' +
                ", vcCashaccountName='" + vcCashaccountName + '\'' +
                ", vcCashaccountBank='" + vcCashaccountBank + '\'' +
                ", vcCashaccount='" + vcCashaccount + '\'' +
                ", vcPaymentNo='" + vcPaymentNo + '\'' +
                ", vcDepositAccountName='" + vcDepositAccountName + '\'' +
                ", vcDeposit='" + vcDeposit + '\'' +
                ", vcDepositAccount='" + vcDepositAccount + '\'' +
                ", lMatchStatus=" + lMatchStatus +
                '}';
    }

    //对象比较函数；


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SheetOne sheetInfo = (SheetOne) o;
        return Objects.equals(id, sheetInfo.id) &&
                Objects.equals(vcRealno, sheetInfo.vcRealno) &&
                Objects.equals(vcTradeType, sheetInfo.vcTradeType) &&
                Objects.equals(vcOwn, sheetInfo.vcOwn) &&
                Objects.equals(vcOwntrader, sheetInfo.vcOwntrader) &&
                Objects.equals(vcRival, sheetInfo.vcRival) &&
                Objects.equals(vcRivalOrg, sheetInfo.vcRivalOrg) &&
                Objects.equals(vcRivalTrader, sheetInfo.vcRivalTrader) &&
                Objects.equals(vcTradeDirec, sheetInfo.vcTradeDirec) &&
                Objects.equals(vcStockCode, sheetInfo.vcStockCode) &&
                Objects.equals(vcStockName, sheetInfo.vcStockName) &&
                Objects.equals(enReporate, sheetInfo.enReporate) &&
                Objects.equals(enConversionRatio, sheetInfo.enConversionRatio) &&
                Objects.equals(enFirstNetprice, sheetInfo.enFirstNetprice) &&
                Objects.equals(enExpireNetprice, sheetInfo.enExpireNetprice) &&
                Objects.equals(enFirstProfitratio, sheetInfo.enFirstProfitratio) &&
                Objects.equals(enExpireProfitratio, sheetInfo.enExpireProfitratio) &&
                Objects.equals(enFacevalue, sheetInfo.enFacevalue) &&
                Objects.equals(enTradeBalance, sheetInfo.enTradeBalance) &&
                Objects.equals(lHgDays, sheetInfo.lHgDays) &&
                Objects.equals(enFirstInterest, sheetInfo.enFirstInterest) &&
                Objects.equals(enFirstFullprice, sheetInfo.enFirstFullprice) &&
                Objects.equals(enExpireInterest, sheetInfo.enExpireInterest) &&
                Objects.equals(enExpireFullprice, sheetInfo.enExpireFullprice) &&
                Objects.equals(lFirstSettledate, sheetInfo.lFirstSettledate) &&
                Objects.equals(lExpireSettledate, sheetInfo.lExpireSettledate) &&
                Objects.equals(enFirseSettlebalance, sheetInfo.enFirseSettlebalance) &&
                Objects.equals(enExpireSettlebalance, sheetInfo.enExpireSettlebalance) &&
                Objects.equals(lActualDays, sheetInfo.lActualDays) &&
                Objects.equals(vcTradeCode, sheetInfo.vcTradeCode) &&
                Objects.equals(vcFirstSettletype, sheetInfo.vcFirstSettletype) &&
                Objects.equals(vcExpireSettletype, sheetInfo.vcExpireSettletype) &&
                Objects.equals(vcLiquidtype, sheetInfo.vcLiquidtype) &&
                Objects.equals(vcNetLiquidStatus, sheetInfo.vcNetLiquidStatus) &&
                Objects.equals(vcStatus, sheetInfo.vcStatus) &&
                Objects.equals(vcRealdealTime, sheetInfo.vcRealdealTime) &&
                Objects.equals(vcAdditionalInfo, sheetInfo.vcAdditionalInfo) &&
                Objects.equals(vcUpdateTime, sheetInfo.vcUpdateTime) &&
                Objects.equals(vcRealseq, sheetInfo.vcRealseq) &&
                Objects.equals(vcCashaccountName, sheetInfo.vcCashaccountName) &&
                Objects.equals(vcCashaccountBank, sheetInfo.vcCashaccountBank) &&
                Objects.equals(vcCashaccount, sheetInfo.vcCashaccount) &&
                Objects.equals(vcPaymentNo, sheetInfo.vcPaymentNo) &&
                Objects.equals(vcDepositAccountName, sheetInfo.vcDepositAccountName) &&
                Objects.equals(vcDeposit, sheetInfo.vcDeposit) &&
                Objects.equals(vcDepositAccount, sheetInfo.vcDepositAccount) &&
                Objects.equals(lMatchStatus, sheetInfo.lMatchStatus);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, vcRealno, vcTradeType, vcOwn, vcOwntrader, vcRival, vcRivalOrg, vcRivalTrader, vcTradeDirec, enReporate, vcStockCode, vcStockName, enConversionRatio, enFacevalue, enTradeBalance, lHgDays, enExpireInterest, lFirstSettledate, lExpireSettledate, lActualDays, enExpireSettlebalance, vcTradeCode, vcFirstSettletype, vcExpireSettletype, vcLiquidtype, vcNetLiquidStatus, vcStatus, vcRealdealTime, vcAdditionalInfo, vcRealseq, vcCashaccountName, vcCashaccountBank, vcCashaccount, vcPaymentNo, vcDepositAccountName, vcDeposit, vcDepositAccount, lMatchStatus);
    }

    //对象赋值函数；

    public void setEqual(SheetOne sheetInfo){
        this.id = sheetInfo.id;
        this.vcRealno = sheetInfo.vcRealno;
        this.vcTradeType = sheetInfo.vcTradeType;
        this.vcOwn = sheetInfo.vcOwn;
        this.vcOwntrader = sheetInfo.vcOwntrader;
        this.vcRival = sheetInfo.vcRival;
        this.vcRivalOrg = sheetInfo.vcRivalOrg;
        this.vcRivalTrader = sheetInfo.vcRivalTrader;
        this.vcTradeDirec = sheetInfo.vcTradeDirec;
        this.enReporate = sheetInfo.enReporate;
        this.vcStockCode = sheetInfo.vcStockCode;
        this.vcStockName = sheetInfo.vcStockName;
        this.enConversionRatio = sheetInfo.enConversionRatio;
        this.enFacevalue = sheetInfo.enFacevalue;
        this.enTradeBalance = sheetInfo.enTradeBalance;
        this.lHgDays = sheetInfo.lHgDays;
        this.enExpireInterest = sheetInfo.enExpireInterest;
        this.lFirstSettledate = sheetInfo.lFirstSettledate;
        this.lExpireSettledate = sheetInfo.lExpireSettledate;
        this.lActualDays = sheetInfo.lActualDays;
        this.enExpireSettlebalance = sheetInfo.enExpireSettlebalance;
        this.vcTradeCode = sheetInfo.vcTradeCode;
        this.vcFirstSettletype = sheetInfo.vcFirstSettletype;
        this.vcExpireSettletype = sheetInfo.vcExpireSettletype;
        this.vcLiquidtype = sheetInfo.vcLiquidtype;
        this.vcNetLiquidStatus = sheetInfo.vcNetLiquidStatus;
        this.vcStatus = sheetInfo.vcStatus;
        this.vcRealdealTime = sheetInfo.vcRealdealTime;
        this.vcAdditionalInfo = sheetInfo.vcAdditionalInfo;
        this.vcRealseq = sheetInfo.vcRealseq;
        this.vcCashaccountName = sheetInfo.vcCashaccountName;
        this.vcCashaccountBank = sheetInfo.vcCashaccountBank;
        this.vcCashaccount = sheetInfo.vcCashaccount;
        this.vcPaymentNo = sheetInfo.vcPaymentNo;
        this.vcDepositAccountName=sheetInfo.vcDepositAccountName;
        this.vcDeposit = sheetInfo.vcDeposit;
        this.vcDepositAccount = sheetInfo.vcDepositAccount;
        this.lMatchStatus = sheetInfo.lMatchStatus;

        this.enFirstNetprice = sheetInfo.enFirstNetprice;
        this.enFirstInterest = sheetInfo.enFirstInterest;
        this.enExpireNetprice = sheetInfo.enExpireNetprice;
        this.enFirstProfitratio = sheetInfo.enFirstProfitratio;
        this.enExpireProfitratio = sheetInfo.enExpireProfitratio;
        this.enFirstFullprice = sheetInfo.enFirstFullprice;
        this.enExpireFullprice =sheetInfo.enExpireFullprice;
        this.vcUpdateTime = sheetInfo.vcUpdateTime;
        this.enFirseSettlebalance = sheetInfo.enFirseSettlebalance;

    }

}
