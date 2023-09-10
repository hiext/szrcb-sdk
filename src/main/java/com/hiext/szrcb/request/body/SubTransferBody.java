package com.hiext.szrcb.request.body;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class SubTransferBody {
    @NotNull(message = "主体账号 char(35)空限制")
    @Size(max = 35, message = "主体账号 char(35)-长度限制")
    private String acno;
    private String cur_code = "01";
    private String acname;
    private String out_as_acno;
    private String out_as_acname;
    private String in_as_acno;
    private String in_as_acname;
    private Double amt;
    private String purpose = "接口默认";
    private String postscript = "附言";

    public String getAcno() {
        return acno;
    }

    public void setAcno(String acno) {
        this.acno = acno;
    }

    public String getCur_code() {
        return cur_code;
    }

    public void setCur_code(String cur_code) {
        this.cur_code = cur_code;
    }

    public String getAcname() {
        return acname;
    }

    public void setAcname(String acname) {
        this.acname = acname;
    }

    public String getOut_as_acno() {
        return out_as_acno;
    }

    public void setOut_as_acno(String out_as_acno) {
        this.out_as_acno = out_as_acno;
    }

    public String getOut_as_acname() {
        return out_as_acname;
    }

    public void setOut_as_acname(String out_as_acname) {
        this.out_as_acname = out_as_acname;
    }

    public String getIn_as_acno() {
        return in_as_acno;
    }

    public void setIn_as_acno(String in_as_acno) {
        this.in_as_acno = in_as_acno;
    }

    public String getIn_as_acname() {
        return in_as_acname;
    }

    public void setIn_as_acname(String in_as_acname) {
        this.in_as_acname = in_as_acname;
    }

    public Double getAmt() {
        return amt;
    }

    public void setAmt(Double amt) {
        this.amt = amt;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getPostscript() {
        return postscript;
    }

    public void setPostscript(String postscript) {
        this.postscript = postscript;
    }

}
