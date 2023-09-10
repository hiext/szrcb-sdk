package com.hiext.szrcb.result.body;

/**
 * 
 * @author angy
 * * @since 2020/10/30
 */
public class AccountBalanceResultBody {
    private String acno;
    private String cur_code;
    private String acname;
    private Double balance;
    private Double use_balance;
    private Double freeze_bal;

    /**
     * 账号
     * 
     * @return
     */
    public String getAcno() {
        return acno;
    }

    public void setAcno(String acno) {
        this.acno = acno;
    }

    /**
     * 币种
     * 
     * @return
     */
    public String getCur_code() {
        return cur_code;
    }

    public void setCur_code(String cur_code) {
        this.cur_code = cur_code;
    }

    /**
     * 账户名称
     * 
     * @return
     */
    public String getAcname() {
        return acname;
    }

    public void setAcname(String acname) {
        this.acname = acname;
    }

    /**
     * 账户余额
     * 
     * @return
     */
    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    /**
     * 可用余额
     * 
     * @return
     */
    public Double getUse_balance() {
        return use_balance;
    }

    public void setUse_balance(Double use_balance) {
        this.use_balance = use_balance;
    }

    /**
     * 冻结金额
     * 
     * @return
     */
    public Double getFreeze_bal() {
        return freeze_bal;
    }

    public void setFreeze_bal(Double freeze_bal) {
        this.freeze_bal = freeze_bal;
    }
}
