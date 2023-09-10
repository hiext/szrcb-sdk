package com.hiext.szrcb;

import java.util.List;
import java.util.UUID;

import org.apache.logging.log4j.core.util.UuidUtil;
import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.hiext.szrcb.model.SubAccountTradeDetailModel;
import com.hiext.szrcb.model.SubBalanceModel;
import com.hiext.szrcb.request.SZCRBRequestUtils;
import com.hiext.szrcb.request.body.PlatformCashOutBody;
import com.hiext.szrcb.request.body.SubTransferBody;
import com.hiext.szrcb.request.result.PlatformCashOutResult;
import com.hiext.szrcb.request.result.SubTransferResult;
import com.hiext.szrcb.result.body.TradeStatusResultBody;

public class Test20201106 {
    // @Test
    public void tessbvans() {
        // List<SubAccountTradeDetailModel> s =
        // SZCRBRequestUtils.subAccountTradeDetail("0706678521120100480205", "", "", "20201106", "20201106");
        // System.out.println(JSON.toJSON(s));
        SubTransferBody subTransferBody = new SubTransferBody();
        subTransferBody.setAcname("德尔未来科技控股集团股份有限公司");
        subTransferBody.setAcno("0706678521120100480205");
        subTransferBody.setIn_as_acname("农行上海");
        subTransferBody.setIn_as_acno("00000025");
        subTransferBody.setOut_as_acname("昌平");
        subTransferBody.setOut_as_acno("00000024");
        subTransferBody.setPostscript("测试");
        subTransferBody.setPurpose("2020110601556");
        subTransferBody.setAmt(880000.0);

        SubTransferResult ss = SZCRBRequestUtils.subTransfer(subTransferBody, "120.53.108.30", "10010", "003");
        System.out.println(JSON.toJSONString(ss));
    }

    // @Test
    public void testSubBookDetail() {
        List<SubAccountTradeDetailModel> s =
            SZCRBRequestUtils.subAccountTradeDetail("0706678521120100480205", "", "", "20201101", "20201109");
        System.out.println(JSON.toJSON(s));
    }

    @Test
    public void testSubBookBalance() {
        SubBalanceModel s =
            SZCRBRequestUtils.subBalanceQuery("0706678521120100480205", "00000026", "120.53.108.30", "10010", "003");
        System.out.println(JSON.toJSON(s));
    }

    // @Test
    public void testCashOut() {
        // SubBalanceResultBody s =
        // SZCRBRequestUtils.subBalanceQuery("0706678521120100480205", "00000024", "120.53.108.30", "10010", "003");
        // System.out.println(JSON.toJSON(s));
        PlatformCashOutBody cashOutBody = new PlatformCashOutBody();
        cashOutBody.setAmt(100.0);
        String uuid = UuidUtil.getTimeBasedUuid().toString().replace("-", "").substring(7);
        cashOutBody.setCert_no(uuid);
        cashOutBody.setPay_acno("0706678521120100480205");
        cashOutBody.setAs_acname("农行上海");
        cashOutBody.setAs_acno("00000025");
        cashOutBody.setAs_flag("1");
        cashOutBody.setBank_flag("0");
        cashOutBody.setPay_acname("德尔未来科技控股集团股份有限公司");
        cashOutBody.setPostscript("测测");
        cashOutBody.setPurpose("测试出金");
        cashOutBody.setRcv_cur_code("01");
        cashOutBody.setRcv_bank_name("苏州农商银行");
        cashOutBody.setRcv_acno("0706678011120100300298");
        cashOutBody.setRcv_acname("吴江市天海进出口有限公司");
        PlatformCashOutResult platformCashOutResult =
            SZCRBRequestUtils.cashOut(cashOutBody, "120.53.108.30", "10010", "003");
        System.out.println(JSON.toJSONString(platformCashOutResult));
        // 1225d11eba8a4a85e45563a62
    }

    //
    // @Test
    public void testCashOut2() {
        // SubBalanceResultBody s =
        // SZCRBRequestUtils.subBalanceQuery("0706678521120100480205", "00000024", "120.53.108.30", "10010", "003");
        // System.out.println(JSON.toJSON(s));
        PlatformCashOutBody cashOutBody = new PlatformCashOutBody();
        cashOutBody.setAmt(1002.02);
        String uuid = UuidUtil.getTimeBasedUuid().toString().replace("-", "").substring(7);
        cashOutBody.setCert_no(uuid);
        cashOutBody.setPay_acno("0706678521120100480205");
        cashOutBody.setAs_acname("农行上海");
        cashOutBody.setAs_acno("00000025");
        cashOutBody.setAs_flag("1");
        cashOutBody.setBank_flag("1");
        cashOutBody.setPay_acname("德尔未来科技控股集团股份有限公司");
        cashOutBody.setPostscript("测测");
        cashOutBody.setPurpose("测试出金");
        cashOutBody.setRcv_cur_code("01");
        cashOutBody.setRcv_bank_name("吴江中银富登村镇银行");
        cashOutBody.setRcv_acno("6213560340900249454");
        cashOutBody.setRcv_acname("皇甫金英");
        cashOutBody.setRcv_bank_no("320305400013");
        PlatformCashOutResult platformCashOutResult =
            SZCRBRequestUtils.cashOut(cashOutBody, "120.53.108.30", "10010", "003");
        System.out.println(JSON.toJSONString(platformCashOutResult));

        // 1226011eba420a85e45563a62
    }

    // @Test
    public void testTradeStatusQuery() {
        TradeStatusResultBody body =
            SZCRBRequestUtils.tradeStatusQuery("1225d11eba8a4a85e45563a62", "120.53.108.30", "10010", "003");
        System.out.println(JSON.toJSONString(body));
    }

    // @Test
    public void testTradeStatusQuery2() {
        TradeStatusResultBody body =
            SZCRBRequestUtils.tradeStatusQuery("TA523235955419918336", "120.53.108.30", "10010", "003");
        System.out.println(JSON.toJSONString(body));
    }
}
