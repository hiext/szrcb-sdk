package com.hiext.szrcb.request;

import java.util.List;

import org.junit.Test;

import com.hiext.szrcb.TestConstant;
import com.hiext.szrcb.model.SubAccountTradeDetailModel;

public class Test1106 {

    @Test
    public void test() {
//        List<SubAccountTradeDetailModel> ss =
//            SZCRBRequestUtils.subAccountTradeDetail(TestConstant.TEST_MAIN_NO, "00000024", "1", "20201106", "20201106");
        SZCRBRequestUtils.subBalanceQuery("0706678521120100480205", "00000024");
    }

}
