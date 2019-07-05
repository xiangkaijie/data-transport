package com.fileconvertexcel.fileconvertexcel.sheetinfo;

import org.hibernate.annotations.Proxy;
import org.springframework.stereotype.Service;
import javax.persistence.*;
import java.util.Objects;

@Service
@Entity
@Table(name = "trealdeal_outrightrepointerface")
@Proxy(lazy = false)
public class SheetThree {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private  Integer  id;//自增编号
    private  String  vcRealno; //成交编号
    private  String  vcOwn; //本方
    private  String  vcOwntrader; //本方交易员
    private  String  vcRival; //对手方
    private  String  vcRivalOrg; //对手方主机构
    private  String  vcRivalTrader; //对手方交易员
    private  String  vcTradeDirec; //交易方向
    private  String  vcStockCode; //债券代码
    private  String  vcStockName; //债券名称
    private  Double  enReporate; //回购利率 单位%
    private  Double  enFirstNetprice; //首期净价
    private  Double  enExpireNetprice; //到期净价
    private  Double  enFirstProfitratio; //首次收益率
    private  Double  enExpireProfitratio; //到期收益率
    private  Double  enFacevalue; //票面总额
    private  Integer  lHgDays; //回购天数
    private  Double  enFirstInterest; //首次应计利息
    private  Double  enFirstFullprice; //首期全价
    private  Double  enExpireInterest; //到期应计利息
    private  Double  enExpireFullprice; //到期全价
    private  Integer  lFirstSettledate; //首期结算日
    private  Integer  lExpireSettledate; //到期结算日
    private  Double  enFirseSettlebalance; //首期结算金额
    private  Double  enExpireSettlebalance; //到期结算金额
    private  Integer  lActualDays; //实际占款天数
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
    private  Integer lMatchStatus; //匹配状态 0-未匹配 1-自动匹配 2-手工匹配

    public  SheetThree(){

    }



    public void setId( int id){
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getVcRealno() {
        return vcRealno;
    }

    public String getVcWwn() {
        return vcOwn;
    }

    public String getVcWwntrader() {
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

    public String getVcUpdateTime() {
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

    @Override
    public String toString() {
        return "SheetThree{" +
                "id=" + id +
                ", vcRealno='" + vcRealno + '\'' +
                ", vcWwn='" + vcOwn + '\'' +
                ", vcWwntrader='" + vcOwntrader + '\'' +
                ", vcRival='" + vcRival + '\'' +
                ", vcRivalOrg='" + vcRivalOrg + '\'' +
                ", vcRivalTrader='" + vcRivalTrader + '\'' +
                ", vcTradeDirec='" + vcTradeDirec + '\'' +
                ", vcStockCode='" + vcStockCode + '\'' +
                ", vcStockName='" + vcStockName + '\'' +
                ", enReporate=" + enReporate +
                ", enFirstNetprice=" + enFirstNetprice +
                ", enExpireNetprice=" + enExpireNetprice +
                ", enFirstProfitratio=" + enFirstProfitratio +
                ", enExpireProfitratio=" + enExpireProfitratio +
                ", enFacevalue=" + enFacevalue +
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
                ", vcUpdateTime='" + vcUpdateTime + '\'' +
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SheetThree that = (SheetThree) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(vcRealno, that.vcRealno) &&
                Objects.equals(vcOwn, that.vcOwn) &&
                Objects.equals(vcOwntrader, that.vcOwntrader) &&
                Objects.equals(vcRival, that.vcRival) &&
                Objects.equals(vcRivalOrg, that.vcRivalOrg) &&
                Objects.equals(vcRivalTrader, that.vcRivalTrader) &&
                Objects.equals(vcTradeDirec, that.vcTradeDirec) &&
                Objects.equals(vcStockCode, that.vcStockCode) &&
                Objects.equals(vcStockName, that.vcStockName) &&
                Objects.equals(enReporate, that.enReporate) &&
                Objects.equals(enFirstNetprice, that.enFirstNetprice) &&
                Objects.equals(enExpireNetprice, that.enExpireNetprice) &&
                Objects.equals(enFirstProfitratio, that.enFirstProfitratio) &&
                Objects.equals(enExpireProfitratio, that.enExpireProfitratio) &&
                Objects.equals(enFacevalue, that.enFacevalue) &&
                Objects.equals(lHgDays, that.lHgDays) &&
                Objects.equals(enFirstInterest, that.enFirstInterest) &&
                Objects.equals(enFirstFullprice, that.enFirstFullprice) &&
                Objects.equals(enExpireInterest, that.enExpireInterest) &&
                Objects.equals(enExpireFullprice, that.enExpireFullprice) &&
                Objects.equals(lFirstSettledate, that.lFirstSettledate) &&
                Objects.equals(lExpireSettledate, that.lExpireSettledate) &&
                Objects.equals(enFirseSettlebalance, that.enFirseSettlebalance) &&
                Objects.equals(enExpireSettlebalance, that.enExpireSettlebalance) &&
                Objects.equals(lActualDays, that.lActualDays) &&
                Objects.equals(vcTradeCode, that.vcTradeCode) &&
                Objects.equals(vcFirstSettletype, that.vcFirstSettletype) &&
                Objects.equals(vcExpireSettletype, that.vcExpireSettletype) &&
                Objects.equals(vcLiquidtype, that.vcLiquidtype) &&
                Objects.equals(vcNetLiquidStatus, that.vcNetLiquidStatus) &&
                Objects.equals(vcStatus, that.vcStatus) &&
                Objects.equals(vcRealdealTime, that.vcRealdealTime) &&
                Objects.equals(vcAdditionalInfo, that.vcAdditionalInfo) &&
                Objects.equals(vcUpdateTime, that.vcUpdateTime) &&
                Objects.equals(vcRealseq, that.vcRealseq) &&
                Objects.equals(vcCashaccountName, that.vcCashaccountName) &&
                Objects.equals(vcCashaccountBank, that.vcCashaccountBank) &&
                Objects.equals(vcCashaccount, that.vcCashaccount) &&
                Objects.equals(vcPaymentNo, that.vcPaymentNo) &&
                Objects.equals(vcDepositAccountName, that.vcDepositAccountName) &&
                Objects.equals(vcDeposit, that.vcDeposit) &&
                Objects.equals(vcDepositAccount, that.vcDepositAccount) &&
                Objects.equals(lMatchStatus, that.lMatchStatus);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, vcRealno, vcOwn, vcOwntrader, vcRival, vcRivalOrg, vcRivalTrader, vcTradeDirec, vcStockCode, vcStockName, enReporate, enFirstNetprice, enExpireNetprice, enFirstProfitratio, enExpireProfitratio, enFacevalue, lHgDays, enFirstInterest, enFirstFullprice, enExpireInterest, enExpireFullprice, lFirstSettledate, lExpireSettledate, enFirseSettlebalance, enExpireSettlebalance, lActualDays, vcTradeCode, vcFirstSettletype, vcExpireSettletype, vcLiquidtype, vcNetLiquidStatus, vcStatus, vcRealdealTime, vcAdditionalInfo, vcUpdateTime, vcRealseq, vcCashaccountName, vcCashaccountBank, vcCashaccount, vcPaymentNo, vcDepositAccountName, vcDeposit, vcDepositAccount, lMatchStatus);
    }
}
