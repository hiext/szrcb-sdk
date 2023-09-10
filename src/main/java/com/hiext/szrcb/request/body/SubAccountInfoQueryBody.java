package com.hiext.szrcb.request.body;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * 
 * @author angy
 * @date 2020/11/02
 */
public class SubAccountInfoQueryBody {
    @NotNull(message = "主体账号 char(35)空限制")
    @Size(max = 35, message = "主体账号 char(35)-长度限制")
    private String acno;
    private final String cur_code = "01";
    private String as_acno = "";

    public String getAcno() {
        return acno;
    }

    public void setAcno(String acno) {
        this.acno = acno;
    }

    public String getAs_acno() {
        return as_acno;
    }

    public void setAs_acno(String as_acno) {
        this.as_acno = as_acno;
    }

    public String getCur_code() {
        return cur_code;
    }

}
