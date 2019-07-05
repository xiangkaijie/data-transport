package com.fileconvertexcel.fileconvertexcel.sheetinfo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table( name = "trealdeal_bondtradeinterface")
public class SheetTwo{
    @Id
    private  Integer  id; //自增序号
    private  String  vcRealno ;//成交编号
    private  String  vcOwn; //本方
    private  String  vcOwntrader; //本方交易员
    private  String  vcRival; //对手方
    private  String  vcRivalOrg; //对手方主机构
    private  String  vcRivalTrader; //对手方交易员
    private  String  vcTradeDirec; //交易方向
    private  String  vcStockCode; //债券代码
    private  String  vcStockName; //债券名称
    private  String  vcSource; //来源
    private  Double  enCostunitBalance; //每百元本金额（元）
    private  Double  enFirstNetprice; //首期净价
    private  Double  enExpireProfitratio; //到期收益率
    private  Double  enFirstProfitratio; //行权收益率
    private  Double  enCostBalance; //本金额
    private  Double  enFacevalue; //票面总额
    private  Double  enTradeBalance; //交易金额
    private  Integer  lSettleDate; //结算日
    private  Double  enFirstInterest; //应计利息
    private  Double  enFirstFullprice; //全价
    private  Double  enExpireInterest; //应计利息总额
    private  Double  enFirseSettlebalance; //结算金额
    private  String  vcFirstSettletype; //结算方式
    private  String  vcLiquidtype; //清算类型
    private  String  vcNetLiquidStatus; //净额清算状态
    private  String  vcAdditionalInfo; //补充条款
    private  String  vcRealdealStatus; //成交状态
    private  String  vcRealdealTime; //成交时间
    private  String  vcTradeMode; //交易方式
    private  String  vcTradeType; //交易类型
    private  String  vcRealseq; //成交序列号
    private  String  vcBondType; //债券类型
    private  String  vcCashaccountName; //资金账号户名
    private  String  vcCashaccountBank; //资金开户行
    private  String  vcCashaccount; //资金账号
    private  String  vcPaymentNo; //支付系统行号
    private  String  vcDepositAccountName; //托管账户户名
    private  String  vcDeposit; //托管机构
    private  String  vcDepositAccount; //托管账号
    private  String  vcQuotaSource; //报价来源
    private  String  vcLabel; //标签
    private  String  vcPlatform; //接入平台
    private  String  lMatchStatus; //'匹配状态 0-未匹配 1-自动匹配 2-手工匹配

    public SheetTwo(){

    }

    public void setId(int id){
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getVcRealno() {
        return vcRealno;
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

    public String getVcSource() {
        return vcSource;
    }

    public Double getEnCostunitBalance() {
        return enCostunitBalance;
    }

    public Double getEnFirstNetprice() {
        return enFirstNetprice;
    }

    public Double getEnExpireProfitratio() {
        return enExpireProfitratio;
    }

    public Double getEnFirstProfitratio() {
        return enFirstProfitratio;
    }

    public Double getEnCostBalance() {
        return enCostBalance;
    }

    public Double getEnFacevalue() {
        return enFacevalue;
    }

    public Double getEnTradeBalance() {
        return enTradeBalance;
    }

    public Integer getlSettleDate() {
        return lSettleDate;
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

    public Double getEnFirseSettlebalance() {
        return enFirseSettlebalance;
    }

    public String getVcFirstSettletype() {
        return vcFirstSettletype;
    }

    public String getVcLiquidtype() {
        return vcLiquidtype;
    }

    public String getVcNetLiquidStatus() {
        return vcNetLiquidStatus;
    }

    public String getVcAdditionalInfo() {
        return vcAdditionalInfo;
    }

    public String getVcRealdealStatus() {
        return vcRealdealStatus;
    }

    public String getVcRealdealTime() {
        return vcRealdealTime;
    }

    public String getVcTradeMode() {
        return vcTradeMode;
    }

    public String getVcTradeType() {
        return vcTradeType;
    }

    public String getVcRealseq() {
        return vcRealseq;
    }

    public String getVcBondType() {
        return vcBondType;
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

    public String getVcQuotaSource() {
        return vcQuotaSource;
    }

    public String getVcLabel() {
        return vcLabel;
    }

    public String getVcPlatform() {
        return vcPlatform;
    }

    public String getlMatchStatus() {
        return lMatchStatus;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SheetTwo sheetTwo = (SheetTwo) o;
        return Objects.equals(id, sheetTwo.id) &&
                Objects.equals(vcRealno, sheetTwo.vcRealno) &&
                Objects.equals(vcOwn, sheetTwo.vcOwn) &&
                Objects.equals(vcOwntrader, sheetTwo.vcOwntrader) &&
                Objects.equals(vcRival, sheetTwo.vcRival) &&
                Objects.equals(vcRivalOrg, sheetTwo.vcRivalOrg) &&
                Objects.equals(vcRivalTrader, sheetTwo.vcRivalTrader) &&
                Objects.equals(vcTradeDirec, sheetTwo.vcTradeDirec) &&
                Objects.equals(vcStockCode, sheetTwo.vcStockCode) &&
                Objects.equals(vcStockName, sheetTwo.vcStockName) &&
                Objects.equals(vcSource, sheetTwo.vcSource) &&
                Objects.equals(enCostunitBalance, sheetTwo.enCostunitBalance) &&
                Objects.equals(enFirstNetprice, sheetTwo.enFirstNetprice) &&
                Objects.equals(enExpireProfitratio, sheetTwo.enExpireProfitratio) &&
                Objects.equals(enFirstProfitratio, sheetTwo.enFirstProfitratio) &&
                Objects.equals(enCostBalance, sheetTwo.enCostBalance) &&
                Objects.equals(enFacevalue, sheetTwo.enFacevalue) &&
                Objects.equals(enTradeBalance, sheetTwo.enTradeBalance) &&
                Objects.equals(lSettleDate, sheetTwo.lSettleDate) &&
                Objects.equals(enFirstInterest, sheetTwo.enFirstInterest) &&
                Objects.equals(enFirstFullprice, sheetTwo.enFirstFullprice) &&
                Objects.equals(enExpireInterest, sheetTwo.enExpireInterest) &&
                Objects.equals(enFirseSettlebalance, sheetTwo.enFirseSettlebalance) &&
                Objects.equals(vcFirstSettletype, sheetTwo.vcFirstSettletype) &&
                Objects.equals(vcLiquidtype, sheetTwo.vcLiquidtype) &&
                Objects.equals(vcNetLiquidStatus, sheetTwo.vcNetLiquidStatus) &&
                Objects.equals(vcAdditionalInfo, sheetTwo.vcAdditionalInfo) &&
                Objects.equals(vcRealdealStatus, sheetTwo.vcRealdealStatus) &&
                Objects.equals(vcRealdealTime, sheetTwo.vcRealdealTime) &&
                Objects.equals(vcTradeMode, sheetTwo.vcTradeMode) &&
                Objects.equals(vcTradeType, sheetTwo.vcTradeType) &&
                Objects.equals(vcRealseq, sheetTwo.vcRealseq) &&
                Objects.equals(vcBondType, sheetTwo.vcBondType) &&
                Objects.equals(vcCashaccountName, sheetTwo.vcCashaccountName) &&
                Objects.equals(vcCashaccountBank, sheetTwo.vcCashaccountBank) &&
                Objects.equals(vcCashaccount, sheetTwo.vcCashaccount) &&
                Objects.equals(vcPaymentNo, sheetTwo.vcPaymentNo) &&
                Objects.equals(vcDepositAccountName, sheetTwo.vcDepositAccountName) &&
                Objects.equals(vcDeposit, sheetTwo.vcDeposit) &&
                Objects.equals(vcDepositAccount, sheetTwo.vcDepositAccount) &&
                Objects.equals(vcQuotaSource, sheetTwo.vcQuotaSource) &&
                Objects.equals(vcLabel, sheetTwo.vcLabel) &&
                Objects.equals(vcPlatform, sheetTwo.vcPlatform) &&
                Objects.equals(lMatchStatus, sheetTwo.lMatchStatus);
    }

    @Override
    public String toString() {
        return "SheetTwo{" +
                "id=" + id +
                ", vcRealno='" + vcRealno + '\'' +
                ", vcOwn='" + vcOwn + '\'' +
                ", vcOwntrader='" + vcOwntrader + '\'' +
                ", vcRival='" + vcRival + '\'' +
                ", vcRivalOrg='" + vcRivalOrg + '\'' +
                ", vcRivalTrader='" + vcRivalTrader + '\'' +
                ", vcTradeDirec='" + vcTradeDirec + '\'' +
                ", vcStockCode='" + vcStockCode + '\'' +
                ", vcStockName='" + vcStockName + '\'' +
                ", vcSource='" + vcSource + '\'' +
                ", enCostunitBalance=" + enCostunitBalance +
                ", enFirstNetprice=" + enFirstNetprice +
                ", enExpireProfitratio=" + enExpireProfitratio +
                ", enFirstProfitratio=" + enFirstProfitratio +
                ", enCostBalance=" + enCostBalance +
                ", enFacevalue=" + enFacevalue +
                ", enTradeBalance=" + enTradeBalance +
                ", lSettleDate=" + lSettleDate +
                ", enFirstInterest=" + enFirstInterest +
                ", enFirstFullprice=" + enFirstFullprice +
                ", enExpireInterest=" + enExpireInterest +
                ", enFirseSettlebalance=" + enFirseSettlebalance +
                ", vcFirstSettletype='" + vcFirstSettletype + '\'' +
                ", vcLiquidtype='" + vcLiquidtype + '\'' +
                ", vcNetLiquidStatus='" + vcNetLiquidStatus + '\'' +
                ", vcAdditionalInfo='" + vcAdditionalInfo + '\'' +
                ", vcRealdealStatus='" + vcRealdealStatus + '\'' +
                ", vcRealdealTime='" + vcRealdealTime + '\'' +
                ", vcTradeMode='" + vcTradeMode + '\'' +
                ", vcTradeType='" + vcTradeType + '\'' +
                ", vcRealseq='" + vcRealseq + '\'' +
                ", vcBondType='" + vcBondType + '\'' +
                ", vcCashaccountName='" + vcCashaccountName + '\'' +
                ", vcCashaccountBank='" + vcCashaccountBank + '\'' +
                ", vcCashaccount='" + vcCashaccount + '\'' +
                ", vcPaymentNo='" + vcPaymentNo + '\'' +
                ", vcDepositAccountName='" + vcDepositAccountName + '\'' +
                ", vcDeposit='" + vcDeposit + '\'' +
                ", vcDepositAccount='" + vcDepositAccount + '\'' +
                ", vcQuotaSource='" + vcQuotaSource + '\'' +
                ", vcLabel='" + vcLabel + '\'' +
                ", vcPlatform='" + vcPlatform + '\'' +
                ", lMatchSatus='" + lMatchStatus + '\'' +
                '}';
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, vcRealno, vcOwn, vcOwntrader, vcRival, vcRivalOrg, vcRivalTrader, vcTradeDirec, vcStockCode, vcStockName, vcSource, enCostunitBalance, enFirstNetprice, enExpireProfitratio, enFirstProfitratio, enCostBalance, enFacevalue, enTradeBalance, lSettleDate, enFirstInterest, enFirstFullprice, enExpireInterest, enFirseSettlebalance, vcFirstSettletype, vcLiquidtype, vcNetLiquidStatus, vcAdditionalInfo, vcRealdealStatus, vcRealdealTime, vcTradeMode, vcTradeType, vcRealseq, vcBondType, vcCashaccountName, vcCashaccountBank, vcCashaccount, vcPaymentNo, vcDepositAccountName, vcDeposit, vcDepositAccount, vcQuotaSource, vcLabel, vcPlatform, lMatchStatus);
    }
}
