package com.hiext.szrcb.result.body;

/**
 * 账簿号 账簿名 自身余额 上存余额 可用余额 上日余额 上日可用余额 冻结金额
 * 
 * @author angy
 * * @since 2020/10/30
 */
public class SubBalanceResultBody {

    private int total;

    private int record_num;

    private String serial_record;

    private int field_num;
    private String file_name;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getRecord_num() {
        return record_num;
    }

    public void setRecord_num(int record_num) {
        this.record_num = record_num;
    }

    public String getSerial_record() {
        return serial_record;
    }

    public void setSerial_record(String serial_record) {
        this.serial_record = serial_record;
    }

    public int getField_num() {
        return field_num;
    }

    public void setField_num(int field_num) {
        this.field_num = field_num;
    }

    public String getFile_name() {
        return file_name;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }

}
