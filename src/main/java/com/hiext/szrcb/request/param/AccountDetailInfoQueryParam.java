package com.hiext.szrcb.request.param;

import com.hiext.szrcb.request.base.BaseRequestParam;
import com.hiext.szrcb.request.base.BaseRequestParamHead;
import com.hiext.szrcb.request.body.AccountDetailInfoQueryBody;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 3.1.2 查询账户明细 (200110)
 *
 * @author angy
 * * @since 2020/10/30
 */
@XStreamAlias("ap")
public class AccountDetailInfoQueryParam extends BaseRequestParam {
    @XStreamAlias("head")
    private BaseRequestParamHead head = new BaseRequestParamHead("200110");

    @XStreamAlias("body")
    private AccountDetailInfoQueryBody body;

    @Override
    public String getTr_code() {
        return "200110";
    }

    public BaseRequestParamHead getHead() {
        return head;
    }

    public void setHead(BaseRequestParamHead head) {
        this.head = head;
    }

    public AccountDetailInfoQueryBody getBody() {
        return body;
    }

    public void setBody(AccountDetailInfoQueryBody body) {
        this.body = body;
    }

}
