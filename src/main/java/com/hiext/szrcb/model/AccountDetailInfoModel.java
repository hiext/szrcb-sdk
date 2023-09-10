package com.hiext.szrcb.model;

public class AccountDetailInfoModel {
    /**
     * 平台流水号（C20）
     */
    private String serial_no;

    /**
     * 账号（C35）
     */
    private String acno;
    /**
     * 货币码（C2）
     */
    private String cur_code;
    /**
     * 交易日期（C8）
     */
    private String tr_acdt;
    /**
     * |交易时间交易日期（C6）
     */
    private String tr_time;
    /**
     * 主机流水号（C20）
     */
    private String host_serial_no;
    /**
     * 交易行号(C12)
     */
    private String tr_bankno;
    /**
     * 户名(C140)
     */
    private String acname;
    /**
     * 对方账号(C35)
     */
    private String opp_acno;
    /**
     * 对方货币码(C2)
     */
    private String opp_cur_code;
    /**
     * 对方账号户名(C140)
     */
    private String opp_acname;
    /**
     * 对方账号开户行(C140)
     */
    private String opp_bankname;
    /**
     * 对方行号(C12)
     */
    private String opp_bankno;
    /**
     * 交易类别(C1)
     */
    private String tr_type;
    /**
     * 钞汇标志(C1)
     */
    private String csh_dra_flag;

    /**
     * 他行标志(C1)
     */
    private String bank_flag;
    /**
     * 同城异地标志(C1)
     */
    private String area_flag;

    /**
     * 手续费(N15,2)
     */
    private Double fee_amt;

    /**
     * 交易来源(C1)
     */
    private String tr_from;

    /**
     * 发生额标志(C1)
     */
    private String trans_flag;
    /**
     * 被冲销流水号(C12)
     */
    private String old_serial_no;
    /**
     * 原交易日期(C8)
     */
    private String old_acdt;
    /**
     * 现转标志(C1)
     */
    private String cash_flag;
    /**
     * 借贷标志(C1)
     */
    private String crdr_flag;

    /**
     * 交易金额(N15,2)
     */
    private Double amt;
    /**
     * 余额(N15,2)
     */
    private Double balance;
    /**
     * 上笔余额(N15,2)
     */
    private Double last_bal;
    /**
     * 冻结金额(N15,2)
     */
    private Double freeze_amt;
    /**
     * 凭证种类(C20)
     */
    private String cert_type;

    /**
     * 凭证批次号(C20)
     */
    private String cert_batchno;
    /**
     * 凭证号码(C20)
     */
    private String cert_no;

    /**
     * 交易码(C6)
     */
    private String tr_code;

    /**
     * 柜员号(C10)
     */
    private String user_no;
    /**
     * 传票号(C20)
     */
    private String sub_no;
    /**
     * 摘要(C60)
     */
    private String purpose;
    /**
     * 附言(C300)
     */
    private String postscript;
    /**
     * 交易时间戳
     */
    private String tr_timestamp;

    /**
     * 备注字段一(C255)
     */
    private String reserved1;
    /**
     * 备注字段二(C255)
     */
    private String reserved2;
    /**
     * 交易行名
     */
    private String tr_bankname;
    /**
     * 支付行号
     */
    private String bank_no;
    /**
     * 支付行名
     */
    private String bankname;
    /**
     * 打印次数
     */
    private String printcount;
    /**
     * 借入金额
     */
    private Double payamt;
    /**
     * 借出金额
     */
    private Double rcvamt;

    /**
     * 平台流水号（C20）
     *
     * @return string
     */
    public String getSerial_no() {
        return serial_no;
    }

    /**
     * 账号（C35）
     *
     * @return string
     */
    public String getAcno() {
        return acno;
    }

    /**
     * 货币码（C2）
     *
     * @return string
     */
    public String getCur_code() {
        return cur_code;
    }

    /**
     * 交易日期（C8）
     *
     * @return string
     */
    public String getTr_acdt() {
        return tr_acdt;
    }

    /**
     * 交易时间交易日期（C6）
     *
     * @return string
     */
    public String getTr_time() {
        return tr_time;
    }

    /**
     * 主机流水号（C20）
     *
     * @return string
     */
    public String getHost_serial_no() {
        return host_serial_no;
    }

    /**
     * 交易行号(C12)
     *
     * @return string
     */
    public String getTr_bankno() {
        return tr_bankno;
    }

    /**
     * 户名(C140)
     *
     * @return string
     */
    public String getAcname() {
        return acname;
    }

    /**
     * 对方账号(C35)
     *
     * @return string
     */
    public String getOpp_acno() {
        return opp_acno;
    }

    /**
     * 对方货币码(C2)
     *
     * @return string
     */
    public String getOpp_cur_code() {
        return opp_cur_code;
    }

    /**
     * |对方账号户名(C140)
     *
     * @return string
     */
    public String getOpp_acname() {
        return opp_acname;
    }

    /**
     * 对方账号开户行(C140)
     *
     * @return string
     */
    public String getOpp_bankname() {
        return opp_bankname;
    }

    /**
     * 对方行号(C12)
     *
     * @return string
     */
    public String getOpp_bankno() {
        return opp_bankno;
    }

    /**
     * 交易类别(C1)
     *
     * @return string
     */
    public String getTr_type() {
        return tr_type;
    }

    /**
     * 钞汇标志(C1)
     *
     * @return string
     */
    public String getCsh_dra_flag() {
        return csh_dra_flag;
    }

    /**
     * 他行标志(C1)
     *
     * @return string
     */
    public String getBank_flag() {
        return bank_flag;
    }

    /**
     * 同城异地标志(C1)
     *
     * @return string
     */
    public String getArea_flag() {
        return area_flag;
    }

    /**
     * 手续费(N15,2)
     *
     * @return string
     */
    public Double getFee_amt() {
        return fee_amt;
    }

    /**
     * 交易来源(C1)
     *
     * @return string
     */
    public String getTr_from() {
        return tr_from;
    }

    /**
     * 发生额标志(C1)
     *
     * @return string
     */
    public String getTrans_flag() {
        return trans_flag;
    }

    /**
     * 被冲销流水号(C12)
     *
     * @return string
     */
    public String getOld_serial_no() {
        return old_serial_no;
    }

    /**
     * 原交易日期(C8)
     *
     * @return string
     */
    public String getOld_acdt() {
        return old_acdt;
    }

    /**
     * 现转标志(C1)
     *
     * @return string
     */
    public String getCash_flag() {
        return cash_flag;
    }

    /**
     * 借贷标志(C1)
     *
     * @return string
     */
    public String getCrdr_flag() {
        return crdr_flag;
    }

    /**
     * 交易金额(N15,2)
     *
     * @return Double
     */
    public Double getAmt() {
        return amt;
    }

    /**
     * 余额(N15,2)
     *
     * @return Double
     */
    public Double getBalance() {
        return balance;
    }

    /**
     * 上笔余额(N15,2)
     *
     * @return Double
     */
    public Double getLast_bal() {
        return last_bal;
    }

    /**
     * 冻结金额(N15,2)
     *
     * @return Double
     */
    public Double getFreeze_amt() {
        return freeze_amt;
    }

    /**
     * 凭证种类(C20)
     *
     * @return string
     */
    public String getCert_type() {
        return cert_type;
    }

    /**
     * 凭证批次号(C20)
     *
     * @return string
     */
    public String getCert_batchno() {
        return cert_batchno;
    }

    /**
     * 凭证号码(C20)
     *
     * @return string
     */
    public String getCert_no() {
        return cert_no;
    }

    /**
     * 交易码(C6)
     *
     * @return string
     */
    public String getTr_code() {
        return tr_code;
    }

    /**
     * 柜员号(C10)
     *
     * @return string
     */
    public String getUser_no() {
        return user_no;
    }

    /**
     * 传票号(C20)
     *
     * @return string
     */
    public String getSub_no() {
        return sub_no;
    }

    /**
     * 摘要(C60)
     *
     * @return string
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * 附言(C300)
     *
     * @return string
     */
    public String getPostscript() {
        return postscript;
    }

    /**
     * 交易时间戳
     *
     * @return string
     */
    public String getTr_timestamp() {
        return tr_timestamp;
    }

    /**
     * 备注字段一(C255)
     *
     * @return string
     */
    public String getReserved1() {
        return reserved1;
    }

    /**
     * 备注字段二(C255)
     *
     * @return string
     */
    public String getReserved2() {
        return reserved2;
    }

    /**
     * 交易行名
     *
     * @return string
     */
    public String getTr_bankname() {
        return tr_bankname;
    }

    /**
     * 支付行号
     *
     * @return string
     */
    public String getBank_no() {
        return bank_no;
    }

    /**
     * 支付行名
     *
     * @return string
     */
    public String getBankname() {
        return bankname;
    }

    /**
     * 打印次数
     *
     * @return string
     */
    public String getPrintcount() {
        return printcount;
    }

    /**
     * 借入金额(N15,2)
     *
     * @return string
     */
    public Double getPayamt() {
        return payamt;
    }

    /**
     * 借出金额(N15,2)
     *
     * @return string
     */
    public Double getRcvamt() {
        return rcvamt;
    }

    public void setSerial_no(String serial_no) {
        this.serial_no = serial_no;
    }

    public void setAcno(String acno) {
        this.acno = acno;
    }

    public void setCur_code(String cur_code) {
        this.cur_code = cur_code;
    }

    public void setTr_acdt(String tr_acdt) {
        this.tr_acdt = tr_acdt;
    }

    public void setTr_time(String tr_time) {
        this.tr_time = tr_time;
    }

    public void setHost_serial_no(String host_serial_no) {
        this.host_serial_no = host_serial_no;
    }

    public void setTr_bankno(String tr_bankno) {
        this.tr_bankno = tr_bankno;
    }

    public void setAcname(String acname) {
        this.acname = acname;
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

    public void setOpp_bankno(String opp_bankno) {
        this.opp_bankno = opp_bankno;
    }

    public void setTr_type(String tr_type) {
        this.tr_type = tr_type;
    }

    public void setCsh_dra_flag(String csh_dra_flag) {
        this.csh_dra_flag = csh_dra_flag;
    }

    public void setBank_flag(String bank_flag) {
        this.bank_flag = bank_flag;
    }

    public void setArea_flag(String area_flag) {
        this.area_flag = area_flag;
    }

    public void setFee_amt(Double fee_amt) {
        this.fee_amt = fee_amt;
    }

    public void setTr_from(String tr_from) {
        this.tr_from = tr_from;
    }

    public void setTrans_flag(String trans_flag) {
        this.trans_flag = trans_flag;
    }

    public void setOld_serial_no(String old_serial_no) {
        this.old_serial_no = old_serial_no;
    }

    public void setOld_acdt(String old_acdt) {
        this.old_acdt = old_acdt;
    }

    public void setCash_flag(String cash_flag) {
        this.cash_flag = cash_flag;
    }

    public void setCrdr_flag(String crdr_flag) {
        this.crdr_flag = crdr_flag;
    }

    public void setAmt(Double amt) {
        this.amt = amt;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void setLast_bal(Double last_bal) {
        this.last_bal = last_bal;
    }

    public void setFreeze_amt(Double freeze_amt) {
        this.freeze_amt = freeze_amt;
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

    public void setTr_code(String tr_code) {
        this.tr_code = tr_code;
    }

    public void setUser_no(String user_no) {
        this.user_no = user_no;
    }

    public void setSub_no(String sub_no) {
        this.sub_no = sub_no;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public void setPostscript(String postscript) {
        this.postscript = postscript;
    }

    public void setTr_timestamp(String tr_timestamp) {
        this.tr_timestamp = tr_timestamp;
    }

    public void setReserved1(String reserved1) {
        this.reserved1 = reserved1;
    }

    public void setReserved2(String reserved2) {
        this.reserved2 = reserved2;
    }

    public void setTr_bankname(String tr_bankname) {
        this.tr_bankname = tr_bankname;
    }

    public void setBank_no(String bank_no) {
        this.bank_no = bank_no;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public void setPrintcount(String printcount) {
        this.printcount = printcount;
    }

    public void setPayamt(Double payamt) {
        this.payamt = payamt;
    }

    public void setRcvamt(Double rcvamt) {
        this.rcvamt = rcvamt;
    }

}
