package com.hiext.szrcb.request.body;

public class PlatformCashOutBody {
    private String cert_type = "";
    private String cert_no;
    private String pay_acno;
    private String pay_cur_code = "01";
    private String pay_acname;
    private String pay_accaddr;
    private String as_flag = "1";
    private String as_acno;
    private String as_acname;
    private String subject_code;
    private String vir_acno;
    private String vir_acname;
    private String bank_flag;
    private final String area_flag = "1";
    private final String urgency_flag = "0";
    private String rcv_acno;
    private String rcv_cur_code = "01";
    private String rcv_acname;
    private String rcv_bank_no;
    private String rcv_bank_name;
    private final String mobiles = "";
    private final String saverecvinfo_flag = "";
    private final String rcv_accaddr = "";
    private Double amt;
    private String booking_flag = "0";
    private String booking_date = "";
    private String booking_time = "";
    private String delay_flag = "0";
    private String purpose = "出金";
    private String postscript = "";

    public String getCert_type() {
        return cert_type;
    }

    public void setCert_type(String cert_type) {
        this.cert_type = cert_type;
    }

    public String getCert_no() {
        return cert_no;
    }

    public void setCert_no(String cert_no) {
        this.cert_no = cert_no;
    }

    public String getPay_acno() {
        return pay_acno;
    }

    public void setPay_acno(String pay_acno) {
        this.pay_acno = pay_acno;
    }

    public String getPay_cur_code() {
        return pay_cur_code;
    }

    public void setPay_cur_code(String pay_cur_code) {
        this.pay_cur_code = pay_cur_code;
    }

    public String getPay_acname() {
        return pay_acname;
    }

    public void setPay_acname(String pay_acname) {
        this.pay_acname = pay_acname;
    }

    public String getPay_accaddr() {
        return pay_accaddr;
    }

    public void setPay_accaddr(String pay_accaddr) {
        this.pay_accaddr = pay_accaddr;
    }

    public String getAs_flag() {
        return as_flag;
    }

    public void setAs_flag(String as_flag) {
        this.as_flag = as_flag;
    }

    public String getAs_acno() {
        return as_acno;
    }

    public void setAs_acno(String as_acno) {
        this.as_acno = as_acno;
    }

    public String getAs_acname() {
        return as_acname;
    }

    public void setAs_acname(String as_acname) {
        this.as_acname = as_acname;
    }

    public String getSubject_code() {
        return subject_code;
    }

    public void setSubject_code(String subject_code) {
        this.subject_code = subject_code;
    }

    public String getVir_acno() {
        return vir_acno;
    }

    public void setVir_acno(String vir_acno) {
        this.vir_acno = vir_acno;
    }

    public String getVir_acname() {
        return vir_acname;
    }

    public void setVir_acname(String vir_acname) {
        this.vir_acname = vir_acname;
    }

    public String getBank_flag() {
        return bank_flag;
    }

    public void setBank_flag(String bank_flag) {
        this.bank_flag = bank_flag;
    }

    public String getRcv_acno() {
        return rcv_acno;
    }

    public void setRcv_acno(String rcv_acno) {
        this.rcv_acno = rcv_acno;
    }

    public String getRcv_cur_code() {
        return rcv_cur_code;
    }

    public void setRcv_cur_code(String rcv_cur_code) {
        this.rcv_cur_code = rcv_cur_code;
    }

    public String getRcv_acname() {
        return rcv_acname;
    }

    public void setRcv_acname(String rcv_acname) {
        this.rcv_acname = rcv_acname;
    }

    public String getRcv_bank_no() {
        return rcv_bank_no;
    }

    public void setRcv_bank_no(String rcv_bank_no) {
        this.rcv_bank_no = rcv_bank_no;
    }

    public String getRcv_bank_name() {
        return rcv_bank_name;
    }

    public void setRcv_bank_name(String rcv_bank_name) {
        this.rcv_bank_name = rcv_bank_name;
    }

    public String getMobiles() {
        return mobiles;
    }

    public String getSaverecvinfo_flag() {
        return saverecvinfo_flag;
    }

    public String getRcv_accaddr() {
        return rcv_accaddr;
    }

    public Double getAmt() {
        return amt;
    }

    public void setAmt(Double amt) {
        this.amt = amt;
    }

    public String getBooking_flag() {
        return booking_flag;
    }

    public void setBooking_flag(String booking_flag) {
        this.booking_flag = booking_flag;
    }

    public String getBooking_date() {
        return booking_date;
    }

    public void setBooking_date(String booking_date) {
        this.booking_date = booking_date;
    }

    public String getBooking_time() {
        return booking_time;
    }

    public void setBooking_time(String booking_time) {
        this.booking_time = booking_time;
    }

    public String getDelay_flag() {
        return delay_flag;
    }

    public void setDelay_flag(String delay_flag) {
        this.delay_flag = delay_flag;
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

    public String getArea_flag() {
        return area_flag;
    }

    public String getUrgency_flag() {
        return urgency_flag;
    }

}
