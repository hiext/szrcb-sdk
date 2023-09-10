package com.hiext.szrcb;

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.hiext.szrcb.model.SubAccountTradeDetailModel;
import com.hiext.szrcb.request.SZCRBRequestUtils;

public class Test20201102 {

    @Test
    public void testSubDetailQuery() {
        List<SubAccountTradeDetailModel> body =
            SZCRBRequestUtils.subAccountTradeDetail(TestConstant.TEST_MAIN_NO, "", "", "20200910", "20201103");
        System.out.println(body.size());
        if (body == null)
            fail("Not yet implemented");
        System.out.println(JSON.toJSONString(body));

    }
}
