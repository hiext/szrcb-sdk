package com.hiext.szrcb.request.result;

import com.hiext.szrcb.request.base.BaseResponseHead;
import com.hiext.szrcb.result.body.AccountBalanceResultBody;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("ap")
public class AccountBalanceResult {

    @XStreamAlias("head")
    private BaseResponseHead head;
    @XStreamAlias("body")
    private AccountBalanceResultBody body;

    public BaseResponseHead getHead() {
        return head;
    }

    public void setHead(BaseResponseHead head) {
        this.head = head;
    }

    public AccountBalanceResultBody getBody() {
        return body;
    }

    public void setBody(AccountBalanceResultBody body) {
        this.body = body;
    }

}