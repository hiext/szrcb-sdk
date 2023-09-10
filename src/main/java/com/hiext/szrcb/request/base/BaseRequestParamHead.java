package com.hiext.szrcb.request.base;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("head")
public class BaseRequestParamHead {
    private String tr_code = "";
    private String req_no = "";
    /**
     * 交易日期
     */
    private String tr_acdt;
    /**
     * 交易时间
     */
    private String tr_time;
    private final String channel = "5";
    private String sign = "0";
    private String file_flag = "0";
    private String reserved = "";

    public BaseRequestParamHead() {
        super();
    }

    public BaseRequestParamHead(String trCode) {
        super();
        this.tr_code = trCode;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("HHmmss");
        Date date = new Date();
        this.tr_acdt = dateFormat.format(date);
        this.req_no = UUID.randomUUID().toString().replace("-", "");
        this.tr_time = dateFormat2.format(date);
    }

    public String getTr_code() {
        return tr_code;
    }

    public void setTr_code(String tr_code) {
        this.tr_code = tr_code;
    }

    public String getReq_no() {
        return req_no;
    }

    public void setReq_no(String req_no) {
        this.req_no = req_no;
    }

    public String getTr_acdt() {

        return tr_acdt;
    }

    public String getTr_time() {
        return tr_time;
    }

    public String getChannel() {
        return channel;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getFile_flag() {
        return file_flag;
    }

    public void setFile_flag(String file_flag) {
        this.file_flag = file_flag;
    }

    public String getReserved() {
        return reserved;
    }

    public void setReserved(String reserved) {
        this.reserved = reserved;
    }

}
