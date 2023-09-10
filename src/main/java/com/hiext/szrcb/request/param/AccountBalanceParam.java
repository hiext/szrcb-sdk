package com.hiext.szrcb.request.param;

import com.hiext.szrcb.request.base.BaseRequestParam;
import com.hiext.szrcb.request.base.BaseRequestParamHead;
import com.hiext.szrcb.request.body.AccountBalanceParamBody;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("ap")
public class AccountBalanceParam extends BaseRequestParam {

    @XStreamAlias("head")
    private BaseRequestParamHead head = new BaseRequestParamHead("200108");

    @XStreamAlias("body")
    private AccountBalanceParamBody body;

    @Override
    public String getTr_code() {
        return "200108";
    }

    public BaseRequestParamHead getHead() {
        return head;
    }

    public void setHead(BaseRequestParamHead head) {
        this.head = head;
    }

    public AccountBalanceParamBody getBody() {
        return body;
    }

    public void setBody(AccountBalanceParamBody body) {
        this.body = body;
    }

}
