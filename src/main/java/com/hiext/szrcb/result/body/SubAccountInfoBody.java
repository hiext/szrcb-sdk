package com.hiext.szrcb.result.body;

/**
 * 子账号信息
 * 
 * @author angy
 * @date 2020/10/30
 */
public class SubAccountInfoBody {
    private Integer record_num;
    private Integer field_num;
    private String serial_record;
    private String file_name;
    private String acname;

    public Integer getRecord_num() {
        return record_num;
    }

    public void setRecord_num(Integer record_num) {
        this.record_num = record_num;
    }

    public Integer getField_num() {
        return field_num;
    }

    public void setField_num(Integer field_num) {
        this.field_num = field_num;
    }

    public String getSerial_record() {
        return serial_record;
    }

    public void setSerial_record(String serial_record) {
        this.serial_record = serial_record;
    }

    public String getFile_name() {
        return file_name;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }

    public String getAcname() {
        return acname;
    }

    public void setAcname(String acname) {
        this.acname = acname;
    }

}
