package com.hiext.szrcb.request.body;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class SubAccountTradeDetailQueryBody {
    @NotNull(message = "主体账号 char(35)空限制")
    @Size(max = 35, message = "主体账号 char(35)-长度限制")
    private String acno;
    private final String cur_code = "01";
    private String as_acno;

    private String tr_type;
    @NotNull(message = "开始日期 char(8)空限制")
    @Size(max = 8, message = "开始日期 char(8)-长度限制")
    private String start_date;
    @NotNull(message = "结束日期 char(8)空限制")
    @Size(max = 8, message = "结束日期 char(8)-长度限制")
    private String end_date;

    public String getAcno() {
        return acno;
    }

    public void setAcno(String acno) {
        this.acno = acno;
    }

    public String getCur_code() {
        return cur_code;
    }

    public String getAs_acno() {
        return as_acno;
    }

    public void setAs_acno(String as_acno) {
        this.as_acno = as_acno;
    }

    public String getTr_type() {
        return tr_type;
    }

    public void setTr_type(String tr_type) {
        this.tr_type = tr_type;
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

}
