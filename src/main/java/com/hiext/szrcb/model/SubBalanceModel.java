package com.hiext.szrcb.model;

public class SubBalanceModel {
    /**
     * 账簿号
     */
    private String as_acno;
    /**
     * 账簿名
     */
    private String as_acname;
    /**
     * 自身余额
     */
    private Double self_bal;
    /**
     * 上存余额
     */
    private Double upp_bal;
    /**
     * 可用余额
     */
    private Double use_bal;
    /**
     * 上日余额
     */
    private Double last_bal;
    /**
     * 上日可用余额
     */
    private Double last_usebal;
    /**
     * 冻结金额
     */
    private Double freeze_bal;

    /**
     * 账簿号
     * 
     * @return
     */
    public String getAs_acno() {
        return as_acno;
    }

    public void setAs_acno(String as_acno) {
        this.as_acno = as_acno;
    }

    /**
     * 账簿名
     * 
     * @return
     */
    public String getAs_acname() {
        return as_acname;
    }

    public void setAs_acname(String as_acname) {
        this.as_acname = as_acname;
    }

    /**
     * 自身余额
     * 
     * @return 自身余额
     */
    public Double getSelf_bal() {
        return self_bal;
    }

    public void setSelf_bal(Double self_bal) {
        this.self_bal = self_bal;
    }

    /**
     * 上存余额
     * 
     * @return 上存余额
     */
    public Double getUpp_bal() {
        return upp_bal;
    }

    public void setUpp_bal(Double upp_bal) {
        this.upp_bal = upp_bal;
    }

    /**
     * 可用余额
     * 
     * @return 可用余额
     */
    public Double getUse_bal() {
        return use_bal;
    }

    public void setUse_bal(Double use_bal) {
        this.use_bal = use_bal;
    }

    /**
     * 上日余额
     * 
     * @return 上日余额
     */
    public Double getLast_bal() {
        return last_bal;
    }

    public void setLast_bal(Double last_bal) {
        this.last_bal = last_bal;
    }

    /**
     * 上日可用余额
     */
    public Double getLast_usebal() {
        return last_usebal;
    }

    public void setLast_usebal(Double last_usebal) {
        this.last_usebal = last_usebal;
    }

    /**
     * 冻结金额
     */
    public Double getFreeze_bal() {
        return freeze_bal;
    }

    public void setFreeze_bal(Double freeze_bal) {
        this.freeze_bal = freeze_bal;
    }

}
