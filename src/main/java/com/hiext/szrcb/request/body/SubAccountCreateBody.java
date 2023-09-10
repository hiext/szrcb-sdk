package com.hiext.szrcb.request.body;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class SubAccountCreateBody {
    @NotNull(message = "主体账号 char(35)空限制")
    @Size(max = 35, message = "主体账号 char(35)-长度限制")
    private String acno;
    @NotNull(message = "子账簿 char(38)空限制")
    @Size(max = 38, message = "子账簿 char(38)-长度限制")
    private final String as_acno = "";
    @NotNull(message = "子账簿名 char(140)空限制")
    @Size(max = 140, message = "子账簿名 char(140)-长度限制")
    private String as_acname = "";

    private final String limit_flag = "123";

    public String getAcno() {
        return acno;
    }

    public void setAcno(String acno) {
        this.acno = acno;
    }

    public String getAs_acno() {
        return as_acno;
    }

    public String getAs_acname() {
        return as_acname;
    }

    public void setAs_acname(String as_acname) {
        this.as_acname = as_acname;
    }

    public String getLimit_flag() {
        return limit_flag;
    }

}
