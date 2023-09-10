package com.hiext.szrcb.util;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class StringUtilsTest {
    public static void main(String[] args) throws UnsupportedEncodingException, IOException {
        String data =
            "serial_no|acno|cur_code|tr_acdt|tr_time|host_serial_no|tr_bankno|acname|opp_acno|opp_cur_code|opp_acname|opp_bankname|opp_bankno|tr_type|csh_dra_flag|bank_flag|area_flag|fee_amt|tr_from|trans_flag|old_serial_no|old_acdt|cash_flag|crdr_flag|amt|balance|last_bal|freeze_amt|cert_type|cert_batchno|cert_no|tr_code|user_no|sub_no|purpose|postscript|tr_timestamp|reserved1|reserved2|tr_bankname|bank_no|bankname|printcount|payamt|rcvamt|receipt_link|caps_amt|record_no|";
        String sp[] = data.split("\\|");
        System.out.println(sp.length);

    }
}
