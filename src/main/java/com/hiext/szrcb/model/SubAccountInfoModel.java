package com.hiext.szrcb.model;

public class SubAccountInfoModel {

    private String stat;
    private String acno;
    private String cur_code;
    private String as_acno;
    private String as_acname;
    private String sup_as_acno;
    private Double exceed_limit;
    private String inherit;
    private String assign_flag;
    private Double self_bal;
    private String accrual_flag;
    private String accrual_mode;
    private String accrual_cyc;
    private Double dr_rate;
    private Double cr_rate;
    private String open_date;
    private String close_date;
    private String acname;
    private String as_level;
    private String pay_mode;
    private String cr_rate_type;
    private String cr_rate_basetype;
    private Double cr_rate_prefer;
    private Double cr_amount_one;
    private Double cr_rate_one;
    private Double cr_amount_two;
    private Double cr_rate_two;
    private Double cr_amount_three;
    private Double cr_rate_three;
    private Double cr_amount_four;
    private Double cr_rate_four;
    private Double cr_amount_five;
    private Double cr_rate_five;
    private String dr_rate_type;
    private String dr_rate_basetype;
    private String dr_rate_prefer;
    private Double dr_amount_one;
    private Double dr_rate_one;
    private Double dr_amount_two;
    private Double dr_rate_two;
    private Double dr_amount_three;
    private Double dr_rate_three;
    private Double dr_amount_four;
    private Double dr_rate_four;
    private Double dr_amount_five;
    private Double dr_rate_five;
    private String sup_as_acname;
    private String cr_prefer_type;
    private String dr_prefer_type;

    /**
     * 状态(C1)
     * 
     * @return string
     */
    public String getStat() {
        return stat;
    }

    /**
     * 账户(C35)
     * 
     * @return string
     */
    public String getAcno() {
        return acno;
    }

    /**
     * 币种(C2)
     * 
     * @return string
     */
    public String getCur_code() {
        return cur_code;
    }

    /**
     * 账簿号(C38)
     * 
     * @return string
     */
    public String getAs_acno() {
        return as_acno;
    }

    /**
     * 账簿名(C140)
     * 
     * @return string
     */
    public String getAs_acname() {
        return as_acname;
    }

    /**
     * 上级账簿号(C140)
     * 
     * @return string
     */
    public String getSup_as_acno() {
        return sup_as_acno;
    }

    /**
     * 超额定支金额(N15,2)
     * 
     * @return string
     */
    public Double getExceed_limit() {
        return exceed_limit;
    }

    /**
     * 是否遵从主账簿计息(C1)
     * 
     * @return string
     */
    public String getInherit() {
        return inherit;
    }

    /**
     * 自动分配(C1)
     * 
     * @return string
     */
    public String getAssign_flag() {
        return assign_flag;
    }

    /**
     * 自身余额(N15,2)
     * 
     * @return string
     */
    public Double getSelf_bal() {
        return self_bal;
    }

    /**
     * 计息标志(C1)
     * 
     * @return string
     */
    public String getAccrual_flag() {
        return accrual_flag;
    }

    /**
     * 计息方式(C1)
     * 
     * @return string
     */
    public String getAccrual_mode() {
        return accrual_mode;
    }

    /**
     * 计息周期(C1)
     * 
     * @return string
     */
    public String getAccrual_cyc() {
        return accrual_cyc;
    }

    /**
     * 借方固定利率(N12,8)
     * 
     * @return double
     */
    public Double getDr_rate() {
        return dr_rate;
    }

    /**
     * 贷方固定利率(N12,8)
     * 
     * @return double
     */
    public Double getCr_rate() {
        return cr_rate;
    }

    /**
     * 开户日期(C8)
     *
     */
    public String getOpen_date() {
        return open_date;
    }

    /**
     * 销户日期(C8)
     * 
    
     */
    public String getClose_date() {
        return close_date;
    }

    /**
     * 账户名(C140)
     * 
    
     */

    public String getAcname() {
        return acname;
    }

    /**
     * 辅助账簿级别(Int)
     * 
    
     */
    public String getAs_level() {
        return as_level;
    }

    /**
     * 支控方式(C1)
     * 
    
     */
    public String getPay_mode() {
        return pay_mode;
    }

    /**
     * 贷方利率类型(C1)
     * 
    
     */
    public String getCr_rate_type() {
        return cr_rate_type;
    }

    /**
     * 贷方浮动基准利率类型(C2)
     * 
    
     */
    public String getCr_rate_basetype() {
        return cr_rate_basetype;
    }

    /**
     * 贷方浮动利率比值(N12,8)
     * 
    
     */
    public Double getCr_rate_prefer() {
        return cr_rate_prefer;
    }

    /**
     * 贷方分段金额1(N15,2)
     * 
    
     */
    public Double getCr_amount_one() {
        return cr_amount_one;
    }

    /**
     * 贷方分段利率1(N12,8)
     * 
    
     */
    public Double getCr_rate_one() {
        return cr_rate_one;
    }

    /**
     * 贷方分段金额2(N15,2)
     * 
    
     */
    public Double getCr_amount_two() {
        return cr_amount_two;
    }

    /**
     * 贷方分段利率2(N12,8)
     * 
    
     */
    public Double getCr_rate_two() {
        return cr_rate_two;
    }

    /**
     * 贷方分段金额3(N15,2)
     * 
    
     */
    public Double getCr_amount_three() {
        return cr_amount_three;
    }

    /**
     * 贷方分段利率3(N12,8)
     *
     */
    public Double getCr_rate_three() {
        return cr_rate_three;
    }

    /**
     * 贷方分段金额4(N15,2)
     *
     */
    public Double getCr_amount_four() {
        return cr_amount_four;
    }

    /**
     * 贷方分段利率4(N12,8)
     *
     */
    public Double getCr_rate_four() {
        return cr_rate_four;
    }

    /**
     * 贷方分段金额5(N15,2)
     * 
    
     */
    public Double getCr_amount_five() {
        return cr_amount_five;
    }

    /**
     * 贷方分段利率5(N12,8)
     * 
    
     */
    public Double getCr_rate_five() {
        return cr_rate_five;
    }

    /**
     * 借方利率类型(C1)
     * 
    
     */
    public String getDr_rate_type() {
        return dr_rate_type;
    }

    /**
     * 借方浮动基准利率类型(C2)
     * 
    
     */
    public String getDr_rate_basetype() {
        return dr_rate_basetype;
    }

    /**
     * 借方浮动比例(N12,8)
     * 
    
     */
    public String getDr_rate_prefer() {
        return dr_rate_prefer;
    }

    /**
     * 借方分段金额1(N15,2)
     * 
    
     */
    public Double getDr_amount_one() {
        return dr_amount_one;
    }

    /**
     * 借方分段利率1(N12,8)
     * 
    
     */
    public Double getDr_rate_one() {
        return dr_rate_one;
    }

    /**
     * 借方分段金额2(N15,2)
     * 
    
     */
    public Double getDr_amount_two() {
        return dr_amount_two;
    }

    /**
     * 借方分段利率2(N12,8)
     * 
    
     */
    public Double getDr_rate_two() {
        return dr_rate_two;
    }

    /**
     * 借方分段金额3(N15,2)
     * 
    
     */
    public Double getDr_amount_three() {
        return dr_amount_three;
    }

    /**
     * 借方分段利率3(N12,8)
     * 
    
     */
    public Double getDr_rate_three() {
        return dr_rate_three;
    }

    /**
     * 借方分段金额4(N15,2)
     * 
    
     */
    public Double getDr_amount_four() {
        return dr_amount_four;
    }

    /**
     * 借方分段利率4(N12,8)
     * 
    
     */
    public Double getDr_rate_four() {
        return dr_rate_four;
    }

    /**
     * 借方分段金额5(N15,2)
     * 
    
     */
    public Double getDr_amount_five() {
        return dr_amount_five;
    }

    /**
     * 借方分段利率5(N12,8)
     * 
    
     */
    public Double getDr_rate_five() {
        return dr_rate_five;
    }

    /**
     * 上级账簿名(C140)
     * 
    
     */
    public String getSup_as_acname() {
        return sup_as_acname;
    }

    /**
     * 贷方浮动利差类型 1-按比例,2-按数值(C1)
     * 
    
     */
    public String getCr_prefer_type() {
        return cr_prefer_type;
    }

    /**
     * 借方浮动利差类型 1-按比例,2-按金额(C1)
     * 
    
     */
    public String getDr_prefer_type() {
        return dr_prefer_type;
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

    public void setAs_acname(String as_acname) {
        this.as_acname = as_acname;
    }

    public void setSup_as_acno(String sup_as_acno) {
        this.sup_as_acno = sup_as_acno;
    }

    public void setExceed_limit(Double exceed_limit) {
        this.exceed_limit = exceed_limit;
    }

    public void setInherit(String inherit) {
        this.inherit = inherit;
    }

    public void setAssign_flag(String assign_flag) {
        this.assign_flag = assign_flag;
    }

    public void setSelf_bal(Double self_bal) {
        this.self_bal = self_bal;
    }

    public void setAccrual_flag(String accrual_flag) {
        this.accrual_flag = accrual_flag;
    }

    public void setAccrual_mode(String accrual_mode) {
        this.accrual_mode = accrual_mode;
    }

    public void setAccrual_cyc(String accrual_cyc) {
        this.accrual_cyc = accrual_cyc;
    }

    public void setDr_rate(Double dr_rate) {
        this.dr_rate = dr_rate;
    }

    public void setCr_rate(Double cr_rate) {
        this.cr_rate = cr_rate;
    }

    public void setOpen_date(String open_date) {
        this.open_date = open_date;
    }

    public void setClose_date(String close_date) {
        this.close_date = close_date;
    }

    public void setAcname(String acname) {
        this.acname = acname;
    }

    public void setAs_level(String as_level) {
        this.as_level = as_level;
    }

    public void setPay_mode(String pay_mode) {
        this.pay_mode = pay_mode;
    }

    public void setCr_rate_type(String cr_rate_type) {
        this.cr_rate_type = cr_rate_type;
    }

    public void setCr_rate_basetype(String cr_rate_basetype) {
        this.cr_rate_basetype = cr_rate_basetype;
    }

    public void setCr_rate_prefer(Double cr_rate_prefer) {
        this.cr_rate_prefer = cr_rate_prefer;
    }

    public void setCr_amount_one(Double cr_amount_one) {
        this.cr_amount_one = cr_amount_one;
    }

    public void setCr_rate_one(Double cr_rate_one) {
        this.cr_rate_one = cr_rate_one;
    }

    public void setCr_amount_two(Double cr_amount_two) {
        this.cr_amount_two = cr_amount_two;
    }

    public void setCr_rate_two(Double cr_rate_two) {
        this.cr_rate_two = cr_rate_two;
    }

    public void setCr_amount_three(Double cr_amount_three) {
        this.cr_amount_three = cr_amount_three;
    }

    public void setCr_rate_three(Double cr_rate_three) {
        this.cr_rate_three = cr_rate_three;
    }

    public void setCr_amount_four(Double cr_amount_four) {
        this.cr_amount_four = cr_amount_four;
    }

    public void setCr_rate_four(Double cr_rate_four) {
        this.cr_rate_four = cr_rate_four;
    }

    public void setCr_amount_five(Double cr_amount_five) {
        this.cr_amount_five = cr_amount_five;
    }

    public void setCr_rate_five(Double cr_rate_five) {
        this.cr_rate_five = cr_rate_five;
    }

    public void setDr_rate_type(String dr_rate_type) {
        this.dr_rate_type = dr_rate_type;
    }

    public void setDr_rate_basetype(String dr_rate_basetype) {
        this.dr_rate_basetype = dr_rate_basetype;
    }

    public void setDr_rate_prefer(String dr_rate_prefer) {
        this.dr_rate_prefer = dr_rate_prefer;
    }

    public void setDr_amount_one(Double dr_amount_one) {
        this.dr_amount_one = dr_amount_one;
    }

    public void setDr_rate_one(Double dr_rate_one) {
        this.dr_rate_one = dr_rate_one;
    }

    public void setDr_amount_two(Double dr_amount_two) {
        this.dr_amount_two = dr_amount_two;
    }

    public void setDr_rate_two(Double dr_rate_two) {
        this.dr_rate_two = dr_rate_two;
    }

    public void setDr_amount_three(Double dr_amount_three) {
        this.dr_amount_three = dr_amount_three;
    }

    public void setDr_rate_three(Double dr_rate_three) {
        this.dr_rate_three = dr_rate_three;
    }

    public void setDr_amount_four(Double dr_amount_four) {
        this.dr_amount_four = dr_amount_four;
    }

    public void setDr_rate_four(Double dr_rate_four) {
        this.dr_rate_four = dr_rate_four;
    }

    public void setDr_amount_five(Double dr_amount_five) {
        this.dr_amount_five = dr_amount_five;
    }

    public void setDr_rate_five(Double dr_rate_five) {
        this.dr_rate_five = dr_rate_five;
    }

    public void setSup_as_acname(String sup_as_acname) {
        this.sup_as_acname = sup_as_acname;
    }

    public void setCr_prefer_type(String cr_prefer_type) {
        this.cr_prefer_type = cr_prefer_type;
    }

    public void setDr_prefer_type(String dr_prefer_type) {
        this.dr_prefer_type = dr_prefer_type;
    }

}
