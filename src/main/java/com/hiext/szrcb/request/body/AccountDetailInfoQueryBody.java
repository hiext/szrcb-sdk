package com.hiext.szrcb.request.body;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * 3.1.2 查询账户明细 (200110)
 *
 * @author angy
 * * @since 2020/11/03
 */
public class AccountDetailInfoQueryBody {
    @NotNull(message = "主体账号 char(35)空限制")
    @Size(max = 35, message = "主体账号 char(35)-长度限制")
    private String acno;
    private final String cur_code = "01";
    @NotNull(message = "起始日期 char(8)空限制")
    @Size(max = 8, message = "起始日期 char(8)-长度限制")
    private String start_date;
    @NotNull(message = "终止日期 char(8)空限制")
    @Size(max = 8, message = "终止日期 char(8)-长度限制")
    private String end_date;

    public String getAcno() {
        return acno;
    }

    public void setAcno(String acno) {
        this.acno = acno;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public String getCur_code() {
        return cur_code;
    }
}
