package com.hiext.szrcb.request.result;

import com.hiext.szrcb.request.base.BaseResponseHead;
import com.hiext.szrcb.result.body.SubBalanceResultBody;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("ap")
public class SubBalanceResult {
    @XStreamAlias("head")
    private BaseResponseHead head;
    @XStreamAlias("body")
    private SubBalanceResultBody body;

    public BaseResponseHead getHead() {
        return head;
    }

    public void setHead(BaseResponseHead head) {
        this.head = head;
    }

    public SubBalanceResultBody getBody() {
        return body;
    }

    public void setBody(SubBalanceResultBody body) {
        this.body = body;
    }
}
