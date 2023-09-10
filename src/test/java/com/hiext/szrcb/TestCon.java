package com.hiext.szrcb;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;

import com.hiext.szrcb.request.SZCRBRequestUtils;
import com.hiext.szrcb.request.SZRCBConstant;
import com.hiext.szrcb.request.base.BaseResponseHead;
import com.hiext.szrcb.request.body.AccountBalanceParamBody;
import com.hiext.szrcb.request.param.AccountBalanceParam;
import com.hiext.szrcb.request.result.AccountBalanceResult;
import com.hiext.szrcb.result.body.AccountBalanceResultBody;
import com.hiext.szrcb.util.SZRCBSocketClient;
import com.hiext.szrcb.util.SZRCBXmlUtil;

public class TestCon {
    // @Test
    public void testConnent() {
        String host = SZRCBConstant.getServerHost();
        String port = SZRCBConstant.getServerPort();
        AccountBalanceParam baseRequestParam = new AccountBalanceParam();
        AccountBalanceParamBody accountBalanceParam = new AccountBalanceParamBody();
        accountBalanceParam.setAcno("0706678521120100480205");
        baseRequestParam.setBody(accountBalanceParam);
        String xml = SZRCBXmlUtil.toXml(baseRequestParam);
        System.out.println(xml);
        String re = SZRCBSocketClient.post(host, Integer.valueOf(port), xml);
        System.out.println(re);
        AccountBalanceResult baseResponseResult = SZRCBXmlUtil.toBean(re, AccountBalanceResult.class);
        BaseResponseHead baseResponseHead = baseResponseResult.getHead();
        System.out.println(baseResponseHead.getTr_code());

        AccountBalanceResultBody accountBalanceResult = baseResponseResult.getBody();
        System.out.println(accountBalanceResult.getAcname());
        System.out.println(accountBalanceResult.getAcno());
    }

    // @Test
    public void testsss() {
        SZCRBRequestUtils.qrCashInDetailQuery("", "", "", new Date(), new Date());
    }

    public static void main(String[] args) {
        /*
        String str = "boss,jack,marry,jackson";
        String [] array = str.split(",");  //根据,进行拆分
        for(int i=0;i<array.length;i++) {
            System.out.println(array[i]);
        }
        */

        String str1 = "jackson.boss.jack.marr0y..";
        String[] array1 = StringUtils.splitByWholeSeparator(str1, "\\."); // 根据.进行拆分
        System.out.println(array1.length);
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
    }
}
