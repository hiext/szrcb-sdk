package com.hiext.szrcb.request.result;

import com.hiext.szrcb.request.base.BaseResponseHead;
import com.hiext.szrcb.result.body.AccountDetailInfoResultBody;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("ap")
public class AccountDetailInfoQueryResult {
    @XStreamAlias("head")
    private BaseResponseHead head;
    @XStreamAlias("body")
    private AccountDetailInfoResultBody body;

    public BaseResponseHead getHead() {
        return head;
    }

    public void setHead(BaseResponseHead head) {
        this.head = head;
    }

    public AccountDetailInfoResultBody getBody() {
        return body;
    }

    public void setBody(AccountDetailInfoResultBody body) {
        this.body = body;
    }

}
