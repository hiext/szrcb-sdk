package com.hiext.szrcb.request.base;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("head")
public class BaseResponseHead {
    private String tr_code;
    private String cms_corp_no;
    private String user_no;
    private String org_code;
    private String serial_no;
    private String req_no;
    private String tr_acdt;
    private String tr_time;
    private String succ_flag;
    private String ret_code;
    private String ret_info;
    private String ext_info;
    private String file_flag;
    private String reserved;

    public String getTr_code() {
        return tr_code;
    }

    public void setTr_code(String tr_code) {
        this.tr_code = tr_code;
    }

    public String getCms_corp_no() {
        return cms_corp_no;
    }

    public void setCms_corp_no(String cms_corp_no) {
        this.cms_corp_no = cms_corp_no;
    }

    public String getUser_no() {
        return user_no;
    }

    public void setUser_no(String user_no) {
        this.user_no = user_no;
    }

    public String getOrg_code() {
        return org_code;
    }

    public void setOrg_code(String org_code) {
        this.org_code = org_code;
    }

    public String getSerial_no() {
        return serial_no;
    }

    public void setSerial_no(String serial_no) {
        this.serial_no = serial_no;
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

    public void setTr_acdt(String tr_acdt) {
        this.tr_acdt = tr_acdt;
    }

    public String getTr_time() {
        return tr_time;
    }

    public void setTr_time(String tr_time) {
        this.tr_time = tr_time;
    }

    public String getSucc_flag() {
        return succ_flag;
    }

    public void setSucc_flag(String succ_flag) {
        this.succ_flag = succ_flag;
    }

    public String getRet_code() {
        return ret_code;
    }

    public void setRet_code(String ret_code) {
        this.ret_code = ret_code;
    }

    public String getRet_info() {
        return ret_info;
    }

    public void setRet_info(String ret_info) {
        this.ret_info = ret_info;
    }

    public String getExt_info() {
        return ext_info;
    }

    public void setExt_info(String ext_info) {
        this.ext_info = ext_info;
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
