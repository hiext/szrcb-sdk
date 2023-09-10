package com.hiext.szrcb.request;

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.hiext.szrcb.TestConstant;
import com.hiext.szrcb.model.AccountDetailInfoModel;
import com.hiext.szrcb.model.SubAccountInfoModel;
import com.hiext.szrcb.model.SubAccountTradeDetailModel;
import com.hiext.szrcb.model.SubBalanceModel;
import com.hiext.szrcb.result.body.AccountBalanceResultBody;
import com.hiext.szrcb.result.body.SubAccountCreateResultBody;
import com.hiext.szrcb.result.body.SubBalanceResultBody;

public class SZCRBRequestUtilsTest {

    // @Test
    public void testGetAccountMainBanlance() {
        AccountBalanceResultBody accountBalanceResultBody =
            SZCRBRequestUtils.getAccountMainBanlance("0706678521120100480205");
        if (accountBalanceResultBody == null)
            fail("Not yet implemented");

    }

    @Test
    public void testGetAccountDetailInfo() {
        List<AccountDetailInfoModel> accountBalanceResultBody =
            SZCRBRequestUtils.getAccountDetailInfo("0706678521120100480205", "20200910", "20201030");
        if (accountBalanceResultBody == null)
            fail("Not yet implemented");

    }

    /**
     * 070667852112010048020500000001
     * 
     * 070667852112010048020500000002
     */
    // @Test
    public void testSubAccountCreate() {
        SubAccountCreateResultBody body = SZCRBRequestUtils.subAccountCreate("0706678521120100480205", "12345ces");
        if (body == null)
            fail("Not yet implemented");

    }

    @Test
    public void testSubAccountCreate2() {
        SubAccountCreateResultBody body = SZCRBRequestUtils.subAccountCreate("0706678521120100480205", "杭州寒冷的");
        if (body == null)
            fail("Not yet implemented");

    }

    // @Test
    public void testSubAccountInfoQuery() {
        List<SubAccountInfoModel> body =
            SZCRBRequestUtils.subAccountInfoQuery(TestConstant.TEST_MAIN_NO, "070667852112010048020500000021");
        if (body == null)
            fail("Not yet implemented");

    }

    // @Test
    public void testSubBalanceQuery() {
        SubBalanceModel body = SZCRBRequestUtils.subBalanceQuery(TestConstant.TEST_MAIN_NO, "");
        if (body == null)
            fail("Not yet implemented");
        System.out.println(JSON.toJSONString(body));

    }

    @Test
    public void testSubDetailQuery() {
        List<SubAccountTradeDetailModel> body =
            SZCRBRequestUtils.subAccountTradeDetail(TestConstant.TEST_MAIN_NO, "", "", "20200910", "20201030");
        if (body == null)
            fail("Not yet implemented");
        System.out.println(JSON.toJSONString(body));

    }

}
