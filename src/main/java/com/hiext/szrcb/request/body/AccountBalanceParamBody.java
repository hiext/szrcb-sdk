package com.hiext.szrcb.request.body;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * 3.1.1 查询账户核心余额 (200108)
 * 
 * @author angy
 * * @since 2020/11/03
 */
public class AccountBalanceParamBody {
    @NotNull(message = "主体账号 char(35)空限制")
    @Size(max = 35, message = "主体账号 char(35)-长度限制")
    private String acno;
    private final String cur_code = "01";

    public String getAcno() {
        return acno;
    }

    public void setAcno(String acno) {
        this.acno = acno;
    }

    public String getCur_code() {
        return cur_code;
    }

}
