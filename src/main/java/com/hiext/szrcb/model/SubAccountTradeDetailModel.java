package com.hiext.szrcb.model;

/**
 * 子账号交易明细
 * 
 * @author angy
 * * @since 2020/11/01
 */
public class SubAccountTradeDetailModel {
    /**
     * 状态(C1)
     */
    private String stat;
    /**
     * 账户(C35)
     */
    private String acno;
    /**
     * 币种(C2)
     */
    private String cur_code;
    /**
     * 账簿号(C38)
     */
    private String as_acno;
    /**
     * 产品号(C20)
     */
    private String product_no;
    /**
     * 流水号(C20)
     */
    private String serial_no;
    /**
     * 发生日期(C8)
     */
    private String tr_acdt;
    /**
     * 交易日期(C8)
     */
    private String tr_time;
    /**
     * 交易类型(C1)
     */
    private String tr_type;
    /**
     * 交易来源(C1)
     */
    private String tr_from;
    /**
     * 交易码(C6)
     */
    private String tr_code;
    /**
     * 现金管理客户号(C20)
     */
    private String cms_corp_no;
    /**
     * 发生额标志(C1)
     */
    private String trans_flag;
    /**
     * 借贷方向(C1)
     */
    private String crdr_flag;
    /**
     * 发生额(N15,2)
     */
    private Double amt;
    /**
     * 手续费(N15,2)
     */
    private Double fee_amt;
    /**
     * 自身余额(N15,2)
     */
    private Double self_bal;
    /**
     * 上笔余额(N15,2)
     */
    private Double last_bal;
    /**
     * 上存余额(N15,2)
     */
    private Double upp_bal;
    /**
     * 凭证种类(C1)
     */
    private String cert_type;
    /**
     * 凭证批次号(C20)
     */
    private String cert_batchno;
    /**
     * 凭证号(C20)
     */
    private String cert_no;
    /**
     * 对方账号(C35)
     */
    private String opp_acno;
    /**
     * 对方币种(C2)
     */
    private String opp_cur_code;
    /**
     * 对方账号名(C140)
     */
    private String opp_acname;
    /**
     * 对方账号开户行(C20)
     */
    private String opp_bankname;
    /**
     * 对方账簿号(C38)
     */
    private String opp_as_acno;
    /**
     * 对方账簿名(C140)
     */
    private String opp_asacname;
    /**
     * 下级账号(C35)
     */
    private String jun_acno;
    /**
     * 下级币种(C2)
     */
    private String jun_cur_code;
    /**
     * 下级账号名(C140)
     */
    private String jun_acname;
    /**
     * 记账柜员(C10)
     */
    private String user_no;
    /**
     * 摘要(C60)
     */
    private String purpose;
    /**
     * 附言(C300)
     */
    private String postscript;
    /**
     * 明细调账标志(C1)
     */
    private String adjust_flag;
    /**
     * 预留字段1(C255)
     */
    private String reserved1;
    /**
     * 预留字段2(C255)
     */
    private String reserved2;
    /**
     * 预留字段3(C255)
     */
    private String reserved3;
    /**
     * 预留字段4(C255)
     */
    private String reserved4;
    /**
     * 预留字段5(C255)
     */
    private String reserved5;
    /**
     * 预留字段6(C255)
     */
    private String reserved6;
    /**
     * 预留字段7(C255)
     */
    private String reserved7;
    /**
     * 预留字段8(C255)
     */
    private String reserved8;
    /**
     * 预留字段9(C255)
     */
    private String reserved9;
    /**
     * 预留字段10(C255)
     */
    private String reserved10;
    /**
     * 账号名(C140)
     */
    private String acname;
    /**
     * 账簿名(C140)
     */
    private String as_acname;
    /**
     * 交易名称(C60)
     */
    private String tr_name;
    /**
     * 现金管理客户号(C20)
     */
    private String corp_cn_name;
    /**
     * 支出金额(N15,2)
     */
    private String payamt;
    /**
     * 收入金额(N15,2)
     */
    private String rcvamt;

    public String getStat() {
        return stat;
    }

    public String getAcno() {
        return acno;
    }

    public String getCur_code() {
        return cur_code;
    }

    public String getAs_acno() {
        return as_acno;
    }

    public String getProduct_no() {
        return product_no;
    }

    public String getSerial_no() {
        return serial_no;
    }

    public String getTr_acdt() {
        return tr_acdt;
    }

    public String getTr_time() {
        return tr_time;
    }

    public String getTr_type() {
        return tr_type;
    }

    public String getTr_from() {
        return tr_from;
    }

    public String getTr_code() {
        return tr_code;
    }

    public String getCms_corp_no() {
        return cms_corp_no;
    }

    public String getTrans_flag() {
        return trans_flag;
    }

    public String getCrdr_flag() {
        return crdr_flag;
    }

    public Double getAmt() {
        return amt;
    }

    public Double getFee_amt() {
        return fee_amt;
    }

    public Double getSelf_bal() {
        return self_bal;
    }

    public Double getLast_bal() {
        return last_bal;
    }

    public Double getUpp_bal() {
        return upp_bal;
    }

    public String getCert_type() {
        return cert_type;
    }

    public String getCert_batchno() {
        return cert_batchno;
    }

    public String getCert_no() {
        return cert_no;
    }

    public String getOpp_acno() {
        return opp_acno;
    }

    public String getOpp_cur_code() {
        return opp_cur_code;
    }

    public String getOpp_acname() {
        return opp_acname;
    }

    public String getOpp_bankname() {
        return opp_bankname;
    }

    public String getOpp_as_acno() {
        return opp_as_acno;
    }

    public String getOpp_asacname() {
        return opp_asacname;
    }

    public String getJun_acno() {
        return jun_acno;
    }

    public String getJun_cur_code() {
        return jun_cur_code;
    }

    public String getJun_acname() {
        return jun_acname;
    }

    public String getUser_no() {
        return user_no;
    }

    public String getPurpose() {
        return purpose;
    }

    public String getPostscript() {
        return postscript;
    }

    public String getAdjust_flag() {
        return adjust_flag;
    }

    public String getReserved1() {
        return reserved1;
    }

    public String getReserved2() {
        return reserved2;
    }

    public String getReserved3() {
        return reserved3;
    }

    public String getReserved4() {
        return reserved4;
    }

    public String getReserved5() {
        return reserved5;
    }

    public String getReserved6() {
        return reserved6;
    }

    public String getReserved7() {
        return reserved7;
    }

    public String getReserved8() {
        return reserved8;
    }

    public String getReserved9() {
        return reserved9;
    }

    public String getReserved10() {
        return reserved10;
    }

    public String getAcname() {
        return acname;
    }

    public String getAs_acname() {
        return as_acname;
    }

    public String getTr_name() {
        return tr_name;
    }

    public String getCorp_cn_name() {
        return corp_cn_name;
    }

    public String getPayamt() {
        return payamt;
    }

    public String getRcvamt() {
        return rcvamt;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    public void setAcno(String acno) {
        this.acno = acno;
    }

    public void setCur_code(String cur_code) {
        this.cur_code = cur_code;
    }

    public void setAs_acno(String as_acno) {
        this.as_acno = as_acno;
    }

    public void setProduct_no(String product_no) {
        this.product_no = product_no;
    }

    public void setSerial_no(String serial_no) {
        this.serial_no = serial_no;
    }

    public void setTr_acdt(String tr_acdt) {
        this.tr_acdt = tr_acdt;
    }

    public void setTr_time(String tr_time) {
        this.tr_time = tr_time;
    }

    public void setTr_type(String tr_type) {
        this.tr_type = tr_type;
    }

    public void setTr_from(String tr_from) {
        this.tr_from = tr_from;
    }

    public void setTr_code(String tr_code) {
        this.tr_code = tr_code;
    }

    public void setCms_corp_no(String cms_corp_no) {
        this.cms_corp_no = cms_corp_no;
    }

    public void setTrans_flag(String trans_flag) {
        this.trans_flag = trans_flag;
    }

    public void setCrdr_flag(String crdr_flag) {
        this.crdr_flag = crdr_flag;
    }

    public void setAmt(Double amt) {
        this.amt = amt;
    }

    public void setFee_amt(Double fee_amt) {
        this.fee_amt = fee_amt;
    }

    public void setSelf_bal(Double self_bal) {
        this.self_bal = self_bal;
    }

    public void setLast_bal(Double last_bal) {
        this.last_bal = last_bal;
    }

    public void setUpp_bal(Double upp_bal) {
        this.upp_bal = upp_bal;
    }

    public void setCert_type(String cert_type) {
        this.cert_type = cert_type;
    }

    public void setCert_batchno(String cert_batchno) {
        this.cert_batchno = cert_batchno;
    }

    public void setCert_no(String cert_no) {
        this.cert_no = cert_no;
    }

    public void setOpp_acno(String opp_acno) {
        this.opp_acno = opp_acno;
    }

    public void setOpp_cur_code(String opp_cur_code) {
        this.opp_cur_code = opp_cur_code;
    }

    public void setOpp_acname(String opp_acname) {
        this.opp_acname = opp_acname;
    }

    public void setOpp_bankname(String opp_bankname) {
        this.opp_bankname = opp_bankname;
    }

    public void setOpp_as_acno(String opp_as_acno) {
        this.opp_as_acno = opp_as_acno;
    }

    public void setOpp_asacname(String opp_asacname) {
        this.opp_asacname = opp_asacname;
    }

    public void setJun_acno(String jun_acno) {
        this.jun_acno = jun_acno;
    }

    public void setJun_cur_code(String jun_cur_code) {
        this.jun_cur_code = jun_cur_code;
    }

    public void setJun_acname(String jun_acname) {
        this.jun_acname = jun_acname;
    }

    public void setUser_no(String user_no) {
        this.user_no = user_no;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public void setPostscript(String postscript) {
        this.postscript = postscript;
    }

    public void setAdjust_flag(String adjust_flag) {
        this.adjust_flag = adjust_flag;
    }

    public void setReserved1(String reserved1) {
        this.reserved1 = reserved1;
    }

    public void setReserved2(String reserved2) {
        this.reserved2 = reserved2;
    }

    public void setReserved3(String reserved3) {
        this.reserved3 = reserved3;
    }

    public void setReserved4(String reserved4) {
        this.reserved4 = reserved4;
    }

    public void setReserved5(String reserved5) {
        this.reserved5 = reserved5;
    }

    public void setReserved6(String reserved6) {
        this.reserved6 = reserved6;
    }

    public void setReserved7(String reserved7) {
        this.reserved7 = reserved7;
    }

    public void setReserved8(String reserved8) {
        this.reserved8 = reserved8;
    }

    public void setReserved9(String reserved9) {
        this.reserved9 = reserved9;
    }

    public void setReserved10(String reserved10) {
        this.reserved10 = reserved10;
    }

    public void setAcname(String acname) {
        this.acname = acname;
    }

    public void setAs_acname(String as_acname) {
        this.as_acname = as_acname;
    }

    public void setTr_name(String tr_name) {
        this.tr_name = tr_name;
    }

    public void setCorp_cn_name(String corp_cn_name) {
        this.corp_cn_name = corp_cn_name;
    }

    public void setPayamt(String payamt) {
        this.payamt = payamt;
    }

    public void setRcvamt(String rcvamt) {
        this.rcvamt = rcvamt;
    }

}
